package club.vic.algorithm;

import org.junit.Test;

public class BinarySearchTest {


    @Test
    public void test(){
        Integer[] arrays = {1,3,4,10,78,123,210,325};
        int toFind = 10;
        int result = BinarySearch.binarySearch(arrays, toFind);
        System.out.println("查找位置为"+(result+1));
    }
}
