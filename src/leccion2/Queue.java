package leccion2;

public interface Queue {
    public void enqueue( object obj);
    public Object dequeue();
    public boolean isEmpty();
    public Object peek();
}
