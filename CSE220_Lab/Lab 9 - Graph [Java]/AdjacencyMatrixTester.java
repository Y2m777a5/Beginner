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

        System.out.println("\n---------------Task#1---------------\n");
        graphUndirect.findMaxVer(graphUndirect.matrix);

        System.out.println("\n---------------Task#2---------------\n");
        graphUndirect.findMaxWeight(graphUndirect.matrix);



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

        System.out.println("\n---------------Task#3---------------\n");
        graphDirect.findMaxVer(graphDirect.matrix);
        graphDirect.findMaxWeight(graphDirect.matrix);

        System.out.println("\n---------------Task#4---------------\n");
        System.out.println("Undirected: ");
        graphDirect.convert(graphDirect.matrix);
    }
}
