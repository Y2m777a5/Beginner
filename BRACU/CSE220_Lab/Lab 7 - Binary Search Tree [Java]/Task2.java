// Complete the sumOfLeaves method
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){
        // TO DO
        if(root.left == null  || root.right == null){
            if(root.elem != key){
                return "No Path Found";
            }
            else{
                return root.elem+"";
            }
        }
        else{
            if(key<root.elem){
                String loc  = findPath(root.left, key);
                if(loc.equals("No Path Found")){
                    return loc;
                }
                else{
                    return root.elem+" "+loc;
                }
            }
            else{
                String loc2 = findPath(root.right, key);
                if(loc2.equals("No Path Found")){
                    return loc2 ;
                }
                else{
                    return root.elem+" "+loc2;
                }
            }
        }
    }
    //============================================================================

}
