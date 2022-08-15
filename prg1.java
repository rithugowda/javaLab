/*Write a JAVA program to demonstrate Constructor Overloading and Method Overloading.*/

import java.util.Scanner;

class cons_over{
    double l,b,h;
    cons_over(double a,double d,double c){ //cuboid constructor overloading
        l=a;
        b=d;
        h=c;
    }
    cons_over(double a){ //cube constructor overloading
        l=b=h=a;
    }
    double volume()
    {
        return l*b*h;
    }
    void print()//method overloading
    {
        System.out.println("Demonstrating method overloading and constructor overloading");
    }
    void print(double v)//method overloading
    {
        System.out.printf("VOLUME OF BOX="+v+"\n");
        
    }
}
public class prg1 {
    public static void main(String[] args) {
        //double a,d,c;
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the Length,Breadth,Height");
        //a=sc.nextDouble();
        //d=sc.nextDouble();
        //c=sc.nextDouble();
        cons_over cube=new cons_over(3);
        double v1=cube.volume();
        cube.print();
        cube.print(v1);
        cons_over cuboid=new cons_over(3,4,5);
        double v2=cuboid.volume();
        cuboid.print();
        cuboid.print(v2);
    }
}