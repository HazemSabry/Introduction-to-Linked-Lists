package Linked_List.Singly_Linked_List;
import Linked_List.ILinkedList;

public class SLinkedList <DataType> implements ILinkedList<DataType> {
    private SNode<DataType> header;
    private int size;

    public SLinkedList(){
        this.header = new SNode<DataType>(null, null);
        this.size = 0;
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
