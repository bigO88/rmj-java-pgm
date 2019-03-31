package com.rmj.pgm;

import micronet.annotation.MessageListener;
import micronet.annotation.MessageService;
import micronet.annotation.OnStart;
import micronet.network.Context;
import micronet.network.Request;

@MessageService(uri = "mn://rmj-java-pgm")
public class rmj-java-pgm {
	
	@OnStart
	public void onStart(Context context) {
		System.out.println("rmj-java-pgm Start Routine...");
		context.sendRequest("mn://rmj-java-pgm/hello/world/handler", new Request("Hello"));
	}
	
	@MessageListener(uri="/hello/world/handler")
	public void helloHandler(Context context, Request request) {
		System.out.println(request.getData() + " World MicroNet...");
	}
}

