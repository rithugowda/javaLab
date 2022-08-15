package p9;

public class dynamic_stack_length implements stack_interface{
    private char[] data;
    private int top;

    dynamic_length_stack(int size){
        data=new char[size];
    }

    public void push(char ch){
        if(top==data.length){
            char[] temp=new char[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        data[top]=ch;
        top++;
    }
    public char pop(){
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
        return false;
    }
}