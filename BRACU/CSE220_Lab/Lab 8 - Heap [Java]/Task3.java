public class Task3 {
    private MinHeap minheap;

    public Task3(int[] tasks, int m){
        minheap = new MinHeap(m);
        for(int i=0; i<m; i++){
            minheap.insert(0);
        }
        for(int i=0; i<tasks.length; i++){
            int min = minheap.extractMin();
            minheap.insert(min+tasks[i]);
        }
    }

    public void printTask3(){
        minheap.printHeap();
    }
}
