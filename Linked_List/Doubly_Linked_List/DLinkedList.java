package Linked_List.Doubly_Linked_List;
import Linked_List.ILinkedList;

public class DLinkedList<DataType> implements ILinkedList<DataType> {
    private int size;
    private DNode<DataType> header;
    private DNode<DataType> trailer;

    public DLinkedList(DataType data, DNode<DataType> header, DNode<DataType> trailer) {
        this.size = 0;
        this.header = new DNode<DataType>(null,null,null);
        this.trailer = new DNode<DataType>(null,this.header,null);
        this.header.setNext(trailer);
    }

    @Override
    public void add(int index, DataType element) {
        // TODO Auto-generated method stub

    }

    @Override
    public void add(DataType element) {
        // TODO Auto-generated method stub

    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean contains(DataType o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public DataType get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void remove(int index) {
        // TODO Auto-generated method stub

    }

    @Override
    public void set(int index, DataType element) {
        // TODO Auto-generated method stub

    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ILinkedList<DataType> sublist(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

}
