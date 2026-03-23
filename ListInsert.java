import java.util.Scanner;

public class ListInsert {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
         Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
   public void insertAtPosition(int val, int pos) {
    //front 
    if (pos == 0 || head == null) {
        insertAtBeginning(val);
        return;
    }
    //anywhere
    Node temp = head;

    // Traverse to (pos - 1)th node or last node
    for (int i = 0; i < pos - 1 && temp.next != null; i++) {
        temp = temp.next;
    }

    // Create new node and insert
    Node newNode = new Node(val);
    newNode.next = temp.next;
    temp.next = newNode;
}

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListInsert list = new ListInsert();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            int val = sc.nextInt();

            System.out.println("1. Insert at front");
            System.out.println("2. Insert at back");
            System.out.println("3. Insert at position");
            System.out.print("Enter operation: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    list.insertAtBeginning(val);
                    break;
                case 2:
                    list.insertAtEnd(val);
                    break;
                case 3:
                    System.out.println("enter position to add: ");
                    int pos=sc.nextInt();
                    list.insertAtPosition(val,pos);
                    break;
                default:
                    System.out.println("Invalid choice, inserting at back by default.");
                    list.insertAtEnd(val);
            }
        }

        System.out.println("\nFinal List:");
        list.printList();
    }
}

