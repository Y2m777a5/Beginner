// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
            //TO DO
            return (int)root.elem+sum(root.left, 1)+sum(root.right, 1); //remove this line
        }
        
        private static Integer sum(BTNode root, int lvl){
            if(root == null){
                return 0;
            }
            else{
                return sum(root.left, lvl+1)+sum(root.right, lvl+1)+(int)root.elem%lvl;
            }
        }
        //============================================================================

}
