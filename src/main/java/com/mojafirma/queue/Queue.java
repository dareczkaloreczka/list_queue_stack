package com.mojafirma.queue;

public class Queue {

    private QueueElement first = null;
    private QueueElement last = null;

    public void addToQueue(int value){
        QueueElement item = new QueueElement(value);
        item.setPrev(last);
        last=item;
        if(first == null){
            first = item;
        }
    }
    public int removeFromQueue(){
        if (last != null){
            int temp = first.getValue();
            QueueElement temQ = new QueueElement(last);
            while (temQ.getPrev() != first) {
                temQ = temQ.getPrev();
            }
            first = temQ;
            first.setPrev(null);
            return temp;
        }
        return -1;
    }
    public int getPeakOfQueue(){
        if (first != null){
            return first.getValue();
        }
        return -1;
    }
    public int getLastAdded(){
        if (last != null){
            return last.getValue();
        }
        return -1;
    }
    public void printQueue(){
        if (last != null){
            QueueElement temp = last;
            while (temp.getPrev() != null){
                System.out.println(temp.getValue());
                temp = temp.getPrev();
            }
            System.out.println(temp.getValue());
        }
    }

    public boolean isEmpty(){
        return last == null;
    }
}
