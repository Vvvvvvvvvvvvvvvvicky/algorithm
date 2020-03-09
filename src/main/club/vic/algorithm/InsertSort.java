package club.vic.algorithm;

/**
 * @className InsertSort
 * @desc 插入排序
 * @author Vic
 * @version 1.0
 * @date 2020/3/9 9:57 下午
 **/
public class InsertSort {
    public static <AnyType extends Comparable<? super AnyType>> AnyType[] insertSort(AnyType[] arrays){
        for(int i=1;i<arrays.length;i++){
            AnyType temp = arrays[i];
            int j=i;
            while(j>0 && arrays[j-1].compareTo(temp)>0){
                arrays[j] = arrays[j-1];
                j--;
            }
            arrays[j] = temp;
        }
        return arrays;
    }
}
