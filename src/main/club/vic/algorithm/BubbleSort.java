package club.vic.algorithm;

/**
 * @className BubbleSort
 * @desc 冒泡排序
 * @author Vic
 * @version 1.0
 * @date 2020/3/8 7:42 下午
 **/
public class BubbleSort {
    /*
     * description  单向冒泡
     * date         2020/3/8 7:43 下午
     * @author      vic
     * @param       arrays
     * @return      AnyType[]
     */
    public static <AnyType extends Comparable<? super AnyType>>  AnyType[] bubbleSort(AnyType[] arrays){
        AnyType temp ;
        boolean mark;
        for(int i=0;i<arrays.length-1;i++){
            mark = true;
            for(int j=0;j<arrays.length-i-1;j++){
                if((arrays[j].compareTo(arrays[j+1]))>0){
                    temp = arrays[j+1];
                    arrays[j+1] = arrays[j];
                    arrays[j] = temp;
                    mark = false;
                }
            }
            if(mark) break;
        }
        return arrays;
    }

    /*
     * description  双向冒泡
     * date         2020/3/8 7:43 下午
     * @author      vic
     * @param       arrays
     * @return      AnyType[]
     */
    public static <AnyType extends Comparable<? super AnyType>> AnyType[] bubbleSort_twoWays(AnyType[] arrays){
        boolean mark;
        int low = 0;
        int high = arrays.length - 1;
        AnyType temp;
        while(low < high){
            mark = true;
            for(int i=low;i<high;i++){
                if(arrays[i].compareTo( arrays[i+1])>0){
                    temp = arrays[i];
                    arrays[i] = arrays[i+1];
                    arrays[i+1] = temp;
                    mark = false;
                }
            }
            high--;
            for(int j=high;j>low;j--){
                if(arrays[j-1].compareTo(arrays[j])>0){
                    temp = arrays[j-1];
                    arrays[j-1] = arrays[j];
                    arrays[j] = temp;
                    mark = false;
                }
            }
            low++;
            if (mark) break;
        }
        return arrays;
    }
}
