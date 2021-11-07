public class test {
    public static void main(String[] args) {
        NodeList<String> list=new NodeList<String>();
        list.appendNode(new Node<String>("String1"));
        list.appendNode(new Node<String>("String2"));
        list.appendNode(new Node<String>("String3"));
        list.insertNodeByIndex(4,new Node<String>("String4"));
        list.print();
        list.insertNodeByIndex(3,new Node<String>("String4"));
        list.deleteNodeByIndex(1);
        list.print();
    }
}
