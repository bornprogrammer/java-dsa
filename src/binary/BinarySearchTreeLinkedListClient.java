package binary;

public class BinarySearchTreeLinkedListClient {
    public void handle() {
        BinarySearchTreeLinkedListImp binarySearchTreeLinkedListImp = new BinarySearchTreeLinkedListImp(34)
                .push(25).push(45).push(15).push(30).push(27).push(32);
        binarySearchTreeLinkedListImp.traverseASC();
        binarySearchTreeLinkedListImp.findMin();
        binarySearchTreeLinkedListImp.findMax();
        binarySearchTreeLinkedListImp.findHeight();
    }

}
