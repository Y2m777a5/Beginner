public class AdjacencyMatrix {
    public int[][] matrix;
    public boolean check;

    public AdjacencyMatrix(int size, boolean check){
        this.check = check;
        this.matrix = new int [size][size];
    }

    public void addEdge(int source, int destination, int weight){
        this.matrix[source][destination]=weight;
        if(!check){
            this.matrix[destination][source]= weight;
        }
    }

    public void delEdge(int source, int destination){
        this.matrix[source][destination]=0;
        if(!check){
            this.matrix[destination][source]=0;
        }
    }

    public boolean hasEdge(int source, int destination){
        return this.matrix[source][destination] != 0;
    }

    public boolean checkDirect(int[][] matrix){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][j]==matrix[j][i]){
                    return true;
                }
            }
        }
        return false;
    }

    public void findMaxVer(int[][] matrix){
        int max = 0;
        int ver = 0;
        for(int i=1; i<matrix.length; i++){
            int sum = 0;
            for(int j=1; j<matrix[i].length-1; j++){
                if(matrix[i][j]!=0){
                    sum++;
                }
            }
            if(i==0 || max<sum){
                ver = i;
                max=sum;
            }
        }
        System.out.println("Vertex: "+ver+"\nDegree: "+max);
    }

    public void findMaxWeight(int[][] matrix){
        int max = 0;
        int ver = 0;
        for(int i=1; i<matrix.length; i++){
            int sum = 0;
            for(int j=1; j<matrix[i].length-1; j++){
                if(matrix[i][j]!=0){
                    sum+=matrix[i][j];
                }
            }
            if(i==0 || max<sum){
                ver = i;
                max=sum;
            }
        }
        System.out.println("Vertex: "+ver+"\nSum of weight: "+max);
    }

    public void convert(int[][] matrix){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][j]!=0){
                    matrix[j][i] = matrix[i][j];
                }
            }
        }
        System.out.println("Converted: ");
        printMatrix(matrix);
    }

    public void printMatrix(int[][] matrix){
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length-1; j++){
                System.out.print(matrix[i][j]+", ");
            }
            System.out.println(matrix[i][matrix[i].length-1]);
        }
    }
}
