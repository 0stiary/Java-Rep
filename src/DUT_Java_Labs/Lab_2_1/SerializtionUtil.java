package DUT_Java_Labs.Lab_2_1;

import DUT_Java_Labs.Lab_2.MyArrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializtionUtil {

    public void serializtion(MyLinkedList obj)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Java_JetBrains_Projects\\src\\DUT_Java_Labs\\Lab_2\\data.dat")))
        {
            oos.writeObject(obj);
        }catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }

    public MyLinkedList deserialization()
    {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Java_JetBrains_Projects\\src\\DUT_Java_Labs\\Lab_2\\data.dat")))
        {
            return (MyLinkedList) ois.readObject();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return null;
    }
}
