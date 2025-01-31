package hashmaps.pairsuminarray;

import java.util.HashMap;

public class PairWithGivenSum {
    public static int[] findPair(int[] arr, int target){
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        int[] result=new int[2];

        for(int i=0; i<arr.length; i++){
            int current=arr[i];
            int complement=target-current;

            if(hashMap.containsKey(complement)){
                result[0]=hashMap.get(complement);
                result[1]=i;
                return result;
            }
            hashMap.put(current, i);
        }
        return result;
    }
}
