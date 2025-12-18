import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int p=0,ne=0,z=0;
for(int i=0;i<n;i++)
{
int x=sc.nextInt();
if(x>0)p++;
else if(x<0)ne++;
else z++;
}
System.out.println(p);
System.out.println(ne);
System.out.println(z);
}
}