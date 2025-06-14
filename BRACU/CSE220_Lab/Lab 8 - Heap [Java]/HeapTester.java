import java.util.Scanner;
public class HeapTester {
    public static void main (String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Task Number (1-4)/ Press enter to run all: ");
        String input = sc.nextLine();

        if(input.equals("1") || input.equals("")){
            System.out.println("\n---------------Task#1---------------\n");
            task_1();
        }

        if(input.equals("2") || input.equals("")){
            System.out.println("\n---------------Task#2---------------\n");
            task_2();
        }

        if(input.equals("3") || input.equals("")){
            System.out.println("\n---------------Task#3---------------\n");
            System.out.print("Press enter to continue with the sample array/ Enter 'y' to make your own: ");
            String makeArr1 = sc.nextLine().toLowerCase();
            int[] arr;
            if(makeArr1.equals("")){
                arr = new int[] {2,4,7,1,6};
            }
            else{
                System.out.print("Enter total number of tasks: ");
                int n = sc.nextInt();
                arr = new int[n];
                System.out.println("Enter the processing times: ");
                for(int i=0; i<n; i++){
                    System.out.print((i+1)+": ");
                    arr[i] = sc.nextInt();
                }
            }
            System.out.println("\nArray:");
            for(int i=0; i<arr.length; i++){
                if(i==0){
                    System.out.print("["+arr[i]);
                }
                else{
                    System.out.print(", "+arr[i]);
                }
            }
            System.out.println("]");
            System.out.print("\nEnter the number of machines: ");
            int m = sc.nextInt();
            task_3(arr, m);
            sc.nextLine();
        }
        
        if(input.equals("4") || input.equals("")){
            System.out.println("\n---------------Task#4---------------\n");
            System.out.print("Press enter to continue with the sample array/ Enter 'y' to make your own: ");
            String makeArr2 = sc.nextLine().toLowerCase();
            int[] nums;
            if(makeArr2.equals("")){
                nums = new int[] {4,10,2,8,6,7};
            }
            else{
                System.out.print("Enter the length of array: ");
                int elemNum = sc.nextInt();
                nums = new int[elemNum];
                System.out.println("Enter the elements: ");
                for(int i=0; i<elemNum; i++){
                    System.out.print((i+1)+": ");
                    nums[i] = sc.nextInt();
                }
            }
            System.out.println("\nArray:");
            for(int i=0; i<nums.length; i++){
                if(i==0){
                    System.out.print("["+nums[i]);
                }
                else{
                    System.out.print(", "+nums[i]);
                }
            }
            System.out.println("]");
            System.out.print("\nEnter the number of largest elements to find: ");
            int k = sc.nextInt();
            task_4(nums, k);
        }
        System.out.println("\n---------------[THE END]---------------");
        sc.close();
    }

    public static void task_1(){
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(11);
        minHeap.insert(21);
        minHeap.insert(6);
        minHeap.insert(9);
        minHeap.insert(28);
        minHeap.insert(16);

        System.out.println("Heap:");
        minHeap.printHeap();

        System.out.println("\nExtracted min_Heap: \n"+minHeap.extractMin());

        System.out.println("\nAfter extracting min_Heap:");
        minHeap.printHeap();

        System.out.println("\nHeap Sort:");
        minHeap.printSorted();

        System.out.println();
    }

    public static void task_2(){
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(12);
        maxHeap.insert(22);
        maxHeap.insert(8);
        maxHeap.insert(9);
        maxHeap.insert(30);
        maxHeap.insert(15);

        System.out.println("Heap:");
        maxHeap.printHeap();
 
        System.out.println("\nExtracted min_Heap:\n"+maxHeap.extractMax());

        System.out.println("\nAfter extracting min_Heap:");
        maxHeap.printHeap();

        System.out.println("\nHeap Sort:");
        maxHeap.printSorted();

        System.out.println();
    }

    public static void task_3(int[] tasks, int m){
        Task3 t3 = new Task3(tasks, m);

        System.out.println("\nOutput:");
        t3.printTask3();
    }

    public static void task_4(int[] nums, int k){
        Task4 t4 = new Task4(nums,k);

        System.out.println("\nOutput:");
        t4.printTask4();
    }
}
