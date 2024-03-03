public class SimpleLinkedList {

    public Integer age;

    public SimpleLinkedList next;

    public SimpleLinkedList(Integer age)
    {
        this.age = age;
    }

    public Integer getAge()
    {
        return this.age;
    }

    public SimpleLinkedList next()
    {
        return this.next;
    }

    public void setNext(SimpleLinkedList next)
    {
        this.next = next;
    }

}
