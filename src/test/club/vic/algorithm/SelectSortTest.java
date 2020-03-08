package club.vic.algorithm;

import org.junit.Ignore;
import org.junit.Test;

public class SelectSortTest {


    @Test
    public void test(){
        Integer[] arrays = {12,90,4,30,78,123,10,25};
        arrays = SelectSort.selectSort(arrays);
        for (int array:arrays) {
            System.out.println((array)+"  ");
        }
    }
}
