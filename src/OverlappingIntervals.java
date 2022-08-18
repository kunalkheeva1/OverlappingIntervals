import java.util.*;


public class OverlappingIntervals {
    static int[][] overlappingIntervals(int[][]arr){
        List<int[]> list = new ArrayList<>();
        if(arr.length ==0){
            return list.toArray(new int[0][0]);
        }
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
        int start = arr[0][0];
        int end = arr[0][1];

        for(int[] i :arr){
            if(i[0]<= end){
                end = Math.max(end, i[1]);
            }
            else{
                list.add(new int []{start,end});
                start = i[0];
                end = i[1];
            }
        }list.add(new int[]{start, end});
        return list.toArray(new int[0][0]);




    }
    public static void main(String[] args) {

    }
}
