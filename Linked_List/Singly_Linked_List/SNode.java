package Linked_List.Singly_Linked_List;

public class SNode <DataType>{
    private DataType data;
    private SNode<DataType> next;

    public SNode(DataType data, SNode<DataType> next){
        this.data = data;
        this.next = next;
    }

    public DataType getData() {
        return data;
    }

    public void setData(DataType data) {
        this.data = data;
    }

    public SNode<DataType> getNext() {
        return next;
    }

    public void setNext(SNode<DataType> next) {
        this.next = next;
    }

}