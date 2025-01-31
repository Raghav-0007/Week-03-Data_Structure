package hashmaps.findsubarrays;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ZeroSumSubarrays subarrays=new ZeroSumSubarrays();
        int[] arr={3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        List<int[]> sub=subarrays.findSub(arr);
        for(int[] ar: sub){
            System.out.print("["+ar[0]+" "+ar[1]+"], ");
        }
//        System.out.println(sub.toString());
    }
}
