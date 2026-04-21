
import java.util.ArrayList;
import java.util.List;

class ArrayListDemo{
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();

        //1.create(Add)
        grades.add(85);
        grades.add(92);
        grades.add(70);

        //2.Insert at specific spot
        grades.add(1, 99); 

        //6. Iterate(The modern way)
        System.out.println("All Grades: ");
        for(Integer i : grades){
            System.out.println(i);
        }
    }
}