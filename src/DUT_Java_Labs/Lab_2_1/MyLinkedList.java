package DUT_Java_Labs.Lab_2_1;

import java.io.Serializable;

public class MyLinkedList<T> implements Serializable {

    private Node head;
    private Node tail;
    private int N;

    public void add(T item)
    {
        if(!ifIsEmpty())
        {
            Node prev = tail;
            tail = new Node(item);
            prev.next = tail;
        }
        else
        {
            tail = new Node(item);
            head = tail;
        }
        N++;
    }

    public void remove(int index)
    {
        Node current = head;
        for (int i = 1; i < index - 1 ; i++)
        {
            current = current.next;
        }
        Node prev = current.next;
        current.next = prev.next;
        N--;
    }

    public boolean contains(T item)
    {
        Node current = head;

        while(current.next != null || current == tail)
        {
            if (current.data.equals(item))
            {
                return true;
            }
            if (current == tail)
                return false;

            current = current.next;
        }
        return false;
    }

    public boolean isInRange(int index)
    {
        return  index > 0 && index <= N;
    }

    public T view(Node node){
        return node.data;
    }

    public boolean ifIsEmpty()
    {
        return N == 0;
    }

    public void showList()
    {
        if (!ifIsEmpty()) {
            int count = 0;
            Node current = head;

            System.out.println("--------------------------------------------------------------------------------");
            while ((current.next != null || current == tail) && count < N) {
                System.out.printf("\n%d -- %s", count + 1, view(current).toString());
                if (current.next != null)
                    current = current.next;
                count++;
            }
            System.out.println("\n\n--------------------------------------------------------------------------------");
        }
    }


    public MyLinkedList()
    {
        head = tail = null;
        N = 0;
    };

    private class Node implements Serializable{
        private T data;
        private Node next;

        public Node(T data)
        {
            this.data = data;
            next = null;
        }
    }

}
