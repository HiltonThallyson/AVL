package br.com.waldson.aula15;

import java.time.Duration;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {
        AvlTree<Pessoa> tree = new AvlTree<>();
        long start, end, timeDifference;
        start = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            tree.insert(new Pessoa(i));
        }
//        tree.insert(new Pessoa(3));
//        tree.insert(new Pessoa(2));
//        tree.insert(new Pessoa(1));
//        tree.insert(new Pessoa(4));
//        tree.insert(new Pessoa(5));
//        tree.insert(new Pessoa(6));
//        tree.insert(new Pessoa(7));
        end = System.nanoTime();
        timeDifference = (end - start);
        System.out.println("Time in nanoseconds: " + timeDifference);
//        tree.remove(4);
        if (tree.isBalanced()) {
            System.out.println("Está balanceada");
        }
    }
}
