package DUT_Java_Labs.Lab_2_1;


public class Main {

    public static void main(String[] args) {

        SerializtionUtil util = new SerializtionUtil();

        //MyLinkedList linkedList = new MyLinkedList();
        MyLinkedList linkedList = util.deserialization();

        linkedList.add("ergehethe");
        linkedList.add("2542452");
        linkedList.add("1241345");
        linkedList.add("135пкпкук");
        linkedList.add("bwetdddgt");
        linkedList.add("8o6lyhm");
        linkedList.add("90876mmnhtr");
        linkedList.add("er erbg3ergegehethe");
        Control_Key controlKey  = new Control_Key(linkedList);

        util.serializtion(linkedList);

    }

}

