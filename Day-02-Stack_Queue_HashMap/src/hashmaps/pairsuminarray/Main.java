package hashmaps.pairsuminarray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 12, 8, 9};
        int target = 11;
        int[] result= PairWithGivenSum.findPair(arr, target);
        System.out.println("["+result[0]+" "+result[1]+"]");
    }
}
