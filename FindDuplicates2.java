import java.util.*;

public class FindDuplicates2 {
    public static void main(String[] args) {
        int[] arr = {2,4,3,3,5,7,3,5};
        Map<Integer,Integer> hm = new HashMap<>();
        for(int num : arr){
            if(hm.get(num)==null){
                hm.put(num,1);
            }else{
                hm.put(num,(hm.get(num)+1));
            }
        }
        System.out.println("Duplicate elements are : ");
        Set<Integer> keys = hm.keySet();
        for(int key : keys){
            if(hm.get(key)>1){
                System.out.println(key+" ");
            }
        }
    }
}
