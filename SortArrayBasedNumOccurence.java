
/** 31. Sort an array based on the number of occurrences of elements.
 * Input: [1, 2, 5, 6, 2, 1, 6, 1, 2]
 * Output: [5, 6, 6, 1, 1, 1, 2, 2, 2] */

void main() {
   int[] arr = {1, 2, 5, 6, 2, 1, 6, 1, 2, 1};

   Map<Integer, Integer> map = new HashMap<>();
   for (int i : arr) {
      if(map.containsKey(i)){
            map.put(i, map.get(i)+1);
      }else{
            map.put(i, 1);
      }
   }

   List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
   Collections.sort(list, (a,b)-> {
      if(a.getValue() == b.getValue()){
            return a.getKey().compareTo(b.getKey());
      } else if (a.getValue() < b.getValue()){
            return 1;
      }else{
            return -1;
      }
   });

   List<Integer> result = new ArrayList<>();
   for(Map.Entry<Integer, Integer> entry : list){
      for(int i=0; i<entry.getValue(); i++){
            result.add(entry.getKey());
      }
   }

   System.out.println(result);
   
   //    Arrays.sort(arr);
   //  System.out.println(Arrays.toString(arr));

   //  int count = 1;
   //  for (int i = 0; i < arr.length-1; i++) {
   //     if(arr[i] == arr[i+1]){
   //        count++;
   //     }else{
   //       System.out.println("element "+arr[i]+" has occurence is "+count+" times");
   //       count = 1;
   //     }
   //  }

    

   //  int k = 1;
   //  for (int i = 0; i < arr.length-1; i++) {
   //     if(arr[i]==arr[i+1]){
   //        k++;
   //        continue;
   //     }
   //     System.out.println(arr[i]+"    "+k);
   //     k=1;
   //  } 
}
