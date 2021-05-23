package bt4;

public class BinarySearch {
    public static int binarySearch(int[] array, int left, int right ,int value){
        int middle = 0;
        if (right>=left){
            middle = left + (right - left)/2;
            if (value == array[middle]){
                return middle;
            }else if (value > array[middle]){
                return binarySearch(array,middle + 1,right,value);
            }else {
                return binarySearch(array,left,middle - 1,value);
            }
        }
        return -1;
    }
}
