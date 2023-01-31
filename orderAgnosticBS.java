//orderAgnostic Binary search  --> we are just looking for index of the array in both ascending and descending sorted array

public class orderAgnosticBS {
    public static void main(String[] args) {
       // int[] arr = {2,3,4,5,6,56,567};
        int[] arr = {9,8,7,6,5,4,3,2};
        int target = 7;
        int ans = orderAgnosticBS1(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS1(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        //find if arr is ascending or descending
        // if (arr[start] < arr[end]) {
        //     isAsc = true;
        // } else {
        //     isAsc = false;
        // }
        //or write it this way
        boolean isAsc = arr[start] < arr[end];

        //finding the mid val
        while(start <= end){
            int mid  = start +(end-start)/2;
            
            //for both asc and desc condition where mid is t
            if (arr[mid] == target) {
                return mid;
            }


            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid -1;
                }else if (target > arr[mid]) {
                    start = mid +1;
                }  
            }else{
                if (target > arr[mid]) {
                    end = mid -1;
                }else if (target < arr[mid]) {
                    start = mid +1;
                }  
            }
            //ex..9,8,5,4,3,2
        }
        return -1;
    }
}
