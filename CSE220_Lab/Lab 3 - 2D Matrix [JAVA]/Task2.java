//Task 02: Decryption Process
class Task2{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){

        //For this task you'll need to create new arrays
        //we recommend you to use Integer type.
        //example:  Integer[] array = new Integer[5]
        //TO DO
        int len = matrix[0].length;
        Integer [] array = new Integer[len-1];
        Integer [][]arr=matrix;
        Integer sum1 = 0;
        for(int i=0; i<len;i++){
            Integer sum2 = 0;
                for(int j=0;j<arr.length;j++){
                    sum2+=arr[j][i];
                }
                if(i!=0){
                    array[i-1] = sum2 - sum1;
                }
                sum1 = sum2;
            }
        //DELETE the following return statement when you're ready to return the 2D array
        return array;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}