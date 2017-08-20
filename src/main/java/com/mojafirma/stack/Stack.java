package com.mojafirma.stack;

import java.util.Optional;

public class Stack {

    private StackElement top = null;

    public void addToStack(int value){
        top = new StackElement(value, top);
    }
    public int removeFromStack(){
        if (top != null){
            int temp = top.getValue();
            top = top.getPrev();
            return temp;
        }
        return -1;
    }
    public int getPeakOfStack(){
        if (top != null){
            return top.getValue();
        }
        return -1;
    }

    public void printStack(){

        if (top != null) {
            StackElement temp = new StackElement(top);
            while (temp != null) {
                System.out.println(temp.getValue());
                temp = temp.getPrev();
            }

        }
    }
    public boolean isEmpty(){
        return top == null;
    }
}
