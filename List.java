import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class List {
   public static void main(String ar[]){
    LinkedList<String> list = new LinkedList<String>();
    list.add("Ram");
    list.add("Krish");
    list.add("Samyuktha");
    list.set(1,"Love");
    System.out.println(list);
    
    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("Ram");
    list1.add("Krish");
    list1.add("Samyuktha");
    list1.set(1,"Love");
    
    System.out.println(list1);

   /*/ Queue<String> obj = new PriorityQueue<String>();
    obj.add("a");
    //obj.add("Name 2");
    //obj.add("name 3");

   // obj.remove();
    //obj.poll();
    //obj.poll();
    obj.peek();
   //obj.peek();
   //obj.peek();
    

   System.out.println(obj.peek());
   System.out.println(obj.poll());
   System.out.println(obj.hashCode());
   //System.out.println(obj.get(2));





    //Iterator it = obj.iterator();
   // while(it.hasNext()){
        //System.out.println(it.next());

        Stack <String>s1= new Stack<String>();
        s1.push("Ram");
        s1.push("Lover");
        s1.push("Samyuktha");
        System.out.println(s1);
        //System.out.println(s1.pop());
        System.out.println(s1);
        System.out.println(s1.empty());
        System.out.println(s1.search("Samyuktha"));*/

    }
     
   }


//}

