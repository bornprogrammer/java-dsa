public class SimpleLinkedListClient {
    public SimpleLinkedList rootNode;

    public SimpleLinkedListClient(Integer age) {
        this.rootNode = new SimpleLinkedList(age);
    }

    public SimpleLinkedListClient createNode(Integer age) {
        SimpleLinkedList node = new SimpleLinkedList(age);
        SimpleLinkedList next = this.rootNode;
        while (next.next() != null) {
            next = next.next();
        }
        next.setNext(node);
        return this;
    }

}
