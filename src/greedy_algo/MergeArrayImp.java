package greedy_algo;

public class MergeArrayImp {
    public int[] arr1;
    public int[] arr2;
    public int[] arr3;

    public MergeArrayImp(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.arr3 = new int[20];
    }

    public MergeArrayImp merge() {
        int indexToInsert = 0;
        int arr2Pointer = 0;
        int i;
        for (i = 0; i < this.arr1.length; i++) {
            if (i == this.arr2.length) {
                break;
            } else {
                for (int j = arr2Pointer; j < this.arr2.length; j++) {
                    if (this.arr1[i] >= this.arr2[j]) {
                        this.arr3[indexToInsert++] = this.arr2[j];
                        arr2Pointer++;
                    } else {
                        this.arr3[indexToInsert++] = this.arr1[i];
                        break;
                    }
                }
            }
        }
        if (arr2Pointer < this.arr2.length) { // print the last element of right sid if last element is greater than last element if left side. or if count of right side is greater than left side then will print all records
            indexToInsert = this.insertRightArray(arr2Pointer, indexToInsert);
        }
        if (i < this.arr1.length) {
            this.insertLeftArray(i, indexToInsert);
        }
        return this;
    }

    private int insertLeftArray(int index, int indexToStart) {
        for (int i = index; i < this.arr1.length; i++) {
            this.arr3[indexToStart++] = this.arr1[i];
        }
        return indexToStart;
    }

    private int insertRightArray(int index, int indexToStart) {
        for (int i = index; i < this.arr2.length; i++) {
            this.arr3[indexToStart++] = this.arr2[i];
        }
        return indexToStart;
    }


    public void printMerged() {
        for (int j = 0; j < this.arr3.length; j++) {
            System.out.println(this.arr3[j]);
        }
    }


}
