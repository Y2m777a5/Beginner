/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }
    
    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction( String key ){
        // TO DO 
        int sum = 0;
        int len = key.length();
        int i = 1;
        if(len%2==0){
            i = 0;
        }
        while(i<len){
            sum+=(int)key.charAt(i);
            i+=2;
        }
        return sum % ht.length; //remove this line
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
	//then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value){
        // TO DO
        int idx = hashFunction(key);
        FruitNode newNode = new FruitNode(key, value);
        if (ht[idx] == null) {
            ht[idx] = newNode;
        }

        else if (value > (Integer) ht[idx].fruit[1]) {
            if(key.equals((String)ht[idx].fruit[0])){
                ht[idx].fruit[1]=value;
            }
            else{
                newNode.next = ht[idx];
                ht[idx] = newNode;   
            }
        }
        else{
            FruitNode curr = ht[idx];
            while (curr.next != null && value <= (Integer) curr.next.fruit[1]) {
                curr = curr.next;
            }
            if(key.equals((String)ht[idx].fruit[0])){
                curr.fruit[1]=value;
            }
            else{
                newNode.next = curr.next;
                curr.next = newNode; 
            }
        }
    }

}
