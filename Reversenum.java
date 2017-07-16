import java.util.*;
public class Reversenum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int ans=0;
while(n>0)
{
	int m=n%10;
	ans=ans*10+m;
	n=n/10;
}
System.out.println(ans);
}
}
