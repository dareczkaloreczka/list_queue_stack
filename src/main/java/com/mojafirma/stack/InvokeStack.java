package com.mojafirma.stack;

public class InvokeStack {

    public static void main(String[] args) {
    //invokeStackArray();
        invokeStack();
    }
    public static void invokeStack(){
        Stack stack = new Stack();
        stack.addToStack(4);
        System.out.println(stack.isEmpty());
        System.out.println(stack.getPeakOfStack());
        System.out.println(stack.removeFromStack());
        System.out.println(stack.isEmpty());
        stack.addToStack(5);
        stack.addToStack(8);
        System.out.println(stack.getPeakOfStack());
        stack.printStack();

    }
    public static void invokeStackArray(){
        StackOnArray stack = new StackOnArray(5);
        stack.addToStack(4);
        System.out.println(stack.isEmpty());
        System.out.println(stack.getPeakOfStack());
        System.out.println(stack.removeFromStack());
        System.out.println(stack.isEmpty());
        stack.addToStack(5);
        stack.addToStack(8);
        System.out.println(stack.getPeakOfStack());
        stack.printStack();

    }
}
