import java.util.*;

// i know what is going on with the code but I am not clear with the concepts i used here
// So, whatever is not making sense to me, I will be putting ? in those places
// so eg {1,2}, {2,4} then output will be {1,4}, meanwhile if two input intervals have no connection
//then we will add both of them
// I use list of integers(which I don't know we could use this way)as it is easier to add the elements in it
// and later I returned the array after converting the list into the 2d array


public class OverlappingIntervals {

    static int[][] overlappingIntervals(int[][]arr){
        //get a list array to maintain the record, but I dont know how is it working in the background
        List<int[]> list = new ArrayList<>();
        // if array contains no element then return an empty array
        if(arr.length ==0){
            return list.toArray(new int[0][0]);
        }
        // sort the array according to the starting element, as we need to compare starting point with the ending of previous
        Arrays.sort(arr, (a,b)->a[0]-b[0]); // lambda expression ??
        int start = arr[0][0];
        int end = arr[0][1];

        // I don't know how we expressed and what is the condition in the loop
        for(int[] i :arr){//?
            // here is a comparison of the previous end and starting of next, if previous end is greater then i am just
            //taking the greater end, but I do not know how I am adding the end and start here in the list
            // i know there is one outside the loop, but I really need a dry run and i need to go tru this whole concept
            if(i[0]<= end){
                end = Math.max(end, i[1]);
            }
            // otherwise i am just putting start and end then updating start and end
            else{//?
                list.add(new int []{start,end});
                start = i[0];
                end = i[1];
            }
        }list.add(new int[]{start, end});//?
        return list.toArray(new int[0][0]);     // else return an empty 2d array??




    }
    public static void main(String[] args) {

    }
}
