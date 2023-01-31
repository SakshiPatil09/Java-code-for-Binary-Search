public class binarySeach{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,56,567};
        int target = 56;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    //return index
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        //finding the mid val
        while(start <= end){
            int mid  = start +(end-start)/2;
            //--> logic for above staement
            //s + (e-s/2)
            //(2s+e-s)/2
            //s+e/2

            if (target < arr[mid]) {
                end = mid -1;
            }else if (target > arr[mid]) {
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}