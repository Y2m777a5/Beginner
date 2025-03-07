// Task04: Word Decoder
public class Task2 {

    public static Node wordDecoder( Node head ){
        
        //You're suppose to create a new Dummy headed Singly Linked List in this method
        //Dummy head is basically a head Node where the elem is null
        // Node dHead = new Node(null, null); here the dHead is a Dummy Head

        //TO DO
        Node temp = head;
        int count = 1;
        while(temp.next!=null){
            count++;
            temp= temp.next;
        }
        int pos = 13%count;
        int i = 1;
        int dcount =0;
        while(i<=count){
            if(i%pos==0){
                dcount++;
            }
            i++;
        }
        i=1;
        int j=0;
        Object [] arr = new Object [dcount];
        while(head!=null){
            if(i%pos==0){
                arr[j] = head.next.elem;
                j++;
            }
            i++;
            head = head.next;
        }
        Node ntemp = new Node( arr[0] );
        Node N = ntemp;
        for ( i=1; i<arr.length; i++ ){
            Node newN = new Node( arr[i] );
            N.next = newN;
            N = N.next;
        }
        i=0;
        Node Dhead = new Node(null, null);
        Node dhead = new Node(ntemp.elem,null);
        Node temp1 = ntemp.next;
        while(temp1!=null){
            Node n = new Node(temp1.elem, dhead);
            dhead = n;
            temp1 = temp1.next;
        }
        Dhead.next = dhead;
        //remove the following line when you're ready to return the new head
        return Dhead;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
