import java.util.*;
public class Collection {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
LinkedList<String> values = new LinkedList<>();
        values.add("2");
        values.add("kjjd");
        values.add("Student");

        Iterator<String> itr = values.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
            
    }
}
