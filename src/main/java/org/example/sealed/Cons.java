package org.example.sealed;

public sealed class Cons<T> implements SealedClass<T> {

    private T head;
    private SealedClass<T> tail;

    public Cons(T head, SealedClass<T> tail) {
        this.head = head;
        this.tail = tail;
    }
}

final class SubCons<T> extends Cons<T> {
    public SubCons(T head, SealedClass<T> tail) {
        super(head, tail);
    }
}
