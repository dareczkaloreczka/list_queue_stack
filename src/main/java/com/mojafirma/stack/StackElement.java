package com.mojafirma.stack;

public class StackElement {

    private int value;
    private StackElement prev = null;

    public StackElement(int value, StackElement prev) {
        this.value = value;
        this.prev = prev;
    }
    public StackElement(StackElement item){
        this.value = item.value;
        this.prev = item.prev;
    }

    public int getValue() {
        return value;
    }

    public StackElement getPrev() {
        return prev;
    }
}
