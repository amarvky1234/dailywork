
import java.util.ArrayList;
import java.util.List;

class ArrayListSortingAndTransformation {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>(List.of(92, 104, 88, 55, 78));
        System.out.println(scores);

        //SORT
        // Collections.sort(scores);
        // System.out.println(scores);

        //REVERSE
        //Collections.reverse(scores);
        //System.out.println(scores);

        //TO ARRAY
        //Integer[] scoreArr = scores.toArray(Integer[]::new);
        //System.out.println(Arrays.toString(scoreArr));

        //SUB LIST
        List<Integer> topTwo = scores.subList(0, 2);
        System.out.println(topTwo);
    }
}