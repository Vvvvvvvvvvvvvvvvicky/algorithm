package club.vic.algorithm;

import org.junit.Test;

public class BubbleSortTest {


    @Test
    public void test(){
        Integer[] arrays = {1,3,4,10,78,123,210,325};
        int toFind = 10;
        arrays = BubbleSort.bubbleSort(arrays);

        for (int array:arrays) {
            System.out.println((array)+"  ");
        }
    }
}
