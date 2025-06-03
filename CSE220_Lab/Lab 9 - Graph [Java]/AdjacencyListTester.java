
public class AdjacencyListTester {

    public static void main(String[] agrs){
        System.out.println("\u001B[37m"+"\n----------------[ "+"\u001B[1;104m"+"THE ASSIGNMENT BEGINS HERE"+"\u001B[0m"+"\u001B[37m"+" ]----------------"+"\u001B[0m"+"\n");
        //
        
        //Craeting graphUndirect (http://graphonline.top/?graph=vOKKmovfGoGqJmwNZZcst);
        AdjacencyList graphUndirect = new AdjacencyList(10, false);

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
        graphUndirect.printAdjacencyList(graphUndirect.adjacencyList);



        String t1="task#1";
        printTask(t1);
        int []maxVer = graphUndirect.findMaxVer(graphUndirect.adjacencyList);
        System.out.println("Expected output-\nVertex: 1\nDegree: 6\n");
        System.out.println("Resulted output-\nVertex: "+maxVer[0]+"\nDegree: "+maxVer[1]);
        if(maxVer[0]==1 && maxVer[1]==6) printMatched(t1);
        else printMismatched(t1);



        String t2="task#2";
        printTask(t2);
        int []maxWght = graphUndirect.findMaxWeight(graphUndirect.adjacencyList);
        System.out.println("Expected output-\nVertex: 1\nDegree: 6\n");
        System.out.println("Resulted output-\nVertex: "+maxWght[0]+"\nDegree: "+maxWght[1]);
        if(maxWght[0]==1 && maxWght[1]==6) printMatched(t1);
        else printMismatched(t1);



        //Creating GraphDirect (http://graphonline.top/?graph=vOKKmovfGoGqJmwNZZcst);
        AdjacencyList graphDirect = new AdjacencyList(10, true);

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
        graphDirect.printAdjacencyList(graphDirect.adjacencyList);



        String t3="task#3";
        printTask(t3);

        String test3_1 ="test#1";
        printTest(test3_1);
        maxVer = graphUndirect.findMaxVer(graphDirect.adjacencyList);
        System.out.println("Expected output-\nVertex: 1\nDegree: 6\n");
        System.out.println("Resulted output-\nVertex: "+maxVer[0]+"\nDegree: "+maxVer[1]);
        if(maxVer[0]==1 && maxVer[1]==6) printMatched(t1);
        else printMismatched(t3);

        String test3_2 ="test#2";
        printTest(test3_2);
        maxWght = graphUndirect.findMaxWeight(graphDirect.adjacencyList);
        System.out.println("Expected output-\nVertex: 3\nDegree: 25\n");
        System.out.println("Resulted output-\nVertex: "+maxWght[0]+"\nDegree: "+maxWght[1]);
        if(maxWght[0]==4 && maxWght[1]==25) printMatched(t1);
        else printMismatched(t1);



        String t4="task#4";
        printTask(t4);
        graphDirect.convert(graphDirect.adjacencyList);



        printWarning();
        String tx="Exp#01";
        printExpr(tx);
        graphDirect.removeLL(1, 3);
        graphDirect.removeLL(1, 8);
        graphDirect.printAdjacencyList(graphDirect.adjacencyList);

        System.out.println("\n\n                      "+"\u001B[1;106m"+"\u001B[97m"+"---< THE  END >---"+"\u001B[0m"+"                      \n");
        //"\u001B[1;106m" here before semicolon 1 means bold;
        //It means we can change the styles using 1,4,0 before semicolon;
    }


    //To change the color of the output; 
    //[Inspired by AIB sir];

    static final String red ="\u001B[91m", green ="\u001B[92m", yellow ="\u001B[93m", cyan ="\u001B[96m", white ="\u001B[97m", magenta ="\033[0;95m";
    static final String bold ="\u001B[1m", underline ="\u001B[4m", regular ="\033[0;0m";

    //"\u001B" & "\033" both do the same work;
    //Difference is "\u001B"-> HEXADECIMEL & "\033"-> OCTAL;
    //"regular" resets the values that has been used before;

    //for Foreground (Normal Colors)=> 31(red), 32(green), 33(yellow) and so on.
    //for Foreground (Bright Colors)=> 91(red), 92(green), 93(yellow) and so on.

    //for Background (Normal Colors)=> 41(red), 42(green), 43(yellow) and so on.
    //for Background (Bright Colors)=> 101(red), 102(green), 103(yellow) and so on.

    static String taskSyntx =magenta;
    static String testSyntx =white;
    static String exprmntSyntx =cyan;
    static String matchedSyntx =green+bold;
    static String mismatchedSyntx =red+bold;
    static String closeSyntx =regular;

    public static void printWarning(){
        System.out.println(yellow+bold+"\n\n[---------------> !!! EXPERIMENTAL TASKS !!! <---------------]"+closeSyntx);
    }

    public static void printExpr(String expr){
        System.out.println(exprmntSyntx+"\n(-------------------------> "+underline+expr+regular+exprmntSyntx+" <-------------------------)\n"+closeSyntx);
    }

    public static void printTask(String task){
        System.out.println(taskSyntx+"\n\n(-------------------------> "+underline+task+regular+taskSyntx+" <-------------------------)\n"+closeSyntx);
    }

    public static void printTest(String task){
        System.out.println(testSyntx+"   ------------------------ "+underline+task+regular+testSyntx+" ------------------------  "+closeSyntx);
    }

    public static void printMatched(String task){
        System.out.println(matchedSyntx+"\n\n           [   !!! "+underline+task+" result matched"+regular+matchedSyntx+" !!!   ]       \n"+closeSyntx);
    }

    public static void printMismatched(String task){
        System.out.println(mismatchedSyntx+"\n\n        [   !!! "+underline+task+" result didn't matched"+regular+mismatchedSyntx+" !!!   ]        \n"+closeSyntx);
    }
}