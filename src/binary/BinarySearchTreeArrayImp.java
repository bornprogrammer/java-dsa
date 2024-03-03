package binary;

public class BinarySearchTreeArrayImp {
    public int[] ages; //
    int i;

    public BinarySearchTreeArrayImp(int arrayLength) {
        ages = new int[arrayLength * 2];
        i = 0;
    }

    public BinarySearchTreeArrayImp push(int value) {
        this.insertRecursively(0, value);
        return this;
    }

    private void insertRecursively(int index, int value) {
        if (this.ages[index] == 0) {
            this.ages[index] = value;
        } else if (this.ages[index] < value) {
            insertRecursively(2 * index + 2, value);
        } else {
            insertRecursively(2 * index + 1, value);
        }
    }

    public void traverseASC() {
//        System.out.println(Arrays.toString(this.ages));
        this.printBSTRecursivelyForASC(0);
    }

    protected void printBSTRecursivelyForASC(int index) {
        if (this.ages[index] != 0) {
            int leftIndex = index * 2 + 1;
            if (this.doesIndexExists(leftIndex)) {
                printBSTRecursivelyForASC(leftIndex);
                System.out.println(this.ages[index]);
            } else {
                System.out.println(this.ages[index]);
            }
            int rightIndex = index * 2 + 2;
            if (this.doesIndexExists(rightIndex)) {
                printBSTRecursivelyForASC(rightIndex);
            }
        }
    }

    protected boolean doesIndexExists(int index) {
        return index >= 0 && index <= this.ages.length - 1;
    }
}
