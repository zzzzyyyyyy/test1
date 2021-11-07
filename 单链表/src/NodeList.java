public class NodeList<T> {
    private int count = 0;
    private Node<T> head;

    public int getCount() {
        return count;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public NodeList() {
        this.head = new Node(null);
    }

    public NodeList(Node<T> node) {
        this.count = 1;
        this.head = new Node(null, node);
    }

    public void deleteNodeByIndex(int index) {
        if (index == 0 || index > count) {
            System.out.println("您要删除的结点" + index + "不存在，链表中只有" + count + "个结点");
            return;
        }
        Node<T> node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        count--;
    }

    public void insertNodeByIndex(int index, Node<T> newNode) {
        if (index == 0 || index > count) {
            System.out.println("您要插入的结点位置" + index+"不存在，链表中只有" + count + "个结点");
            return;
        }
        Node<T> node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        newNode.next = node.next;
        node.next = newNode;
        count++;
    }
    public void appendNode(Node<T> newNode){
        Node<T> node=head;
        for (int i=1;i<=count;i++){
            node=node.next;
        }
        node.next=newNode;
        newNode.next=null;
        count++;
    }
    public void print(){
        System.out.println("链表中共有"+count+"个结点");
        Node<T> node=head;
        for (int i=1;i<=count;i++){
            node=node.next;
            System.out.println("第"+i+"个结点的值是："+node.data);
        }
    }

}
