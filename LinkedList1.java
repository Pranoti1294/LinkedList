import java.util.Scanner;

public class LinkedList1 
{
    static Node head;

    static class Node {
        int data;
        Node next;
        public Node()
        {

        }
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void insertElement(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null ) 
        {
            current = current.next;
        }
        current.next = newNode;

    }

    static void deleteElement(int d) {
        if (head == null) {
            System.out.println("List is empty...");
            return;
        }
    
        if (head.data == d) {
            head = head.next;
            System.out.println("Element " + d + " is deleted.");
            return;
        }
    
        Node current = head;
        while (current.next != null) {
            if (current.next.data == d) {
                current.next = current.next.next;
                System.out.println("Element " + d + " is deleted.");
                return;
            }
            current = current.next;
        }
    
        System.out.println("Element " + d + " not found in the list.");
    }

    static void searchElement(int d)
    {
        if (head == null) 
        {
            System.out.println("List is empty...");
            return;
        }
    
        if (head.data == d) 
        {
            
            System.out.println("Element " + d + " is found.....");
            return;
        }

        Node current = head;
        while (current != null) 
        {
            if (current.data == d) 
            {
                System.out.println("Element " + d + " is found.....");
                return;
            }
            current = current.next;
            
        }

        System.out.println("Element " + d + " is not found.....");
    }

    static void countElement()
    {
        int c = 0;

        if (head == null) 
        {
            System.out.println("List is empty...");
            return;
        }
        Node current = head;
        while (current != null) 
        {
            c++;
            current = current.next;   
        }
        System.out.println("Count of List is : " + c);
    }

    static void sortElement()
    {
        if(head == null)
        {
            System.out.println("Empty list.......");
        }

        Node current = head;

        while (current != null) {
            Node index = current.next;

            while (index != null) 
            {
                if (current.data > index.data) 
                {
                    int temp = current.data;
                    current.data = index.data;
                    index.data = temp; 
                } 

                index = index.next;
            }

            current = current.next;
        }

        System.out.println("Elements are sorted........");
        printElement();
    }
    static void printElement() 
    {
        if (head == null) 
        {
            return;
        }
        Node n = head;
        while (n != null) 
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    static int menulist()
    {
        System.out.println("\n............Linked List Operations...........");
        System.out.println("0.Exit \n1.Insert Element \n2.Delete Element \n3.Count length of Linked List \n4.Sort Elements in List \n5.Print Elements in Linked List \n");
        System.out.print("............Enter choice : ");
       return sc.nextInt();
    }
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {

        menulist();
        int ch , ele;
        while ( (ch = menulist()) !=  0) 
        {
            switch (ch) {
                case 0:
                   
            
                case 1:
                        System.out.println("Enter element to insert : ");
                        ele = sc.nextInt();
                        insertElement(ele);
                        
                    break;

                case 2:
                        System.out.println("Enter element to delete : ");
                        ele = sc.nextInt();
                        deleteElement(ele);
                    break;
                
                case 3:
                        countElement();
                    break;

                case 4:
                        sortElement();

                    break;

                case 5:
                        printElement();
                    break;

            }
            
        } 
      
    }

}
