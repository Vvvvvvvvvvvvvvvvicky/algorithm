package club.vic.algorithm;

import org.junit.Ignore;
import org.junit.Test;

public class BubbleSortTest {


    @Test
    @Ignore
    public void test(){
        Integer[] arrays = {12,90,4,30,78,123,10,25};
        arrays = BubbleSort.bubbleSort(arrays);
        for (int array:arrays) {
            System.out.println((array)+"  ");
        }
    }

    @Test
    public void test_twoWay(){
        Integer[] arrays = {12,90,4,30,78,123,10,25};
        arrays = BubbleSort.bubbleSort_twoWays(arrays);
        for (int array:arrays) {
            System.out.println((array)+"  -");
        }
    }
}
