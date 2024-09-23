package EDD;

public class Node {
    private Object data;
    private Node next;


    public Node(Object element) {
        this.data = element;
        this.next = null;
    }

    public Node(Object element, Node nNext){
        this.data = element;
        this.next = nNext;
    }


    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}



