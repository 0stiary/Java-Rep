package DUT_Java_Labs.Lab_2;
import java.util.Scanner;

public class Control_Key {

    Scanner in = new Scanner(System.in);
    int thing;



    public void readKlava(MyArrayList arrayList){
        System.out.print( "1 - Add to ArrayList\n" +
                "2 - Remove from ArrayList (by position)\n" +
                "3 - If contains in ArrayList\n" +
                "0 - Exit\n" +
                "\n--> ");
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
                    System.out.print("Add to last position in ArrayList --> ");
                    arrayList.add(in.nextLine());
                    break;
                case 2:
                    try {
                        System.out.print("Remove in arrayList item from position  --> ");
                        int pos = Integer.parseInt(in.nextLine());
                        if (isInRange(pos, arrayList.size() - 1)){
                            arrayList.remove(pos);
                        }
                    }catch (Exception e) { }
                    break;
                case 3:
                    System.out.print("Is ArrayList contains this thing? --> ");
                    System.out.print("--> Answer --> " + arrayList.contains(in.nextLine()));
                    break;
            }
            if (thing == 0)
                break;
            arrayList.showList();

        }
    }

    public boolean isInRange(int thing, int size)
    {
       return (thing <= size && thing >= 0);
    }

    public Control_Key(MyArrayList arrayList)
    {
        readKlava(arrayList);
    }
}
