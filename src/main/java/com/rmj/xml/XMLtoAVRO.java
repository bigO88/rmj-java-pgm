package com.rmj.xml;


import com.rmj.xml.model.OrderType;
import com.rmj.xml.model.Root;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLtoAVRO {

    public static void main(String args[]) {

        String inFile = "/home/rajjanwa/data/xml/CustomersOrders.xml";

        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            File XMLfile = new File(inFile);

            Root root = (Root)jaxbUnmarshaller.unmarshal(XMLfile);

            for(OrderType order : root.getOrders().getOrder()){
                System.out.println(order.getCustomerID());
            }

        } catch (JAXBException je) {
            System.out.println(je);
        }


    }


}
