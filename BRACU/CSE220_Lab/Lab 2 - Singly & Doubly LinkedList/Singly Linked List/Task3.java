public class Task3 {
    public static Node idGenerator(Node head1, Node head2, Node head3) {
        
        //TO DO
        //Hint: the Node elements are actually Object, you can type cast them
        //      into int or Integer like the following:
        //        (int)n.elem  or  (Integer)n.elem
        Node head11 = new Node(head1.elem,null);
        Node temp1 = head1.next;
        while(temp1!=null){
            Node n = new Node(temp1.elem, head11);
            head11 = n;
            temp1 = temp1.next;
        }
        int [] arr= new int [4];
        int i=0;
        while(head2!=null && head3!=null){
            if((int)head2.elem+(int)head3.elem<10){
                arr[i] = (int)head2.elem+(int)head3.elem;
            }
            else{
                int temp = ((int)head2.elem+(int)head3.elem)%10;
                arr[i] = temp; 
            }
            i++;
            head2 = head2.next;
            head3 = head3.next;
        }
        Node head23 = new Node( arr[0] );
        Node N = head23;
        for ( i=1; i<arr.length; i++ ){
            Node newN = new Node( arr[i] );
            N.next = newN;
            N = N.next;
        }
        Node h1=head11;
        while(h1.next!=null){
            h1=h1.next;
        }
        h1.next=head23;
        return head11; // Remove this when you're ready to return the new head
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{0, 3, 2, 2});
        Node head2 = LinkedList.createList(new Integer[]{5, 2, 2, 1});
        Node head3 = LinkedList.createList(new Integer[]{4, 3, 2, 1});

        System.out.print("LinkedList#1:  ");
        LinkedList.printLL(head1); // This should print 0 -> 3 -> 2 -> 2

        System.out.print("LinkedList#2:  ");
        LinkedList.printLL(head2); // This should print 5 -> 2 -> 2 -> 1

        System.out.print("LinkedList#3:  ");
        LinkedList.printLL(head3); // This should print 4 -> 3 -> 2 -> 1

        Node result = Task3.idGenerator(head1, head2, head3);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result); // This should print 2 -> 2 -> 3 -> 0 -> 9 -> 5 -> 4 -> 2

        System.out.println("\n=========Test Case 2=============");
        Node head4 = LinkedList.createList(new Integer[]{0, 3, 9, 1});
        Node head5 = LinkedList.createList(new Integer[]{3, 6, 5, 7});
        Node head6 = LinkedList.createList(new Integer[]{2, 4, 3, 8});

        System.out.print("LinkedList#4:  ");
        LinkedList.printLL(head4); // This should print 0 -> 3 -> 9 -> 1

        System.out.print("LinkedList#5:  ");
        LinkedList.printLL(head5); // This should print 3 -> 6 -> 5 -> 7

        System.out.print("LinkedList#6:  ");
        LinkedList.printLL(head6); // This should print 2 -> 4 -> 3 -> 8

        Node result2 = Task3.idGenerator(head4, head5, head6);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result2); // This should print 1 -> 9 -> 3 -> 0 -> 5 -> 0 -> 8 -> 5
    }
}
