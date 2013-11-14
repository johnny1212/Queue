package Queue;

import LinearniSeznam.LinearniSeznam;

/**
 *
 * @author Johnny
 */
public class Queue<T> {

    private LinearniSeznam seznam = new LinearniSeznam();
    private int count = 0;

    public Queue() {
    }

    public void push(T data) {
        seznam.addNodeLast(data);
        count++;
    }

    public T pop() {
        if (count == 0) {
            return null;
        }
        count--;
        return (T) seznam.deleteFirst();
    }
}
