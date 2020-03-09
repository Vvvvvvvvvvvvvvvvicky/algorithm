package club.vic.algorithm;

import org.junit.Test;

/**
 * @className InsertSortTest
 * @desc 插入排序测试
 * @author Vic
 * @version 1.0
 * @date 2020/3/9 10:08 下午
 **/
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
