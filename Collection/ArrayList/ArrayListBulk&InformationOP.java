
import java.util.ArrayList;
import java.util.List;

class ArrayListBulkInformationOP {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(10,20,30));
        List<Integer> list2 = new ArrayList<>(List.of(40,50));

        //ADD ALL: join two lists
        boolean b1 = list1.addAll(list2);
        System.out.println(b1);
        System.out.println(list1);
        System.out.println(list2);

        //SIZE & EMPTY CHECK
        int total = list1.size();
        System.out.println(total);

        boolean b2 = list1.isEmpty();
        System.out.println(b2);

        //CONTAINS: search for a value
        boolean b3 = list1.contains(20);
        System.out.println(b3);

        //INDEX OF: find position
        int pos = list1.indexOf(40);
        System.out.println(pos);

        //CLEAR: Wipe everything
        list1.clear();
        System.out.println(list1);
    }
}