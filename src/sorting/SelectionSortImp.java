package sorting;

import java.util.Arrays;

public class SelectionSortImp {

    int[] items;

    public SelectionSortImp(int[] items) {
        this.items = items;
    }

    public void sort() {
        int length = this.items.length;
        int minVal, minValIndex;
        for (int i = 0; i < length - 1; i++) {
            minVal = this.items[i];
            minValIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (this.items[j] < minVal) {
                    minVal = this.items[j];
                    minValIndex = j;
                }
            }
            int currentValue = this.items[i];
            this.items[i] = this.items[minValIndex];
            this.items[minValIndex] = currentValue;
        }
        this.printSortedArray();
    }

    private void printSortedArray() {
        System.out.println(Arrays.toString(this.items));
    }

}
