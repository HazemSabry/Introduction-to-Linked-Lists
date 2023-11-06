package Linked_List.Doubly_Linked_List;

public class DNode<DataType> {
    private DataType data;
    private DNode<DataType> prev;
    private DNode<DataType> next;

    public DNode(DataType data, DNode<DataType> prev, DNode<DataType> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public DataType getData() {
        return data;
    }

    public void setData(DataType data) {
        this.data = data;
    }

    public DNode<DataType> getPrev() {
        return prev;
    }

    public void setPrev(DNode<DataType> prev) {
        this.prev = prev;
    }

    public DNode<DataType> getNext() {
        return next;
    }

    public void setNext(DNode<DataType> next) {
        this.next = next;
    }

}
