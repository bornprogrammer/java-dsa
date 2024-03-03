package sorting;

import java.util.Arrays;

public class SelectionSortImpClient {
    public SelectionSortImpClient() {
    }

    public void sort() {
        this.input1();
//        this.input2();
//        this.input3();
    }

    private void input1() {
        int[] input = new int[]{4, 1, 2, 8, 6};
        new SelectionSortImp(input).sort();
    }

    private void input2() {
        int[] input = new int[]{34, 10, 29, 78, 46};
        new SelectionSortImp(input).sort();
    }

    private void input3() {
        int[] input = new int[]{314, 110, 129, 678, 460};
        new SelectionSortImp(input).sort();
    }


}
