package club.vic.algorithm;

public class BubbleSort {
    public static <AnyType extends Comparable<? super AnyType>>  AnyType[] bubbleSort(AnyType[] arrays){
        AnyType temp ;
        boolean mark = true;
        for(int i=0;i<arrays.length-1;i++){
            for(int j=1;j<arrays.length-i;j++){
                if((arrays[i].compareTo(arrays[j]))>0){
                    temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                    mark = false;
                }
            }
            if(mark) break;
        }
        return arrays;
    }
}
