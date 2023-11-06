package MyLinkedList.SinglyLinkedList;
import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        SLinkedList<Integer> list = new SLinkedList<Integer>();
        String operation;
        int index;
        int element;
        int fromIndex;
        int toIndex;

        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().replaceAll("\\[|\\]", "").split(", ");
        if(!elements[0].equals("")){
            for (String intString : elements) {
                list.add(Integer.parseInt(intString));
            }
        }
        operation = scanner.nextLine();

        switch (operation) {
            case "add":
                try {
                    element = scanner.nextInt();
                    list.add(element);
                    list.printList();
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;

            case "addToIndex":
                try {
                    index = scanner.nextInt();
                    element = scanner.nextInt();
                    list.add(index, element);
                    list.printList();
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;

            case "isEmpty":
                if(list.isEmpty()) System.out.println("True");
                else System.out.println("False");
                break;

            case "set":
                try {
                    index = scanner.nextInt();
                    element = scanner.nextInt();
                    list.set(index, element);
                    list.printList();
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;

            case "get":
                try {
                    index = scanner.nextInt();
                    System.out.println(list.get(index));
                } catch (Exception e) {
                    System.out.println("Error");
                }

                break;

            case "size":
                System.out.println(list.size());
                break;

            case "contains":
                try {
                    element = scanner.nextInt();
                    if (list.contains(element)) System.out.println("True");
                    else System.out.println("False");
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;

            case "sublist":
                try {
                    fromIndex = scanner.nextInt();
                    toIndex = scanner.nextInt();
                    SLinkedList<Integer> subList = (SLinkedList<Integer>)list.sublist(fromIndex, toIndex);
                    subList.printList();
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;

            case "clear":
                list.clear();
                list.printList();
                break;

            case "remove":
                try {
                    element = scanner.nextInt();
                    list.remove(element);
                    list.printList();
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;


            default:
                break;
        }

        scanner.close();
    }
}
