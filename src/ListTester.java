
public class ListTester
{

    public static void main(String[] args)
    {
        SLL list = new SLL();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(13);
        list.add(21);
        list.add(34);
        list.printValues();
        System.out.println();
        list.remove();
        list.remove();
        list.printValues();
        System.out.println();
        System.out.println(list.find(13));
        System.out.println();
        System.out.println(list.find(50));
        System.out.println();
        System.out.println(list.removeAt(4).value);
        System.out.println();
        list.printValues();
    }

}
