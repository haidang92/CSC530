package LinkedList;

public class LinkedList
{
    Node head;
    public boolean isEmpty()
    {
        if(head == null)
            return true;
        return false;
    }
    public void addToIndex(int index, Node e)
    {
        if(index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        if(index == 0)
        {
            e.next = head;
            head = e;
        }
        else
        {
            Node ref = head;
            while (index != 1)
            {
                ref = ref.next;
                index --;
            }
            e.next = ref.next;
            ref.next = e;

        }
    }
    public void addToEnd(Node e)
    {
        if(isEmpty())
        {
            head = e;
        }
        else
        {
            Node ref = head;
            Node last = head;
            while(ref != null)
            {
                last = ref;
                ref = ref.next;
            }
            last.next = e;
        }
    }

    public int size()
    {
        Node ref = head;
        int size = 0;
        while(ref != null)
        {
            ref = ref.next;
            size ++;
        }
        return size;
    }
    public String toString()
    {
        Node ref = head;
        String result = "";
        result += "head-->";
        while(ref != null)
        {
            result += ref.data+"-->";
            ref = ref.next;
        }
        result += "null";
        return result;
    }
}
