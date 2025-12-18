import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int min=sc.nextInt();
int max=min;
for(int i=1;i<n;i++)
{
int x=sc.nextInt();
if(x<min)min=x;
if(x>max)max=x;
}
System.out.println(max-min);
}
}