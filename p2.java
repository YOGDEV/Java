//command line argument
class Account {

int  AccountNo;
String Name;
float Amount;


void insert(int acNo ,String Name , float am)
{
 AccountNo=acNo;
 Name =Name;
 Amount = am;
 System.out.println("Account Created Successfully \n");
}

void deposit(float am)
{
 Amount += am;
}

void withdraw(float am)
{
 if(am<Amount)
  Amount -=am;
else
 System.out.println("transation failed due to insufficient balance \n");
}

void checkBal()
{
System.out.println("Amount Balanced is = "+Amount+"\n");
}


void display()
{
System.out.println( "AccountNo = "+ AccountNo);

System.out.println("Name = " +Name);

System.out.println("Amount = "+Amount);
}

public static void main(String args[]){
Account a =new Account();
int ac=Integer.parseInt(args[0]);
String n=args[1];
float am=Float.parseFloat(args[2]);
a.insert(ac,n,am);
a.deposit(2000);
a.withdraw(34000);
a.checkBal();
a.display();
}


}
