public class MinHeap {
    private Integer [] heap;
    private int capacity;
    private int size;
    
    public MinHeap(int capacity){
        this.capacity = capacity+1;
        this.heap = new Integer [this.capacity];
        this.size = 1;
    }

    private void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void swim(int idx) {
        while (idx > 1 && heap[idx] < heap[idx/2]) {
            swap(idx, idx/2);
            idx = idx/2;
        }
    }

    public void insert(int val) {
        if (size == capacity) {
            return;
        }
        heap[size] = val;
        swim(size);
        size++;
    }

    public void sink(int idx){
        int min = idx;
        int left = 2*idx;
        int right = 2*idx + 1;

        if(left < size && heap[min] >= heap[left]){
            min = left;
        }
        if(right < size && heap[min] >= heap[right]){
            min = right;
        }
        if(min != idx){
            swap(idx , min);
            sink(min);
        }
    }

    public int extractMin(){
        if(size == 1){
            throw new IllegalStateException("Heap is empty");
        }
        int min = heap[1];
        heap[1] = heap[size-1];
        size--;
        sink(1);
        return min;
    }

    public void sort(){
        int oSize = size;
        for (int i = size - 1; i > 1; i--) {
            swap(1, i);
            size--;
            sink(1);
        }
        size = oSize;
    }

    public void printHeap(){
        for(int i=1; i< size; i++){
            if(i==1){
                System.out.print("["+heap[i]);
            }
            else{
                System.out.print(", "+heap[i]);
            }
        }
        System.out.println("]");
    }

    public void printSorted(){
        sort();
        for(int i=1; i< size; i++){
            if(i==1){
                System.out.print("["+heap[i]);
            }
            else{
                System.out.print(", "+heap[i]);
            }
        }
        System.out.println("]");
    }
}
