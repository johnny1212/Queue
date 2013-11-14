package Main;

import Queue.Queue;

/**
 *
 * @author Johnny
 */
public class MainQueue {

    public static void main(String[] args) {
        System.out.println("FRONTA");

        Queue<String> fronta = new Queue();
        fronta.push("AA");
        fronta.push("BB");
        fronta.push("CC");

        System.out.println("-" + fronta.pop());
        System.out.println("-" + fronta.pop());
        System.out.println("-" + fronta.pop());
    }
}
