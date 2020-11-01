package DUT_Java_Labs.Lab_2;

import java.io.*;
import java.util.ArrayList;

public class SerializtionUtil {

    public void serializtion(MyArrayList obj)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Java_JetBrains_Projects\\src\\DUT_Java_Labs\\Lab_2\\data.dat")))
        {
            oos.writeObject(obj);
        }catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }

    public MyArrayList deserialization()
    {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Java_JetBrains_Projects\\src\\DUT_Java_Labs\\Lab_2\\data.dat")))
        {
            return (MyArrayList) ois.readObject();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return null;
    }
}
