package binary;

public class BinarySearchTreeArrayClient {

    private final BinarySearchTreeArrayImp binarySearchTreeArrayImp;

    public BinarySearchTreeArrayClient(int length) {
        this.binarySearchTreeArrayImp = new BinarySearchTreeArrayImp(length);
    }

    public void insertAndPrint() {
        this.binarySearchTreeArrayImp.push(34).push(25).push(45).push(15).push(30).push(40).push(60).push(27).push(32).push(42).push(50).push(70).traverseASC();
    }
}
