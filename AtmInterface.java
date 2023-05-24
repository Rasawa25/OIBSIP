import java.util.Scanner;
class BankAccount
{
String name;
String password;
String accountNo;
String userName;
float balance=50000f;
int transactions=0;
String transactionHistory="";
public void register()
{
Scanner sc=new Scanner(System.in);
System.out.println("\n Enter Your Name:");
this.name=sc.nextLine();
System.out.println("\n Enter Your UserName:");
this.userName=sc.nextLine();
System.out.println("\n Enter Your Password:");
this.password=sc.nextLine();
System.out.println("\n Enter Your Account Number:");
this.accountNo=sc.nextLine();
System.out.println("\n Registration Successful!! Please Login");
}
public boolean login()
{
boolean isLogin=false;
Scanner sc=new Scanner(System.in);
while(!isLogin)
{
System.out.println("\n Enter Your Username:");
String Username=sc.nextLine();
if(Username.equals(userName))
{
while(!isLogin)
{
System.out.println("\n Enter Your Password:");
String Password=sc.nextLine();
if(Password.equals(password))
{
System.out.println("\n Login Successful!!");
isLogin=true;
}
else
{
System.out.println("\n Incorrect Password");
}
}
}
else
{
System.out.println("\n Username Not Found");
}
}
return isLogin;
}
public void withdraw()
{
System.out.println("\n Enter the amount to be withdrawn:");
Scanner sc=new Scanner(System.in);
float amount=sc.nextFloat();
try
{
if(balance>=amount)
{
transactions++;
balance-=amount;
System.out.println("\n Withdrawal Successful");
String str=amount+"Rs Withdrawed\n";
transactionHistory=transactionHistory.concat(str);
}
else
{
System.out.println("\n Balance is not sufficient for a withdrawal");
}
}
catch(Exception e)
{
}
}

public void deposit()
{
System.out.println("\n Enter the amount to be deposited:");
Scanner sc=new Scanner(System.in);
float amount=sc.nextFloat();
try
{
if(amount<=50000f)
{
transactions++;
balance+=amount;
System.out.println("\n Amount Deposited Successfully");
String str=amount+"Rs deposited\n";
transactionHistory=transactionHistory.concat(str);
}
else
{
System.out.println("\n Sorry!The amount can't be deposited as the limit is only 50000.00");
}
}
catch(Exception e)
{
}
}

public void transfer()
{
Scanner sc=new Scanner(System.in);
System.out.println("\n Enter receipent's Name:");
String receipent=sc.nextLine();
System.out.println("\n Enter the amount to be transferred:");
float amount=sc.nextFloat();
try
{
if(balance>=amount)
{
if(amount<=30000f)
{
transactions++;
balance-=amount;
System.out.println("\n Transaction Successful!! Transaction made to:"+receipent);
String str=amount+"Rs transferred to"+receipent+"\n";
transactionHistory=transactionHistory.concat(str);
}
else
{
System.out.println("\n Sorry!!The amount to be transferred is out of limit");
}
}
else
{
System.out.println("\n Balance is not sufficient for transaction");
}
}
catch(Exception e)
{
}
}

public void checkBalance()
{
System.out.println("\n The current balance is:"+balance+"Rs");
}
public void transactionHistory()
{
if(transactions==0)
{
System.out.println("\n Empty");
}
else
{
System.out.println("\n"+transactionHistory);
}
}
}
class AtmInterface
{
public static int takeIntegerInput(int limit)
{
int input=0;
boolean flag=false;
while(!flag)
{
try
{
Scanner sc=new Scanner(System.in);
input=sc.nextInt();
flag=true;
if(flag && input > limit || input < 1)
{
System.out.println("Choose the number between 1 to"+limit);
flag=false;
}
}
catch(Exception e)
{
System.out.println("\n Enter only Integer value");
flag=false;
}
};
return input;
}
public static void main(String args[])
{
System.out.println("\n ----WELCOME TO STATE BANK OF INDIA ATM SYSTEM----\n");
System.out.println("1.Register\n 2.Exit");
System.out.println("\n Enter Your Choice:");
int choice=takeIntegerInput(2);
if(choice==1)
{
BankAccount b=new BankAccount();
b.register();
while(true)
{
System.out.println("1.Login\n 2.Exit");
System.out.println("Enter Your Choice:");
int ch=takeIntegerInput(2);
if(ch==1)
{
if(b.login())
{
System.out.println("\n ---WELCOME TO SBI---"+b.name+"\n");
boolean isFinished=false;
while(!isFinished)
{
System.out.println("\n 1.Withdrawal\n 2.Deposit\n 3.Transfer\n 4.CheckBalance\n 5.Transaction History\n");
System.out.println("\n Enter Your Choice:");
int c=takeIntegerInput(6);
switch(c)
{
case 1:
b.withdraw();
break;
case 2:
b.deposit();
break;
case 3:
b.transfer();
break;
case 4:
b.checkBalance();
break;
case 5:
b.transactionHistory();
break;
case 6:
isFinished=true;
break;
}
}
}
}
else
{
System.exit(0);
}
}
}
else
{
System.exit(0);
}
}
}











