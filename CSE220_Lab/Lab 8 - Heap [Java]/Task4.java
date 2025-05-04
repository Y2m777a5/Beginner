public class Task4 {
    private MaxHeap maxheap;
    private int[] arr;
    private int m;
    
    public Task4(int[] nums, int k){
        maxheap = new MaxHeap(nums.length);
        arr = new int[k];
        for(int i=0; i<nums.length; i++){
            maxheap.insert(nums[i]);
        }
        for(int i=0; i<k; i++){
            arr[i]=maxheap.extractMax();
        }
        m=k;
    }

    public void printTask4(){
        for(int i=0; i < m; i++){
            if(i==0){
                System.out.print("["+arr[i]);
            }
            else{
                System.out.print(", "+arr[i]);
            }
        }
        System.out.println("]");
    }
}
