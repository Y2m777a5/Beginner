//Task 02: Container with Most Water
class Task2{

    //Complete this method so that it gives the Expected Output
    public static void mostWater( Integer[] height ){

        //TO DO
        int max_water=0, y=0, xl=0, xr=height.length-1;
        while(xl<xr){ //Taking values from btoh sides of x axis;
            int width = xr-xl;
            if(height[xl]>height[xr]){ //Considering lower values as height so that water lavel doesn't exceed;
               y = height[xr];
               xr--;
            }
            else{
                y = height[xl];
                xl++;
            }
            int water = width*y; //Value of Area;
            if(max_water<water || max_water==0){
                max_water=water;
            }
        }
        System.out.print(max_water);
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
