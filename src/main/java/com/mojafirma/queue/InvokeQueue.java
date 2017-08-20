package com.mojafirma.queue;

public class InvokeQueue {
    public static void main(String[] args) {
        //invokeQueueOnArray();
        invokeQueue();
    }
    public static void invokeQueueOnArray(){
        QueueOnArray queueArr = new QueueOnArray(5);
        queueArr.addToQueue(10);
        queueArr.addToQueue(11);
        queueArr.addToQueue(5);
        queueArr.printQueue();
        System.out.println(queueArr.getLastAdded());
        System.out.println(queueArr.getPeakOfQueue());
        System.out.println(queueArr.removeFromQueue());
        System.out.println(queueArr.getPeakOfQueue());
        System.out.println(queueArr.isEmpty());
    }
    public static void invokeQueue(){
        Queue queue = new Queue();
        queue.addToQueue(10);
        queue.addToQueue(11);
        queue.addToQueue(5);
        queue.printQueue();
        System.out.println(queue.getLastAdded());
        System.out.println(queue.getPeakOfQueue());
        System.out.println(queue.removeFromQueue());
        System.out.println(queue.getPeakOfQueue());
        System.out.println("nowy test");
        queue.addToQueue(8);
        queue.printQueue();
        System.out.println(queue.isEmpty());
    }
}
