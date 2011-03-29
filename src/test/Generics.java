package test;

import java.util.*;

/**
 *
 * @author mhh91
 */
public class Generics {
    public static void iterate(List<? extends Number> l){
        for (Number n : l){
            System.out.println(n);
        }
    }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        mylist.add(3);
        mylist.add(5);
        mylist.add(7);
        mylist.add(1);
        //Collections.sort(mylist);
        System.out.println(Collections.binarySearch(mylist, 7));
        
    }

}

class Holder<T>{
    private T something;
    public Holder(T t){
        something = t;
    }

    public T get(){
        return something;
    }

}