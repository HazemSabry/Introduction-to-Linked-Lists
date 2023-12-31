package MyLinkedList;

public interface ILinkedList<DataType> {
    /**
    * Inserts a specified element at the specified position in the list.
    * @param index
    * @param element
    */
    public void add(int index, DataType element);
    /**
    * Inserts the specified element at the end of the list.
    * @param element
    */
    public void add(DataType element);
    /**
    * @param index
    * @return the element at the specified position in this list.
    */
    public DataType get(int index);
    /**
    * Replaces the element at the specified position in this list with the
    * specified element.
    * @param index
    * @param element
    */
    public void set(int index, DataType element);
    /**
    * Removes all of the elements from this list.
    */
    public void clear();
    /**
    * @return true if this list contains no elements.
    */
    public boolean isEmpty();
    /**
    * Removes the element at the specified position in this list.
    * @param index
    */
    public void remove(int index);
    /**
    * @return the number of elements in this list.
    */
    public int size();
    /**
    * @param fromIndex
    * @param toIndex
    * @return a view of the portion of this list between the specified fromIndex
    and toIndex, inclusively.
    */
    public ILinkedList<DataType> sublist(int fromIndex, int toIndex);
    /**
    * @param o
    * @return true if this list contains an element with the same value as the
    specified element.
    */
    public boolean contains(DataType o);
}
