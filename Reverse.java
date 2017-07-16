import java.util.*;
public class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
char str[]=sc.nextLine().toCharArray();
String ans="";
for(int i=str.length-1;i>=0;i--)
{
ans=ans+str[i];
}
System.out.println(ans);
}
}
