package club.vic.algorithm;

/**
 * @className SelectSort
 * @desc 选择排序
 * @author Vic
 * @version 1.0
 * @date 2020/3/8 7:44 下午
 **/
public class SelectSort {
    public static <AnyType extends Comparable<? super AnyType>> AnyType[] selectSort(AnyType[] arrays){
        AnyType temp;
        for(int i=0;i<arrays.length;i++){
            for(int j=i+1;j<arrays.length;j++){
                if(arrays[i].compareTo(arrays[j])>0){
                    temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        return arrays;
    }
}
