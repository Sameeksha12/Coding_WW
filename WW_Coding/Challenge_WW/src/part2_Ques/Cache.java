package part2_Ques;
import java.util.*;
public class Cache {
    int capacity;
    HashMap<Integer, Node> map = new HashMap<Integer, Node>();
    Node head=null;
    Node end=null;
 
    public Cache(int capacity) {
        this.capacity = capacity;
    }
 
    public int get(int key) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
 
        return -1;
    }
 //to remove node
    public void remove(Node n){
        if(n.previous!=null){
            n.previous.next = n.next;
        }else{
            head = n.next;
        }
 
        if(n.next!=null){
            n.next.previous = n.previous;
        }else{
            end = n.previous;
        }
 
    }
 
    public void setHead(Node n){
        n.next = head;
        n.previous = null;
 
        if(head!=null)
            head.previous = n;
 
        head = n;
 
        if(end ==null)
            end = head;
    }
 
    public void set(int key, int value) {
        if(map.containsKey(key)){
            Node old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        }else{
            Node c = new Node(key, value);
            if(map.size()>=capacity){
                map.remove(end.key);
                remove(end);
                setHead(c);
 
            }else{
                setHead(c);
            }    
 
            map.put(key, c);
        }
    }
}

