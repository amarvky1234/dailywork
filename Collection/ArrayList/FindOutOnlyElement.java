
import java.util.ArrayList;
import java.util.List;

/**find out only element which greater than 50(i have to find position)*/
class FindOutOnlyElement{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(12,34,35,23,54,21,45));

        for(int num : list){
            if(num>50){
                System.out.println(list.indexOf(num));
            }   
        }
    }
}