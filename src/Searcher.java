public class Searcher {

    public int search(int[] arr, int target){
        int low = 0, hight = arr.length - 1;
        while(low <= hight){
            int mid = low + (hight - low) / 2;
            if(arr[mid] == target) return mid;
            if(arr[mid] < target) low = mid + 1;
            else hight = mid -1;
        }
        return -1;
    }

}
