
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ArrayListIterationEx{
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(List.of(21,22,23,34,54,56));

        //1. Enhanced For-Loop
        // for(int num : number){
        //     System.out.println(num);
        // }

        //2.ForEach with Lambda
        //number.forEach(n-> System.out.println(n));

        //3. Iterator
        // Iterator<Integer> num = number.iterator();
        // var num = number.iterator();
        // while (num.hasNext()) {
        //     if(num.next().equals(54))num.remove();
        // }
        // System.out.println(num);
        // System.out.println(number);


        //using for loop , while loop 
        // for(int i=0; i<number.size(); i++){
        //     System.out.println(number.get(i));
        // }

        System.out.println("iterating using while ");
        int j =0;
        while (j < number.size()) { 
            System.out.println(number.get(j));
            j++;
        }
    }
}