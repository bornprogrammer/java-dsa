package greedy_algo;

public class MergeArrayImpClient {

    private MergeArrayImp mergeArrayImp;

    public MergeArrayImpClient() {
    }

    public void mergeTwoArray() {
//        this.input1();
//        this.input2();
//        this.input3();
//        this.input4();
//        this.input5();
    }

    protected void input1() {
        int[] arr1 = new int[]{3, 7, 10, 12, 15, 20, 29, 35, 40};
        int[] arr2 = new int[]{1, 5, 11, 14, 17, 25, 30};
        this.mergeArrayImp = new MergeArrayImp(arr1, arr2);
        this.mergeArrayImp.merge().printMerged();
    }

    protected void input2() {
        int[] arr1 = new int[]{2, 4};
        int[] arr2 = new int[]{1, 5, 11, 14, 17};
        this.mergeArrayImp = new MergeArrayImp(arr1, arr2);
        this.mergeArrayImp.merge().printMerged();
    }

    protected void input3() {
        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{1, 5, 11, 14, 17};
        this.mergeArrayImp = new MergeArrayImp(arr1, arr2);
        this.mergeArrayImp.merge().printMerged();
    }

    protected void input4() {
        int[] arr1 = new int[]{29, 39, 49, 57, 60};
        int[] arr2 = new int[]{};
        this.mergeArrayImp = new MergeArrayImp(arr1, arr2);
        this.mergeArrayImp.merge().printMerged();
    }

    protected void input5() {
        int[] arr1 = new int[]{2, 4, 6, 8, 10};
        int[] arr2 = new int[]{3, 6, 9, 12, 18, 29};
        this.mergeArrayImp = new MergeArrayImp(arr1, arr2);
        this.mergeArrayImp.merge().printMerged();
    }


}
