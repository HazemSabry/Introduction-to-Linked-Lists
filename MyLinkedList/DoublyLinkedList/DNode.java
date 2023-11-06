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
        return this.data;
    }

    public void setData(DataType data) {
        this.data = data;
    }

    public DNode<DataType> getPrev() {
        return this.prev;
    }

    public void setPrev(DNode<DataType> prev) {
        this.prev = prev;
    }

    public DNode<DataType> getNext() {
        return this.next;
    }

    public void setNext(DNode<DataType> next) {
        this.next = next;
    }

}
