import java.util.*;
import java.util.Random;
class Number{
public static void main(String[] args){
Random rand=new Random();
int a=rand.nextInt(100);
Scanner sc=new Scanner(System.in);
int n=5;
System.out.println("Rules for this game");
System.out.println("You have to guess a number in between 1 to 100.");
for(int i=0;i<n;i++)
{
System.out.println("You have "+(n-i)+" chances to play.");
System.out.print("Enter the number:");
int num=sc.nextInt();
if(num<a)
{
System.out.println("You have guessed too low.");
}
else if(num==a)
{
System.out.println("Hurray! you have guessed correct number.");
}
else
{
System.out.println("You have guessed too high");
} 
int score=0;
if(num==a){
score++;
System.out.println("Your Score is:"+score);
}
else{
System.out.println("Your Score is:"+score);
}
}
System.out.println("You have finished your chances");
System.out.println("Try next time.Have a good day!");
}
}
