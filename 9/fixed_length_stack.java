package p9;

public class fixed_length_stack implements stack_interface {
    
    private char[] data;
    private int top;
    
    fixed_length_stack( int size){
        data=new char[size];
        top=0;
    }

    public void push(char ch){
        if(isFull()){
            System.out.println("Stack Full");
            return;
        }
        data[top]=ch;
        top++;
    }
    public char pop()
    {
        if(isEmpty()){
            System.out.println("Stack Empty");
            return (char) 0;
        }
        top--;
        return data[top];
    }
    public boolean isEmpty(){
        return top==0;
    }
    public boolean isFull(){
        return top==data.length;
    }
}