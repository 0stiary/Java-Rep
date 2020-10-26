package DUT_Java_Labs.Lab_2_1;
import java.util.Scanner;

public class Control_Key {

    Scanner in = new Scanner(System.in);
    int thing;
    
    
    
    public void readKlava(MyLinkedList linkedList){
        System.out.print( "1 - Add to LinkedList\n" +
                "2 - Remove from LinkedList (by position)\n" +
                "3 - If contains in LinkedList\n" +
                "0 - Exit\n");
        while (true)
        {
            boolean inte = false;

            while(!inte)
            {
                try {
                    System.out.print("\n\nAction -->");
                    thing = Integer.parseInt(in.nextLine());
                    inte = true;
                }catch (Exception e)
                {
                    inte = false;
                }

            }

            switch (thing){
                case 1:
                    System.out.print("Add to last position in LinkedList --> ");
                    String check = in.nextLine();
                    if(check != null && !check.equals(""))
                        linkedList.add(check);
                    break;
                case 2:
                    try {
                        System.out.print("Remove in LinkedList item from position  --> ");
                        int pos = Integer.parseInt(in.nextLine());
                        if (linkedList.isInRange(pos)){
                            linkedList.remove(pos);
                        }
                    }catch (Exception e) { }
                    break;
                case 3:
                    System.out.print("Is LinkedList contains this thing? --> ");
                    System.out.print("--> Answer --> " + linkedList.contains(in.nextLine()));
                    break;
            }
            if (thing == 0)
                break;
            linkedList.showList();

        }
    }


    public Control_Key(MyLinkedList linkedList)
    {
        readKlava(linkedList);
    }
}
