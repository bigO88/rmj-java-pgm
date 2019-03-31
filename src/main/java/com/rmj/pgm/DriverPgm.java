package com.rmj.pgm;


import com.rmj.pgm.model.Phone;

import java.util.*;

public class DriverPgm {

    public static void main(String args[]){

        System.out.println("Starting Service");

        List<Phone> phoneList = new ArrayList<Phone>();

        phoneList.add(new Phone("Motorola",23221,3));
        phoneList.add(new Phone("GooglePixel",1231111,4));
        phoneList.add(new Phone("Samsang",32211,3));
        phoneList.add(new Phone("Nokia",451121,4));
        phoneList.add(new Phone("Vivo",12121,2));
        phoneList.add(new Phone("Apple",2231111,5));

        phoneList.forEach( (x) -> System.out.println(x.getModel()) );


        System.out.println("After applying Rating sorting...");

        Collections.sort(phoneList); //.forEach( (x) -> System.out.println(x.getModel()) );


        phoneList.forEach( (x) -> System.out.println(x.getModel()) );



        phoneList.sort(new Comparator<Phone>() {
            @Override
            public int compare(Phone phone, Phone t1) {
                if(phone.getPrice() < t1.getPrice())
                    return 1;
                else
                    return -1;
            }
        });

        System.out.println("After applying price sorting...");

        phoneList.forEach((x) -> System.out.println(x.getModel()));


    }
}
