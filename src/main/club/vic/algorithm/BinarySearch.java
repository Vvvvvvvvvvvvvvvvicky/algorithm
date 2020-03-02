package club.vic.algorithm;

/**
 * 二分查找 O(log n)
 */
public class BinarySearch {
    public static <AnyType extends Comparable<? super AnyType>> int binarySearch(AnyType[] a,AnyType x){
        int low = 0;
        int high = a.length - 1;
        while(low <= high){
            int mid = (high - low)/2;
            if(a[mid].compareTo(x) < 0){
                low = mid + 1;
            }else if(a[mid].compareTo(x) > 0){
                high = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;//找不到
    }
}
