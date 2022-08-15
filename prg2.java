//Write a JAVA program to implement Inner class and demonstrate its Access protection.

class outer{
    int x=100;
    class inner{
        int y=200;
        void imethod(){
            System.out.println("Accessing from inner class");
            System.out.println(x);
            System.out.println(x+y);
        }
    }
    void display(){
        inner ob1=new inner();
        System.out.println("Value of inner class="+ob1.y);
        System.out.println("Value of outer class="+x);
    }
}
public class prg2 {
    public static void main(String[] args) {
        outer ob2=new outer();
        ob2.display();
        outer.inner ob3=ob2.new inner();
        ob3.imethod();
    }
}