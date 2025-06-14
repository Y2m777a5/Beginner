// Complete the lowestCommonAncestor method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 3 parameter first one is root
    // and second & third parameter are as 2 integers
    // You'll need to find the lowest common ancestor of them and return it
    public static Integer lowestCommonAncestor( BSTNode root, Integer x, Integer y ){
        // TO DO
        if(x>y){
            x+=y;
            x-=y=x-y;
        }
        if(root.left == null || root.right == null){
            return root.elem;
        }
        else{
            Integer ancst = lowestCommonAncestor(root.left, x, y);
            if(root.elem <=y){
                if(root.elem>=x && root.elem<=y){
                    if(ancst<root.elem){
                        ancst = root.elem;
                    }
                }
                ancst = lowestCommonAncestor(root.right, x, y);
                if(root.elem>=x && root.elem<=y){
                    if(ancst>root.elem){
                        ancst = root.elem;
                    }
                }
                return ancst;
            }
            return ancst;
        }
    }
    //==================================================

}
