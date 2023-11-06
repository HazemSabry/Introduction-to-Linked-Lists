package Linked_List.Doubly_Linked_List;

public class DNode<Data> {
    private Data data;
    private DNode<Data> prev;
    private DNode<Data> next;

    public DNode(Data data, DNode<Data> prev, DNode<Data> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public DNode<Data> getPrev() {
        return prev;
    }

    public void setPrev(DNode<Data> prev) {
        this.prev = prev;
    }

    public DNode<Data> getNext() {
        return next;
    }

    public void setNext(DNode<Data> next) {
        this.next = next;
    }

}
