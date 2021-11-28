import java.util.NoSuchElementException;

class Main {
    public static void main(String[] args){
        LinkedList numbers = new LinkedList();
        
        // Insert elements in list
        numbers.insert(1);
        numbers.insert(3);
        numbers.insert(5);
        numbers.insert(7);
        
        // Print linkedlist
        System.out.println(numbers.toString());

        // Pop the tail
        try{
            numbers.pop();
        } catch (NoSuchElementException e){
            System.out.println("Can't remove element. List is empty. \n" + e.getMessage());
        } catch (Exception e){
            System.out.println("Unknow Error: \n" + e.getMessage());
        } 

        System.out.println(numbers.toString());
    }
}
