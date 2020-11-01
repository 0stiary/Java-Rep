package DUT_Java_Labs.Lab_2;

import DUT_Java_Labs.Lab_2_1.MyLinkedList;

public class Main {

    public static void main(String[] args) {

        SerializtionUtil util = new SerializtionUtil();
        //MyArrayList arrayList = new MyArrayList();
        MyArrayList arrayList = util.deserialization();
        Control_Key controlKey  = new Control_Key(arrayList);
        //util.serializtion(arrayList);

    }

}

