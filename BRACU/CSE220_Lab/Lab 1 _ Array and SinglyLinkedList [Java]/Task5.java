public class Task5 {
    public static int sumDist(Node head, Integer[] distArr) {
        // To Do
        int i=0, sum=0, count=0;
        Node n=head;
        while(n!=null){
            n=n.next;
            count++;
        }
        while(i<distArr.length){ // Running an array
            Node temp = head; // All time initializes a Node 
            int j=0;
            if(distArr[i]<count){ // Won't take value if it exceeds Node length;
                while(j<distArr[i]){ // Taking Linked list to the designated address;
                    temp=temp.next;
                    j++;
                }
                sum+=(int)temp.elem;
            }
            else{
                sum+=0;
            }
            i++;
        }
        return sum; // Remove this line.
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
	System.out.print("Given LinkedList: ");
	LinkedList.printLL(head1);
	System.out.print("Distance Array: ");
	Arr.print(dist);
        System.out.println("\nExpected Output: 4");
	int returnedValue = Task5.sumDist(head1, dist);
	System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}
