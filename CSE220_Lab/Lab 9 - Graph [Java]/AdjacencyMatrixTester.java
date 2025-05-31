public class AdjacencyMatrixTester {
    public static void main(String[] agrs){
        int[][] adj_matrix = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 1, 0, 1, 1, 0},
            {0, 1, 0, 1, 0, 0, 0, 1, 0, 1},
            {0, 1, 1, 0, 1, 1, 1, 0, 0, 0},
            {0, 1, 0, 1, 0, 0, 1, 0, 0, 1},
            {0, 1, 0, 1, 0, 0, 1, 1, 1, 0},
            {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 1, 0, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 0, 1, 0, 0},
            {0, 0, 1, 0, 1, 0, 0, 0, 0, 0}
        };

        //print given Adjacency Matrix;
        System.out.println("Given matrix");
        for(int i=1; i<adj_matrix.length; i++){
            for(int j=1; j<adj_matrix[i].length-1; j++){
                System.out.print(adj_matrix[i][j]+", ");
            }
            System.out.println(adj_matrix[i][adj_matrix[i].length-1]);
        }

        System.out.println("\n------------------------------\n");
        
        //Craeting graphUndirect (http://graphonline.top/?graph=vOKKmovfGoGqJmwNZZcst);
        AdjacencyMatrix graphUndirect = new AdjacencyMatrix(10, false);

        graphUndirect.addEdge(1, 2, 1);
        graphUndirect.addEdge(1, 3, 1);
        graphUndirect.addEdge(1, 4, 1);
        graphUndirect.addEdge(1, 5, 1);
        graphUndirect.addEdge(1, 7, 1);
        graphUndirect.addEdge(1, 8, 1);
        graphUndirect.addEdge(2, 3, 1);
        graphUndirect.addEdge(2, 7, 1);
        graphUndirect.addEdge(2, 9, 1);
        graphUndirect.addEdge(3, 4, 1);
        graphUndirect.addEdge(3, 5, 1);
        graphUndirect.addEdge(3, 6, 1);
        graphUndirect.addEdge(4, 6, 1);
        graphUndirect.addEdge(4, 9, 1);
        graphUndirect.addEdge(5, 6, 1);
        graphUndirect.addEdge(5, 7, 1);
        graphUndirect.addEdge(5, 8, 1);
        graphUndirect.addEdge(7, 8, 1);

        System.out.println("Undirected: ");
        graphUndirect.printMatrix(graphUndirect.matrix);

        String t1="task#1";
        printTask(t1);
        int []maxVer = graphUndirect.findMaxVer(graphUndirect.matrix);
        System.out.println("Expected output-\nVertex: 1\nDegree: 6\n");
        System.out.println("Resulted output-\nVertex: "+maxVer[0]+"\nDegree: "+maxVer[1]);
        if(maxVer[0]==1 && maxVer[1]==6) printMatched(t1);
        else printMismatched(t1);



        String t2="task#2";
        printTask(t2);
        int []maxWght = graphUndirect.findMaxWeight(graphUndirect.matrix);
        System.out.println("Expected output-\nVertex: 1\nDegree: 6\n");
        System.out.println("Resulted output-\nVertex: "+maxWght[0]+"\nDegree: "+maxWght[1]);
        if(maxWght[0]==1 && maxWght[1]==6) printMatched(t1);
        else printMismatched(t1);



        //Creating GraphDirect (http://graphonline.top/?graph=vOKKmovfGoGqJmwNZZcst);
        AdjacencyMatrix graphDirect = new AdjacencyMatrix(10, true);

        graphDirect.addEdge(1, 2, 2);
        graphDirect.addEdge(1, 3, 7);
        graphDirect.addEdge(1, 4, 1);
        graphDirect.addEdge(1, 5, 4);
        graphDirect.addEdge(1, 7, 3);
        graphDirect.addEdge(1, 8, 2);
        graphDirect.addEdge(2, 3, 1);
        graphDirect.addEdge(2, 7, 5);
        graphDirect.addEdge(2, 9, 1);
        graphDirect.addEdge(3, 4, 9);
        graphDirect.addEdge(3, 5, 8);
        graphDirect.addEdge(3, 6, 8);
        graphDirect.addEdge(4, 6, 9);
        graphDirect.addEdge(4, 9, 1);
        graphDirect.addEdge(5, 6, 3);
        graphDirect.addEdge(5, 7, 4);
        graphDirect.addEdge(5, 8, 6);
        graphDirect.addEdge(7, 8, 7);

        System.out.println("Directed: ");
        graphDirect.printMatrix(graphDirect.matrix);



        String t3="task#3";
        printTask(t3);

        String test3_1 ="test#1";
        printTest(test3_1);
        maxVer = graphUndirect.findMaxVer(graphDirect.matrix);
        System.out.println("Expected output-\nVertex: 1\nDegree: 6\n");
        System.out.println("Resulted output-\nVertex: "+maxVer[0]+"\nDegree: "+maxVer[1]);
        if(maxVer[0]==1 && maxVer[1]==6) printMatched(t1);
        else printMismatched(t3);

        String test3_2 ="test#2";
        printTest(test3_2);
        maxWght = graphUndirect.findMaxWeight(graphDirect.matrix);
        System.out.println("Expected output-\nVertex: 3\nDegree: 25\n");
        System.out.println("Resulted output-\nVertex: "+maxWght[0]+"\nDegree: "+maxWght[1]);
        if(maxWght[0]==3 && maxWght[1]==25) printMatched(t1);
        else printMismatched(t1);



        String t4="task#4";
        printTask(t4);
        graphDirect.convert(graphDirect.matrix);

        System.out.println("\n\n                       "+"\u001B[37m"+"---[ THE END ]---"+"\u001B[0m"+"                     \n");
    }

    //To change the color of the output; [Inspired by AIB sir]
    static final String green ="\u001B[32m", red ="\u001B[31m",white ="\u001B[37m", magenta ="\033[0;95m";
    static final String bold ="\u001B[1m", underline ="\u001B[4m", regular ="\033[0;0m";

    static String taskSyntx =magenta;
    static String testSyntx =white;
    static String matchedSyntx =green+bold;
    static String mismatchedSyntx =red+bold;
    static String closeSyntx =regular;

    public static void printTask(String task){
        System.out.println(taskSyntx+"\n(-------------------------> "+underline+task+regular+taskSyntx+" <-------------------------)\n"+closeSyntx);
    }

    public static void printTest(String task){
        System.out.println(testSyntx+"   ------------------------ "+underline+task+regular+testSyntx+" ------------------------  "+closeSyntx);
    }

    public static void printMatched(String task){
        System.out.println(matchedSyntx+"\n           [   !!! "+underline+task+" result matched"+regular+matchedSyntx+" !!!   ]       \n"+closeSyntx);
    }

    public static void printMismatched(String task){
        System.out.println(mismatchedSyntx+"\n        [   !!! "+underline+task+" result didn't matched"+regular+mismatchedSyntx+" !!!   ]        \n"+closeSyntx);
    }
}
