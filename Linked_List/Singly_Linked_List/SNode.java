package Linked_List.Singly_Linked_List;

public class SNode <Data>{
    private Data data;
    private SNode<Data> next;

    public SNode(Data data, SNode<Data> next){
        this.data = data;
        this.next = next;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public SNode<Data> getNext() {
        return next;
    }

    public void setNext(SNode<Data> next) {
        this.next = next;
    }

}