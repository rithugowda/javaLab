import java.util.Scanner;

/*import java.util.Scanner;

import JAVA.stack;

class acc{    
    int bal,acno,name;
        acc(int a){
            bal=500;
            acno=a;
            System.out.println("Account is created with min balance 500");
        }
    //void create_account(){
    //}
    void deposite(int amt){
        bal+=amt;
        System.out.println("Account balance="+bal);
    }
    void withdraw(int amt){
        System.out.println("The withdraw amount is="+amt);
        bal-=amt;
        if(bal>500){
            System.out.println("Amount withdrawn. Account balance="+bal);
        }
        else{
            System.out.println("Account balance should be 500");
        }
    }
}
public class bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Create\n2.Deposite\n3.Withdraw\n");
            System.out.println("Enter your choice");
            int ch=sc
        }
        acc a=new acc();
        a.create_account();
        System.out.println("Enter the amount to be deposited:");
        int amount=sc.nextInt();
        a.deposite(amount);
        System.out.println("Enter the amount to be withdraw");
        amount=sc.nextInt();
        a.withdraw(amount);
    }
}*/









class LessBalanceException extends Exception{
    LessBalanceException(double amt){
        System.out.println("Withdrawing"+amt+"is invalid");
    }
}
class user{
    String name;
    user(String name){
        this.name=name;
    }
    class account{
        int accno;
        Double balance;
        account(int accno,Double balance){
            this.accno=accno;
            this.balance=balance;
        }
    }
    account [] a=new account[2];
    void deposite(Double amt,int ano){
        int found=0,k=-1;
        for(int i=0;i<2;i++)
        if(a[i].accno==ano){
            a[i].balance+=amt;
            found=1;
            k=i;
            break;
        }
        if(found==1){
            System.out.println("Balance updated");
            display(a[k].accno);
        }
        else{
            System.out.println("Account number doesnot exists");
        }
    }
    void withdrawal(Double amount,int accno)throws LessBalanceException{
        int k=-1,found=0;
        for(int i=0;i<2;i++)
        if(a[i].accno==accno){
            k=i;
            found=1;
            break;
        }
        if(found==1){
            if((a[k].balance<500)||(a[k].balance<amount))
                throw new LessBalanceException(amount);
                else{
                    a[k].balance-=amount;
                    display(a[k].accno);
                }
        }
        else
            System.out.println("Account number doesnot exist");
    }
    void create_account(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            System.out.println("Enter the account number");
            int accno=sc.nextInt();
            System.out.println("Enter balance");
            Double bal=sc.nextDouble();
            a[i]=new account(accno, bal);
        }
    }
    void display(int accno){
        int k=-1,found=0;
        for(int i=0;i<2;i++)
        if(a[i].accno==accno){
            k=i;
            found=1;
            break;
        }
        if(found==1){
            System.out.println("Acount details");
            System.out.println(name+"\t"+a[k].accno+"\t"+a[k].balance);
            System.out.println("=================================");
        }
    }
}
public class prg5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Create account with minimum balance 500");
        System.out.println("Enter Owner name");
        String name=sc.next();
        int accno;
        user u=new user(name);
        u.create_account();
        System.out.println("Acount created successfully");
        Boolean opt=true;
        while(opt){
            System.out.println("1.Balance\n2.Deposite\n3.Withdrawal");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("Account details");
                        System.out.println("Enter the account number");
                        accno=sc.nextInt();
                        u.display(accno);
                        break;
                case 2: System.out.println("Enter the account number");
                        accno=sc.nextInt();
                        System.out.println("Enter the amount to deposite");
                        Double amt=sc.nextDouble();
                        u.deposite(amt, accno);
                        break;
                case 3: try {
                                System.out.println("Enter account number");
                                accno=sc.nextInt();
                                System.out.println("Enter amount to withdrawal");
                                Double amount=sc.nextDouble();
                                u.withdrawal(amount, accno);
                        } catch (LessBalanceException e) { }
                        break;
                    //TODO: handle exception
            }
        }
    }
    
}