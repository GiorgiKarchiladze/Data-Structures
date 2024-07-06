package com.exam.DataStructures;

public class Stack <K>{
    private K[] stackArray;
    private int maxSize;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        stackArray=(K[]) new Object[maxSize];
        top = -1;
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(K value){
        if(!isFull()){
            stackArray[++top]=value;
        } else throw new IllegalStateException("The stack is full, cannot push " + value);
    }
    public K pop(){
        if(!isEmpty()){
            System.out.println("Pop completed: " + stackArray[top]);
            return stackArray[top--];
        } else throw new IllegalStateException("The stack is empty, cannot pop");
    }
    public K peek(){
        if(!isEmpty()){
            return this.stackArray[top];
        } else throw new IllegalStateException("The stack is empty, cannot peek");
    }

    public void showStack(){
        for (int i = top; i >= 0 ; i--) {
            if(i == top) System.out.println("Stack top: " + stackArray[i]);
            else if(i == 0) System.out.println("Stack bottom: " + stackArray[i]);
            else System.out.println(stackArray[i]);
        }
    }

}
