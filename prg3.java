import java.util.Scanner;

public class prg3 {
    public static void main(String[] args) {
        String str1,str2=" ",str3,str4,str5;
        int len,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        str1=sc.next();
        System.out.println("String is="+str1);
        System.out.println("Length of the string="+str1.length()+"\n");
        StringBuffer sb=new StringBuffer(str1);
        System.out.println("The capacity of the string="+sb.capacity());
        len=sb.length();
        if(len==0){
            System.out.println("String is empty"); 
        }
        else{
            for(i=len-1;i>=0;i--){
                str2=str2+str1.charAt(i);
            }
            System.out.println("Reversed string is="+str2);
            str3=str2.toUpperCase();
            System.out.println("Uppercase="+str3);
            System.out.println("Enter another string:");
            str4=sc.next();
            StringBuffer sb1=new StringBuffer(str3);
            str5=sb1.append(str4).toString();
            System.out.println("The appended string is="+str5);
        }
    }
}