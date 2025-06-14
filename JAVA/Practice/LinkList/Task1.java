// Task05: Alternate Merge
public class Task1 {

    public static Node alternateMerge( Node head1){
        
        //You’re NOT ALLOWED to create a new singly linked list for this task

        //TO DO
        Node h1=head1,;
        while(h1!=null){
            Node temp1 = h1.next;
        }
        //remove the following line when returning the Head of the modified LinkedList
        return head1;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{1,2,6,8,11});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        Node result = alternateMerge(head1);
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4
        System.out.println();
        
        System.out.println("\n==============Test Case 2=============");
        head1 = LinkedList.createList(new Integer[]{5,3,2,-4});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        result = alternateMerge(head1);
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 5 -> -4 -> 3 -> -6 -> 2 -> 1 -> -4
        System.out.println();
    }
}
