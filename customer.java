import java.util.Scanner;

class Bank{
 
                   private double balance=6000;
               private int pin=3434;
          public void checkbalance()
       {
                  System.out.println("Enter Your Pin");
               Scanner s=new Scanner(System.in);
            int atmpin=s.nextInt();
             if(atmpin==pin)
  {
             System.out.println("Your Balance is:"+balance);
         
}
else
{
 System.out.println("Your Pin is Incorrect!");
 }
Menu();
}
public void widhrawmoney( )
 {
           System.out.println("Enter Your Atm Pin ");
               Scanner c=new Scanner(System.in);
          int atmpin=c.nextInt();
                 if(atmpin==pin)
     {
                 System.out.println("Enter Your Amount For Widhraw");
             Scanner sc=new Scanner(System.in);
               double Money=sc.nextInt();
                 if(Money<balance)
            {
                      balance=balance-Money;
                       System.out.println("Withrawl Succesfully");
  }
    else
 {
  System.out.println("Insufficint Amount in Your Bank");
}
  
}
else 
{
       System.out.println("Incorrect Pin");
}
Menu();
}
         
public void depositemoney( )
 {
           System.out.println("Enter Your Atm Pin ");
               Scanner e=new Scanner(System.in);
          int atmpin=e.nextInt();
                 if(atmpin==pin)
     {
                 System.out.println("Enter Your Amount For Deposite");
              Scanner r=new Scanner(System.in);
               double Money=r.nextInt();
                   balance=balance+Money;
                       System.out.println("Deposite Succesfully");
  }
 else
 {
 
  System.out.println("Incorrect Your Pin");
}
Menu();
}

public void Menu()
{
               int ch;
            System.out.println("1: Check Balance");
       System.out.println("2: Widhraw Money");
       System.out.println("3: Deposite Money");
      System.out.println("4: Exit");
System.out.println("Enter Your Choice");
Scanner sc=new Scanner(System.in);
ch=sc.nextInt();
       switch(ch)
{
           case 1:
             checkbalance();

           break;
        case 2:
              widhrawmoney();
           break;
 case 3:
           depositemoney();
           break;
   case 4:
      return;	
 default :
 System.out.println("Enter Correct Choice");
 }
}
}
class customer{
 
  public static void main(String[]args)
 {
             Bank r=new Bank();
              r.Menu();
}
}
   


                