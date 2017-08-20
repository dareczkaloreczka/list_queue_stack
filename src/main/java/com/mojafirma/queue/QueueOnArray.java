package com.mojafirma.queue;

public class QueueOnArray {

    private int index = 0;
    private int[] arrQueue;

    public QueueOnArray(int size) {
        this.arrQueue = new int[size];
    }
    public boolean isEmpty(){
        return index == 0;
    }
    public void addToQueue(int item){
        if (index < arrQueue.length - 1){
            arrQueue[index] = item;
            index++;
        }
    }
    public int removeFromQueue(){
        if (index > 0){
            int temp = arrQueue[0];
            for (int i = 1; i <arrQueue.length ; i++) {
                arrQueue[i-1] = arrQueue[i];
            }
            index--;
            return temp;
        }
        return -1;
    }
    public int getPeakOfQueue(){
        if (index > 0) {
            return arrQueue[0];
        }
        return -1;
    }
    public void printQueue(){
        for (int i = 0; i <index ; i++) {
            System.out.println(arrQueue[i]);
        }
    }
    public int getLastAdded(){
        if (index>0){
            return arrQueue[index-1];
        }
        return -1;
    }
}
