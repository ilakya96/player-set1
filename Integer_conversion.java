import java.io.*;


public class Integer_conversion {
 public static void main(String args[]) throws IOException
 {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	Integer n=Integer.parseInt(str);
	System.out.println(n);
 }
}
