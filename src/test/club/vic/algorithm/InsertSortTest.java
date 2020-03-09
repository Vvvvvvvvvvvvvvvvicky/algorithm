package club.vic.algorithm;

import org.junit.Test;

public class InsertSortTest {


    @Test
    public void test(){
        Integer[] arrays = {12,90,4,30,78,123,10,25};
        arrays = InsertSort.insertSort(arrays);
        for (int array:arrays) {
            System.out.println((array)+"  ");
        }
    }
}
