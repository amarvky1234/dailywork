
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayListMethod{
    public static void main(String[] args) {
        
        //creating ArrayList
        List<Integer> list1 = new ArrayList<>(List.of(24, 34, 56, 566, 23));
        //System.out.println(list1);
        List<String> list2 = new ArrayList<>(Arrays.asList("apple", "papaya", "banana", "pineapple", "grapes"));
        //System.out.println(list2);

        list1.add(101); //added 101 at end of list1 
        list2.add("mango"); //added mango at end of list2
        //System.out.println(list1);
        //System.out.println(list2);

        //add(index, value)
        list1.add(3, 115);
        //System.out.println(list1);
        list2.add(4, "guava");
        //System.out.println(list2);

        //get(index)
        Integer i1 = list1.get(4);
        //System.out.println(i1);
        
        String s1 = list2.get(5);
        //System.out.println(s1);

        //set(index, value) -> replace the item at that index
        Integer i2 = list1.set(2, 202);
        //System.out.println(i2);
        //System.out.println(list1);

        String s2 = list2.set(4, "carrot");
        //System.out.println(s2);
        //System.out.println(list2);

        //remove(index) -> deletes item and close the gap
        //System.out.println(list1);
        //Integer i3 = list1.remove(566);  // Exception : AOFBE because integer take value as index not object
        //Integer i3 = list1.remove(4);
        //System.out.println(i3);
        //System.out.println(list1);

        // System.out.println(list2);
        // String s3 = list2.removeFirst();
        // String s4 = list2.removeLast();
        // System.out.println(s3+"         "+s4);
        // String s5 = list2.remove(2);  //removing item using indexing
        // System.out.println(s5);
        // boolean b1 = list2.remove("carrot"); //removing item by passing directly object 
        // System.out.println(b1);
        // System.out.println(list2);

        //size() -> returns number of element 
        // int e1 = list1.size();
        // System.out.println(e1);
        // int e2 = list2.size();
        // System.out.println(e2);

        //contain(value) -> check item exist or not and return boolean
        // System.out.println(list1);
        // boolean b2 = list1.contains(34);
        // System.out.println(b2);
        // boolean b3 = list1.contains(501);
        // System.out.println(b3);

        // System.out.println(list2);
        // boolean b4 = list2.contains("pineapple");
        // System.out.println(b4);
        // boolean b5 = list2.contains("cabbage");
        // System.out.println(b5);

        //clear() -> removes everything from list
        list1.clear();
        System.out.println(list1);
        list2.clear();
        System.out.println(list2);
    }
}