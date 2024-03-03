package sorting;

public class InsertionSearchImpClient {
    public InsertionSearchImpClient() {
    }

    public void sort() {
        this.input1();
        this.input2();
        this.input3();
        this.input4();
    }

    private void input1() {
        int[] items = new int[]{15, 12, 29, 21, 20};
        new InsertionSearchImp(items).sort();
    }

    private void input2() {
        int[] items = new int[]{1, 2, 3, 4, 5};
        new InsertionSearchImp(items).sort();
    }

    private void input3() {
        int[] items = new int[]{19, 29, 11, 20, 32, 1, 28};
        new InsertionSearchImp(items).sort();
    }

    private void input4() {
        int[] items = new int[]{215, 112, 190, 210, 210};
        new InsertionSearchImp(items).sort();
    }

}
