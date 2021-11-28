import java.util.NoSuchElementException;

public class LinkedList {
    Node head;
    private int size = 0; // Initial list size 

    static class Node {
        Node next;
        private int data;

        public Node(int data){
            this.data = data;
        }

        public void setData(int data){
            this.data = data;
        }

        public int getData(){
            return this.data;
        }
    }
    
    // Insert new node at the tail
    public Node insert(int data){
        Node newNode = new Node(data);

        // If list is empty, newNode becomes the tail
        if(getSize() == 0){
            this.head = newNode;
        } else {
            Node currentNode = this.head;

            while(currentNode.next != null){
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }

        // Increase size by 1
        setSize(getSize()+1);

        return newNode;
    }

    
    // Remove the tail element
    public Node pop(){
        // If list is empty throw an error
        if(getSize() == 0){
            throw new NoSuchElementException();
        }

        Node currentNode = this.head;
        Node targetNode = null;
        for(int i = 0; i < getSize(); i++){
            if(i == getSize()-2){
                targetNode = currentNode.next;
                currentNode.next = null;
                break;
            }

            currentNode = currentNode.next;
        }

        // Reduce size by 1
        setSize(getSize()-1);

        return targetNode;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        
        Node currentNode = this.head;
        for(int i = 0; i < getSize(); i++){
            builder.append(currentNode.getData() + " -> ");
            currentNode = currentNode.next;
        }

        return builder.toString();
    }

    /*      Getters and Setters     */
    public void setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }
    
}
