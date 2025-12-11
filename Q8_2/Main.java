package Q8_2;

public class Main
{
    public static void main(String[] args) {
        OOPLinkedList<String> list = new OOPLinkedList<>();
        list.addItem("Hello");
        list.addItem("World");
        System.out.println(list.getItemAt(0));
        System.out.println(list.getItemAt(1));

    }
}
