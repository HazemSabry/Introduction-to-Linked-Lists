import MyLinkedList.ILinkedList;

public class DLinkedList<DataType> implements ILinkedList<DataType> {
    private int size;
    private DNode<DataType> header;
    private DNode<DataType> trailer;

    public DLinkedList() {
        this.size = 0;
        this.header = new DNode<DataType>(null,null,null);
        this.trailer = new DNode<DataType>(null,this.header,null);
        this.header.setNext(trailer);
    }

    @Override
    public void add(int index, DataType element) throws IndexOutOfBoundsException {
        if(index < 0 || index >= this.size) throw new IllegalArgumentException("Error");
        if(index < (this.size/2)){
            DNode<DataType> p = this.header;
            for (int i = 0; i < index; i++) p = p.getNext();
            DNode<DataType> newNode = new DNode<DataType>(element, p, p.getNext());
            p.setNext(newNode);
        }else{
            DNode<DataType> p = this.trailer;
            for (int i = this.size; i > index; i--) p = p.getPrev();
            DNode<DataType> newNode = new DNode<DataType>(element, p.getPrev(), p);
            p.setPrev(newNode);
        }
        this.size++;
    }

    @Override
    public void add(DataType element) {
        DNode<DataType> p = this.trailer;
        DNode<DataType> newNode = new DNode<DataType>(element, p.getPrev(), p);
        p.setPrev(newNode);
        this.size++;
    }

    @Override
    public void clear() {
        this.header.setNext(this.trailer);
        this.trailer.setPrev(header);
        this.size = 0;
    }

    @Override
    public boolean contains(DataType o) {
        DNode<DataType> p = this.header.getNext();
        while (p != this.trailer) {
            p = p.getNext();
            if(p.getData() == o) return true;
        }
        return false;
    }

    @Override
    public DataType get(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= this.size) throw new IndexOutOfBoundsException("Error");
        if (index < (this.size/2)){
            DNode<DataType> p = this.header;
            for (int i = 0; i <= index; i++) p = p.getNext();
            return p.getData();
        }else{
            DNode<DataType> p = this.trailer;
            for (int i = this.size; i >= index; i--) p = p.getPrev();
            return p.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= this.size) throw new IndexOutOfBoundsException("Error");
        if( index < (this.size/2)){
            DNode<DataType> p =this.header;
            for (int i = 0; i < index; i++) p = p.getNext();
            p.setNext(p.getNext().getNext());
        }else{
            DNode<DataType> p = this.trailer;
            for (int i = this.size; i > index; i++) p = p.getPrev();
            p.setPrev(p.getPrev().getPrev());
        }
        this.size++;
    }

    @Override
    public void set(int index, DataType element) {
        if(index < 0 || index >= this.size) throw new IndexOutOfBoundsException("Error");
        if(index < (this.size/2)){
            DNode<DataType> p = this.header;
            for (int i = 0; i <= index; i++) p = p.getNext();
            p.setData(element);
        }else{
            DNode<DataType> p = this.trailer;
            for (int i = this.size; i <= index; i++) p = p.getPrev();
            p.setData(element);
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public ILinkedList<DataType> sublist(int fromIndex, int toIndex) throws IndexOutOfBoundsException {
        if(fromIndex < 0 || fromIndex > toIndex || toIndex >= this.size) throw new IndexOutOfBoundsException("Error");
        DNode<DataType> p;
        if(fromIndex < (this.size/2)){
            p = this.header;
            for (int i = 0; i <= fromIndex; i++) p = p.getNext();
        }else{
            p = this.trailer;
            for (int i = this.size; i >= fromIndex; i--) p = p.getPrev();
        }
        ILinkedList<DataType> subList = new DLinkedList<DataType>();
        for (int i = fromIndex; i <= toIndex; i++){
            subList.add(p.getData());
            p = p.getNext();
        }
        return subList;
    }

    public void printList(){
        DNode<DataType> p = this.header;
        System.out.print("[");
        while (p.getNext() != this.trailer) {
            p = p.getNext();
            System.out.print(p.getData());
            if(p.getNext() != this.trailer) System.out.print(", ");
        }
        System.out.print("]");
    }

}
