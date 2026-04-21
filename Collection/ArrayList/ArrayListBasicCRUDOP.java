
import java.util.ArrayList;
import java.util.List;

class ArrayListBasicCRUDOP{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        //1.ADD
        names.add("rohit");
        names.add("virat");
        names.add("sanju");

        names.add(1, "rahul");

        //2.GET
        String nm1 = names.get(1);

        //3.SET
        names.set(2, "abhishek");

        //4.REMOVE
        names.remove(0);

        names.remove("rahul");

        System.out.println("Final List:"+names);
    }
}