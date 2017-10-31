
public class Node
{
    public int value;
    public Node next;
    public Node(int i, Node n)
    {
        value = i;
        next = n;
    }
    public Node(int i)
    {
        value = i;
        next = null;
    }
}
