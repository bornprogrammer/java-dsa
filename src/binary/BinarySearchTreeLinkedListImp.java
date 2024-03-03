package binary;

public class BinarySearchTreeLinkedListImp {
    private final BSTNode bstNode;

    public BinarySearchTreeLinkedListImp(int value) {
        this.bstNode = new BSTNode(value);
    }

    public BinarySearchTreeLinkedListImp push(int value) {
        this.insertRecursively(value, bstNode);
        return this;
    }

    protected BSTNode insertRecursively(int value, BSTNode bstNode) {
        if (bstNode == null) {
            return new BSTNode(value);
        } else {
            if (value >= bstNode.value) {
                bstNode.right = insertRecursively(value, bstNode.right);
            } else {
                bstNode.left = insertRecursively(value, bstNode.left);
            }
            return bstNode;
        }
    }

    public void traverseASC() {
        this.traverseASCRecursively(this.bstNode);
    }

    public void findMin() {
        int minVal = this.traverseForMinVal(this.bstNode);
        System.out.println(minVal);
    }

    public void findMax() {
        int maxVal = this.traverseForMaxVal(this.bstNode);
        System.out.println(maxVal);
    }

    public void findHeight() {
        int height = this.traverseForBSTHeight(null);
        System.out.println(height);
    }

    protected void traverseASCRecursively(BSTNode bstNode) {
        if (bstNode.left != null) {
            traverseASCRecursively(bstNode.left);
            System.out.println(bstNode.value);
        } else {
            System.out.println(bstNode.value);
        }
        if (bstNode.right != null) {
            traverseASCRecursively(bstNode.right);
        }
    }

    protected int traverseForMinVal(BSTNode bstNode) {
        if (bstNode.left != null) {
            return traverseForMinVal(bstNode.left);
        }
        return bstNode.value;
    }

    protected int traverseForMaxVal(BSTNode bstNode) {
        if (bstNode.right != null) {
            return traverseForMaxVal(bstNode.right);
        }
        return bstNode.value;
    }

    protected int traverseForBSTHeight(BSTNode bstNode) {
        int height = 0;
        if (bstNode != null) {
            if (bstNode.left != null || bstNode.right != null) {
                height = 1;
                height = height + traverseForBSTHeight(bstNode.left);
                height = height + traverseForBSTHeight(bstNode.right);
            }
        }
        return height;
    }


}
