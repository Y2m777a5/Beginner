// Complete the levelSum method
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        //TO DO
        return sum(root, 0); //remove this line
    }

    private static Integer sum(BTNode root, int lvl){
        if(root == null){
            return 0;
        }
        else{
            if(lvl%2==0){
                return sum(root.left, lvl+1)+sum(root.right, lvl+1)-(int)root.elem;
            }
            else{
                return sum(root.left, lvl+1)+sum(root.right, lvl+1)+(int)root.elem;
            }
        }
    }
    //============================================================================

}