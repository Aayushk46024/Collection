import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Ankit");
        ll.add("Pooja");
        ll.add("Jyoti");
        ll.add("Akshay");

        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
