import java.util.*;

class Arraylist {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Aayush");
        list.add("Amit");
        list.add("Saurav");
        list.add("Sachin");

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}