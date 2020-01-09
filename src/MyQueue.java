import java.util.*;
public class MyQueue {
   LinkedList<Integer> t;
   MyQueue() {
     t = new LinkedList<Integer>();  
   }
   boolean isEmpty() {
      return(t.isEmpty()); 
   }
   void clear() {
       t.clear();
   }
   void enqueue(Integer x) {
       t.addLast(x);
   }
   Integer dequeue() {
      if(isEmpty()) return(null);
      return(t.removeFirst());
   }
   Integer front() {
      if(isEmpty()) return(null);
      return(t.getFirst());
   }
}
