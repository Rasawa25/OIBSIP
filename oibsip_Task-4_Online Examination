import java.util.Scanner;
class reg{
Scanner sc=new Scanner(System.in);
menu mm=new menu();
void r1(){
System.out.println("\n Enter your Name:");
String name=sc.nextLine();
System.out.println("Enter your Mail:");
String mail=sc.nextLine();
System.out.println("Enter your Password:");
int pp=sc.nextInt();
System.out.println("\n Registration Sucessful!!");
System.out.println("\n ----Login----");
while(true)
{
System.out.println("Enter your Mail:");
String s=sc.next();
System.out.println("Enter your Password:");
int p=sc.nextInt();
if(s.equals(mail) && p==pp){
mm.m2();
break;
}
else
{
System.out.println("Your entered Mail or Password is incorrect");
}
}
}
}
class abt{
void display(){
System.out.println("Name:Radhika Asawa");
System.out.println("Mail:radhikaasawa136@gmail.com");
}
}
class menu{
Java j=new Java();
DBMS db=new DBMS();
mat m=new mat();
abt a=new abt();
Scanner sc=new Scanner(System.in);
public void m2()
{
System.out.println("\n Login Succesful");
while(true){
System.out.println("\n 1.My Account\n 2.Exam\n 3.About\n 4.Exit");
System.out.println("\n Enter your option:");
int o=sc.nextInt();
if(o==1)
{
a.display();
System.out.println("\n 1.Back\n 2.Exit");
int g1=sc.nextInt();
if(g1==1){
System.out.println("\n");
}
else{
break;
}
}
else if(o==2){
System.out.println("\n 1.Java\n 2.DBMS\n 3.Maths");
System.out.println("\n select the subject");
int su=sc.nextInt();
if(su==1){
j.j1();
}
else if(su==2){
db.d1();
}
else if(su==3)
{
m.mat1();
}
else
{
System.out.println("Choose the correct one");
}
System.out.println("\n 1.Back\n 2.Exit");
int g2=sc.nextInt();
if(g2==1){
System.out.println("\n");
}
else{
break;
}
}
else if(o==3){
System.out.println("\n Online Examination Portal");
System.out.println("\n Stanley College Of Engineering And Technology For Women");
System.out.println("\n 1.Back\n 2.Exit");
int g3=sc.nextInt();
if(g3==1){
System.out.println("\n");
}
else{
break;
}
}
else if(o==4){
break;
}
else{
System.out.println("\n Choose the correct option");
}
}
}
}
class exam{
Scanner sc=new Scanner(System.in);
public void m1(){
menu m=new menu();
int pswd=1234;
System.out.println("Enter your Mail:");
String s=sc.next();
while(true){
System.out.println("Enter your Password:");
int p=sc.nextInt();
if(p == pswd){
m.m2();
break;
}
else{
System.out.println("Your entered Mail and Password are incorrect");
}
}
}
}
class Java{
Scanner sc=new Scanner(System.in);
void j1(){
int count=0;
System.out.println("\n There are 5 questions where each question carries 2 marks");
System.out.println("\n Question 1:");
System.out.println("\n Which package contains the Random Class? ");
System.out.println("\n 1.java.util package");
System.out.println("2.java.lang package");
System.out.println("3.java.awt package");
System.out.println("4.java.io package \n");
int u1=sc.nextInt();
if(u1==1){
count++;
}
else{
count=count;
}

System.out.println("\n Question 2:");
System.out.println("\n Which of the following option leads to portability and security of java? ");
System.out.println("\n 1.Bytecode is executed by JVM");
System.out.println("2.The applet makes the java code source and portable");
System.out.println("3.Use of exception handling");
System.out.println("4.Dynamic binding between objects \n");
int u2=sc.nextInt();
if(u2==1){
count++;
}
else{
count=count;
}

System.out.println("\n Question 3:");
System.out.println("\n Which of the following is not a java feature?");
System.out.println("\n 1.Dynamic");
System.out.println("2.Architectural Neutral");
System.out.println("3.Use of pointers");
System.out.println("4.Object-oriented \n");
int u3=sc.nextInt();
if(u3==3){
count++;
}
else{
count=count;
}

System.out.println("\n Question 4:");
System.out.println("\n What is the return type of the hashCode() method in the Object class?");
System.out.println("\n 1.Object");
System.out.println("2.int");
System.out.println("3.long");
System.out.println("4.void \n");
int u4=sc.nextInt();
if(u4==2){
count++;
}
else{
count=count;
}

System.out.println("\n Question 5:");
System.out.println("\n Evaluate the following Java expression ,if x=3,y=5 and z=10  ++z+y-y+z+x++");
System.out.println("\n 1.24");
System.out.println("2.23");
System.out.println("3.20");
System.out.println("4.25 \n");
int u5=sc.nextInt();
if(u5==4){
count++;
}
else{
count=count;
}
if(count>4){
System.out.println("\n Your performance is too good");
}
else if(count>2 && count<5){
System.out.println("\n Can do better!!");
}
else
{
System.out.println("\n Your performance is too bad");
}
System.out.println("\n--------------------");
System.out.println("Your total score is:"+count*2);
System.out.println("\n");
System.out.println("\n The number of questions answered correct are:"+count);
}
}
class DBMS{
Scanner sc=new Scanner(System.in);
void d1(){
int count=0;
System.out.println("\n There are 5 questions where each question carries 2 marks");
System.out.println("\n Question 1:");
System.out.println("\n Which of the following is the full form of DDL");
System.out.println("\n 1.Data Definition Language");
System.out.println("2.Data Derivation Language");
System.out.println("3.Dynamic Data Language");
System.out.println("4.Detailed Data Language \n");
int u1=sc.nextInt();
if(u1==1){
count++;
}
else{
count=count;
}

System.out.println("\n Question 2:");
System.out.println("\n Which of the following is the property of transction that protects data from system failure?");
System.out.println("\n 1.Atomiticy");
System.out.println("2.Isolation");
System.out.println("3.Durability");
System.out.println("4.Consistency \n");
int u2=sc.nextInt();
if(u2==3){
count++;
}
else{
count=count;
}

System.out.println("\n Question 3:");
System.out.println("\n What is the rows of relation known as?");
System.out.println("\n 1.Degree");
System.out.println("2.Entity");
System.out.println("3.Tuple");
System.out.println("4.None \n");
int u3=sc.nextInt();
if(u3==3){
count++;
}
else{
count=count;
}

System.out.println("\n Question 4:");
System.out.println("\n Which of the following is a command of DDL?");
System.out.println("\n 1.Alter");
System.out.println("2.Delete");
System.out.println("3.Create");
System.out.println("4.Both 1 and 3\n");
int u4=sc.nextInt();
if(u4==4){
count++;
}
else{
count=count;
}

System.out.println("\n Question 5:");
System.out.println("\n Which of the following SQL command is used for removing/deleting a relation from the database?");
System.out.println("\n 1.Drop");
System.out.println("2.Delete");
System.out.println("3.RollBack");
System.out.println("4.Remove\n");
int u5=sc.nextInt();
if(u5==1){
count++;
}
else{
count=count;
}

if(count>4){
System.out.println("\n Your performance is too good");
}
else if(count>2 && count<5){
System.out.println("\n Can do better!!");
}
else
{
System.out.println("\n Your performance is too bad");
}
System.out.println("\n--------------------");
System.out.println("Your total score is:"+count*2);
System.out.println("\n");
System.out.println("\n The number of questions answered correct are:"+count);
}
}
class mat{
Scanner sc=new Scanner(System.in);
void mat1(){
int count=0;
System.out.println("\n There are 5 questions where each question carries 2 marks");
System.out.println("\n Question 1:");
System.out.println("\n What is the next prime number after 3?");
System.out.println("\n 1.6");
System.out.println("2.5");
System.out.println("3.9");
System.out.println("4.7 \n");
int u1=sc.nextInt();
if(u1==2){
count++;
}
else{
count=count;
}

System.out.println("\n Question 2:");
System.out.println("\n What is 15-7?");
System.out.println("\n 1.10");
System.out.println("2.2");
System.out.println("3.12");
System.out.println("4.8\n");
int u2=sc.nextInt();
if(u2==4){
count++;
}
else{
count=count;
}

System.out.println("\n Question 3:");
System.out.println("\n Which is greater -50 or -25?");
System.out.println("\n 1.-50");
System.out.println("2.-25");
System.out.println("3.none");
System.out.println("4.both \n");
int u3=sc.nextInt();
if(u3==2){
count++;
}
else{
count=count;
}

System.out.println("\n Question 4:");
System.out.println("\n Simplify the following 20+2*4-1*28?");
System.out.println("\n 1.16");
System.out.println("2.324");
System.out.println("3.9");
System.out.println("4.0 \n");
int u4=sc.nextInt();
if(u4==4){
count++;
}
else{
count=count;
}

System.out.println("\n Question 5:");
System.out.println("\n What comes next in the fibonacci sequence:0,1,1,2,3,5,8,13,....?");
System.out.println("\n 1.15");
System.out.println("2.23");
System.out.println("3.17");
System.out.println("4.21 \n");
int u5=sc.nextInt();
if(u5==4){
count++;
}
else{
count=count;
}

if(count>4){
System.out.println("\n Your performance is too good");
}
else if(count>2 && count<5){
System.out.println("\n Can do better!!");
}
else
{
System.out.println("\n Your performance is too bad");
}
System.out.println("\n--------------------");
System.out.println("Your total score is:"+count*2);
System.out.println("\n");
System.out.println("\n The number of questions answered correct are:"+count);
}
}
class online_examination{
public static void main(String[] args){
exam e=new exam();
reg rr=new reg();
Scanner sc=new Scanner(System.in);
System.out.println("\n Welcome to Online Examination Portal..");
System.out.println("\n 1.Login\n 2.SignUp");
System.out.println("\n Enter your option");
int r=sc.nextInt();
if(r==1){
System.out.println("\n Welcome to the portal");
System.out.println("\n ----Login----");
e.m1();
}
else{
System.out.println("\n ----SignUp----");
rr.r1();
}
}
}



