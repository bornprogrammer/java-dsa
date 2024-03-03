package sorting;

import java.util.Arrays;

public class BubbleSortImpClient {

    private BubbleSortImp bubbleSortImp;

    public BubbleSortImpClient() {
    }

    public void sort() {
//        this.input1();
        this.input2();
    }


    private void input1() {
        int[] items = new int[]{18, 25, 12, 19, 5};
        new BubbleSortImp(items).sort();
    }

    private void input2() {
        int[] items = new int[]{28, 25, 12, 19, 5};
        new BubbleSortImp(items).sort();
    }

    private void input3() {
        int[] items = new int[]{28, 25, 12, 19, 5};
        new BubbleSortImp(items).sort();
    }

    private void input4() {

    }

    private void input5() {

    }


}
