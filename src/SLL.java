
public class SLL
{

    public Node head;
    private int length;

    public SLL(Node h)
    {
        head = h;
        length = 1;
    }

    public SLL()
    {
        head = null;
        length = 0;
    }
    
    public int length()
    {
        return length;
    }

    public void add(Node n)
    {
        length++;
        if (head == null)
        {
            head = n;
            return;
        }
        Node curr = head;
        while (curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = n;
    }

    public void add(int i)
    {
        add(new Node(i));
    }

    public Node remove()
    {
        Node curr = head;
        if(length == 1)
        {
            head = null;
            length--;
            return curr;
        }
        Node rem;
        for (int i = 0; i < length - 2; i++)
        {
            curr = curr.next;
        }
        rem = curr.next;
        curr.next = null;
        length--;
        return rem;
    }
    
    public void printValues()
    {
        Node curr = head;
        for (int i = 0; i < length - 1; i++)
        {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }
    
    public Node find(int i)
    {
        Node curr = head;
        while(curr != null)
        {
            if(curr.value == i)
            {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }
    
    public Node removeAt(int pos)
    {
        if(pos >= length || pos < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        Node curr, prev;
        if(pos == 0)
        {
            curr = head;
            head = curr.next;
            length--;
            return curr;
        }
        curr = head.next;
        prev = head;
        for(int i = 1; i < pos; i++)
        {
            curr = curr.next;
            prev = prev.next;
        }
        prev.next = curr.next;
        length--;
        return curr;
    }

}
