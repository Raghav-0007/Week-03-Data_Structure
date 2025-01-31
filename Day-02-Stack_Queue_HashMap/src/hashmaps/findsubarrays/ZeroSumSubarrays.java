package hashmaps.findsubarrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZeroSumSubarrays {

    public List<int[]> findSub(int[] arr){
        List<int[]> result=new ArrayList<>();
        HashMap<Integer, List<Integer>> hashMap=new HashMap<>();
        int sum=0;

        hashMap.put(0, new ArrayList<>());
        hashMap.get(0).add(-1);

        for (int i=0; i<arr.length; i++){
            sum+=arr[i];

            if(hashMap.containsKey(sum)){
                for(int start: hashMap.get(sum)){
                    result.add(new int[]{start+1, i});
                }
            }
            hashMap.putIfAbsent(sum, new ArrayList<>());
            hashMap.get(sum).add(i);
        }
        return result;
    }
}
