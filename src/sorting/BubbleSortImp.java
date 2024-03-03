package sorting;

import java.util.Arrays;

public class BubbleSortImp {

    int[] items;

    public BubbleSortImp(int[] items) {
        this.items = items;
    }

    /**
     * 28, 25, 12, 19, 5
     * 25,28
     * 25,12,28,
     * 25,12,28
     * 25,12,19,28
     * 25,12,19,5,28
     */
    public void sort() {
        int length = this.items.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < (length - i) - 1; j++) {
                if (this.items[j] > this.items[j + 1]) {
                    int temp = this.items[j];
                    this.items[j] = this.items[j + 1];
                    this.items[j + 1] = temp;
                }
            }
        }
        this.printSortedArray();
    }

    private void printSortedArray() {
        System.out.println(Arrays.toString(this.items));
    }

}
