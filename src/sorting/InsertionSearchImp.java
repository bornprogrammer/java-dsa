package sorting;

import java.util.Arrays;

public class InsertionSearchImp {
    int[] items;

    // [190,110,215,215,238,101]
    //  [190,110,215,215,238,101]
    //  [110,190,215,215,238,101]
    // 12,15,29,21,20
    public InsertionSearchImp(int[] items) {
        this.items = items;
    }

    /**
     * sorting strategy with while loop
     * [109,11,125,27,390]
     */
    public void sort() {
// starting with 1 as item 0 will be treated as sorted array in insertion sorting algorithm
        for (int i = 1; i < this.items.length; i++) { // this item will be pushed
            int curValue = this.items[i];
            int curIndex = i;
            while (curIndex > 0 && this.items[curIndex - 1] > curValue) {
                this.items[curIndex] = this.items[curIndex - 1];
                curIndex--;
            }
            this.items[curIndex] = curValue;
        }
        this.printSortedArray();
    }

    public void sortWithNestedForLoops() {
        // starting with 1 as item 0 will be treated as sorted array in insertion sorting algorithm
        for (int i = 1; i < this.items.length; i++) { // this item will be pushed
            int curValue = this.items[i];
            if (curValue < this.items[i - 1]) { // this gives the guarantee that
                System.out.println("hello here");
                for (int j = 0; j < i; j++) {
                    if (curValue < this.items[j]) {
                        for (int k = i; k > j; k--) {
                            this.items[k] = this.items[k - 1];
                        }
                        this.items[j] = curValue;
                        break;
                    }
                }
            }
        }
        this.printSortedArray();
    }

    public void printSortedArray() {
        System.out.println(Arrays.toString(this.items));
    }

}
