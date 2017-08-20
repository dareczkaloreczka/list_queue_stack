package com.mojafirma.stack;

public class StackOnArray {

    private int [] stackArray;
    private int index = 0;

    public StackOnArray(int arrSize) {
        this.stackArray = new int[arrSize];
    }
    public boolean isEmpty(){
        if (this.index == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public void addToStack(int item){
        if (index < stackArray.length) {
            stackArray[index] = item;
            index++;
        }
    }
    public int removeFromStack(){
        if (index>0) {
            index--;
            return stackArray[index];
        }
        return 0;
    }
    public int getPeakOfStack(){
        return stackArray[index-1];
    }
    public void printStack(){
        for (int item = 0; item < index; item++){
            System.out.println(stackArray[item]);
        }
    }
}
