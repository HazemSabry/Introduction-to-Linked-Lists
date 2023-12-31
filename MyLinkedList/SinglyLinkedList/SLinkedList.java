package MyLinkedList.SinglyLinkedList;

import MyLinkedList.ILinkedList;

public class SLinkedList <DataType> implements ILinkedList<DataType> {
    private SNode<DataType> header;
    private int size;

    public SLinkedList(){
        this.header = new SNode<DataType>(null, null);
        this.size = 0;
    }

    @Override
    public void add(int index, DataType element) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size) throw new IndexOutOfBoundsException("Error");
        SNode<DataType> p = this.header;
        for (int i = 0 ; i < index; i++) p = p.getNext();
        SNode<DataType> newNode = new SNode<DataType>(element, p.getNext());
        p.setNext(newNode);
        this.size++;
    }

    @Override
    public void add(DataType element) {
        SNode<DataType> p = this.header;
        while (p.getNext() != null) p = p.getNext();
        SNode<DataType> newNode = new SNode<DataType>(element, p.getNext());
        p.setNext(newNode);
        this.size++;
    }

    @Override
    public void clear() {
        this.header.setNext(null);
        this.size = 0;
    }

    @Override
    public boolean contains(DataType o) {
        SNode<DataType> p = this.header;
        while (p.getNext() != null) {
            p = p.getNext();
            if(p.getData() == o) return true;
        }
        return false;
    }

    @Override
    public DataType get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size)throw new IndexOutOfBoundsException("Error");
        SNode<DataType> p = this.header;
        for (int i = 0; i <= index; i++) p = p.getNext();
        return p.getData();
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size) throw new IndexOutOfBoundsException("Error");
        SNode<DataType> p = this.header;
        for (int i = 0; i < index ; i++) p = p.getNext();
        p.setNext(p.getNext().getNext());
    }

    @Override
    public void set(int index, DataType element) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size) throw new IndexOutOfBoundsException("Error");
        SNode<DataType> p = this.header;
        for (int i = 0; i <= index; i++) p = p.getNext();
        p.setData(element);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public ILinkedList<DataType> sublist(int fromIndex, int toIndex) throws IndexOutOfBoundsException{
        if (fromIndex < 0 || fromIndex > toIndex || toIndex >= this.size) throw new IndexOutOfBoundsException("Error");
        SNode<DataType> p = this.header;
        for (int i = 0; i <= fromIndex; i++) p = p.getNext();
        SLinkedList<DataType> subList = new SLinkedList<DataType>();
        for (int i = fromIndex; i <= toIndex; i++) {
            subList.add(p.getData());
            p = p.getNext();
        }
        return subList;
    }

    public void printList(){
        SNode<DataType> p = this.header;
        System.out.print("[");
        while (p.getNext() != null) {
            p = p.getNext();
            System.out.print(p.getData());
            if(p.getNext() != null) System.out.print(", ");
        }
        System.out.print("]");
    }
}
