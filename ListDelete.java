
import java.util.Scanner;

public class ListDelete {

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

public void deleteAtBeginning() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    head = head.next;
}

public void deleteAtEnd() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    // Only one node
    if (head.next == null) {
        head = null;
        return;
    }

    Node temp = head;

    while (temp.next.next != null) {
        temp = temp.next;
    }

    temp.next = null;
}

public void deleteAtPosition(int pos) {

    // delete at beginning
    if (pos == 0) {
        deleteAtBeginning();
        return;
    }

    Node temp = head;

    // move to (pos - 1)th node
    for (int i = 0; i < pos - 1 && temp.next != null; i++) {
        temp = temp.next;
    }

    // if next node exists → delete it
    if (temp.next != null) {
        temp.next = temp.next.next;
    } else {
        System.out.println("Position out of range");
    }
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
        ListDelete list = new ListDelete();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            int val = sc.nextInt();

            System.out.println("1. Insert at front");
            System.out.println("2. Insert at back");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete at front");
            System.out.println("5. Delete at back");
            System.out.println("6. Delete at position");
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
        int pos = sc.nextInt();
        list.insertAtPosition(val, pos);
        break;

    case 4:
        list.deleteAtBeginning();
        break;

    case 5:
        list.deleteAtEnd();
        break;

    case 6:
        System.out.println("enter position to delete: ");
        int dpos = sc.nextInt();
        list.deleteAtPosition(dpos);
        break;

    default:
        System.out.println("Invalid choice");
            }
      }

        System.out.println("\nFinal List:");
        list.printList();
    }
}