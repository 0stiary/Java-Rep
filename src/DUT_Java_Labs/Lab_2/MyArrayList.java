package DUT_Java_Labs.Lab_2;

import java.util.Arrays;

public class MyArrayList<T> {
    private final int size = 4; // размер массива изначальный
    private Object[] arr = new  Object[size]; // создание массива без типа
    private int position = 0; // текущая позиция в массиве

    public void add(T item){
        if(position == arr.length - 1)
            resize(arr.length * 2);
        arr[position++] = item;
    }

    public void remove(int index)
    {
        for (int i = index; i < position; i++) {
            arr[i] = arr[i+1];
        }
        arr[position--] = null;
        if (arr.length > size && position < arr.length / 4 )
            resize(arr.length / 2);

    }

    public int size(){
        return this.position;
    }

    public boolean contains(T Titem){
        for (Object item : arr) {
            if (item.equals(Titem))
                return  true;
        }
        return  false;
    }

    public void showList()
    {
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < position; i++) {
            System.out.printf("\n%d -- %s", i, arr[i].toString());
        }
        System.out.println("\n\n--------------------------------------------------------------------------------");
    }

    private void resize(int newLength)
    {
        Object[] temp = Arrays.copyOf(arr, newLength);
        arr = temp;

        temp = null;
        System.gc();
    }


}
