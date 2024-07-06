package com.exam.DataStructures;

public class Queue <K>{
    private K[] queueArray;
    private int maxSize;
    private int head, tail;
    public Queue (int size){
        this.maxSize = size;
        queueArray = (K[]) new Object[maxSize];
        head = 0;
        tail = 0;
    }

    public boolean isFull() { return head == maxSize; }
    public boolean isEmpty() { return tail > head; }

    public void enqueue(K value){
        if(!isFull()){
            queueArray[head] = value;
            head++;
        } else throw new IllegalStateException("The queue is full, cannot enqueue " + value);
    }

    public K dequeue(){
        if(!isEmpty()){
            tail++;
            return queueArray[tail-1];
        } else throw new IllegalStateException("The queue is empty, cannot dequeue");
    }

    public K head(){
        return queueArray[head-1];
    }

    public K tail(){
        return queueArray[tail];
    }

    public void showQueue(){
        for(int i = tail; i < head; i++) {
            if (i == tail) System.out.println("Queue tail " + queueArray[i]);
            else if (i == head - 1) System.out.println("Queue head " + queueArray[i]);
            else System.out.println(queueArray[i]);
        }
    }
}
