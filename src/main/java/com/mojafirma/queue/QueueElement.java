package com.mojafirma.queue;

public class QueueElement {

    private int value;
    private QueueElement prev = null;
    private QueueElement next = null;

    public QueueElement(int value) {
        this.value = value;
    }
    public QueueElement(QueueElement item){
        this.value = item.value;
        this.prev = item.prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public QueueElement getPrev() {
        return prev;
    }

    public void setPrev(QueueElement prev) {
        this.prev = prev;
    }

    public QueueElement getNext() {
        return next;
    }

    public void setNext(QueueElement next) {
        this.next = next;
    }
}
