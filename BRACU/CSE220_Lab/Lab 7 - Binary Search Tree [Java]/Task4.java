// Complete the sumOfLeaves method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        //TO DO
        return helper(root.left, root.right); // remove this line
    }

    private static Integer helper(BSTNode rl, BSTNode rr){
        if(rl == null || rr==null){
            return 0;
        }
        else{
            return helper(rl.left, rr.right)+rl.elem+rr.elem+helper(rl.right, rr.left);
        }
    }
    //===============================================================


}
