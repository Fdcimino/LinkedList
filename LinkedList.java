

public class LinkedList<T>{
    Node head;
    
    public LinkedList(Object<T> data){
        head = new Node(data);
    }
    
    public add(Object<t> data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = new Node(data);
    }
    
    public remove(Object<T> data){
        remove(Object<T> data, 1);
    }
    
    public remove(Objet<T> data, int numberOfOccurancesToPass){
    
    }
    
    private class Node{
        public Node next;
        public Object<T> data;
    }
}
