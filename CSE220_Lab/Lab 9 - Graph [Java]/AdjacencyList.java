public class AdjacencyList {
    public Edge[] adjacencyList;
    public boolean check;

    public AdjacencyList(int vertices, boolean check){
        this.check=check;
        adjacencyList = new Edge[vertices];
    }

    //Inspired By AIB sir;
    //Not a part of the assignmnet (Adjacency matrix -> Adjacency List);
    public AdjacencyList(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]!=0){
                    addEdge(i, j, matrix[i][j]);
                }
            }
        }
    }

    public void addEdge(int src, int des, int wght){
        if(!check){
            if(hasEdge(src, des)){
            Edge n = adjacencyList[src];
            while(n!=null){
                if(n.fromV==des){
                    n.weight = wght;
                    return; //Work done here so break the method;
                }
                n = n.next;
                }
            }
            else{
                Edge newEdge = new Edge(src, des, wght);
                if(adjacencyList[src]==null){
                    adjacencyList[src]=newEdge;
                }
                else{
                    //Append Linked List
                    appendLL(adjacencyList[src], newEdge);
                }
            }

            //Vice-versa
            if(hasEdge(des, src)){
            Edge n = adjacencyList[src];
            while(n!=null){
                if(n.fromV==src){
                    n.weight = wght;
                    return; //Work done here so break the method;
                }
                n = n.next;
                }
            }
            else{
                Edge newEdge = new Edge(des, src, wght);
                if(adjacencyList[des]==null){
                    adjacencyList[des]=newEdge;
                }
                else{
                    //Append Linked List
                    appendLL(adjacencyList[des], newEdge);
                }
            }
        }
        else{
            if(hasEdge(src, des)){
            Edge n = adjacencyList[src];
            while(n!=null){
                if(n.fromV==des){
                    n.weight = wght;
                    return; //Work done here so break the method;
                }
                n = n.next;
                }
            }
            else{
                Edge newEdge = new Edge(src, des, wght);
                if(adjacencyList[src]==null){
                    adjacencyList[src]=newEdge;
                }
                else{
                    //Append Linked List
                    appendLL(adjacencyList[src], newEdge);
                }
            }
        }
    }

    public void appendLL(Edge head, Edge nNode){
        Edge h = adjacencyList[head.fromV];
        if(nNode.toV<adjacencyList[head.fromV].toV){
            nNode.next = adjacencyList[head.fromV];
            adjacencyList[head.fromV] = nNode;
        }
        else{
            int idx=nNode.toV;
            while(h.next!=null && idx>h.next.toV){
                h = h.next;
            }
            if(h.next==null){
                h.next = nNode;
            }
            else{
                nNode.next = h.next;
                h.next = nNode;
            }
        }
    }
    
    public boolean hasEdge(int src, int des){
        Edge n = adjacencyList[src];
        while(n!=null){
            if(n.toV==des){
                return true;
            }
            n = n.next;
        }
        return false;
    }

    public int getIndex(Edge head, int des){
        Edge h = head;
        int idx=0;
        while(des<=h.toV && h.next!=null){
            idx++;
            h=h.next;
        }
        System.out.println("GetIndex "+h.toV);
        return idx;
    }
    
    public int getLength(Edge h){
        Edge head = h;
        int count=0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public void findMaxVer(Edge[] adjacencyList){
        int max = 0;
        int ver = 0;
        for(int i=0; i<adjacencyList.length; i++){
            int tempSum=0;
            Edge head = adjacencyList[i];
            while(head!=null){
                tempSum++;
                head = head.next;
            }
            if(i==0 || max<tempSum){
                ver = i;
                max=tempSum;
            }
        }
        System.out.println("Vertex: "+ver+"\nDegree: "+max);
    }

    public void findMaxWeight(Edge[] adjacencyList){
        int max = 0;
        int ver = 0;
        for(int i=0; i<adjacencyList.length; i++){
            int tempSum=0;
            Edge head = adjacencyList[i];
            while(head!=null){
                tempSum+=head.weight;
                head = head.next;
            }
            if(i==0 || max<tempSum){
                ver = i;
                max=tempSum;
            }
        }
        System.out.println("Vertex: "+ver+"\nSum of weight: "+max);
    }

    public void convert(Edge[] adjacencyList){
        for(int i=0; i<adjacencyList.length; i++){
            Edge head = adjacencyList[i];
            while(head!=null){
                addEdge(head.toV,head.fromV,head.weight);
                head = head.next;
            }
        }
        printAdjacencyList(adjacencyList);
    }

    public void printAdjacencyList(Edge[] adjacencyList){
        for(int i=0; i<adjacencyList.length; i++){
            System.out.print(i+": ");
            printLL(adjacencyList[i]);
            System.out.println();
        }
    }

    private void printLL(Edge head){
        Edge h = head;
        while(h!=null){
            System.out.print("<"+h.fromV+"-"+h.toV+": "+h.weight+"> ");
            h=h.next;
        }
    }
}
