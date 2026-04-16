/**57. Delete all duplicate elements from an array.*/
void main(){
    int[] arr = {1, 2, 3, 1, 4, 2, 5, 1};
    Map<Integer, Long> deletedDuplicate = Arrays.stream(arr).boxed()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream().filter(e -> e.getValue() == 1)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    System.out.println(deletedDuplicate.keySet());
}