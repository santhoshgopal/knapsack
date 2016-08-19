import java.io.*;
import java.util.*;
public class knapsack
{
public static void main(String[] args)
{

ArrayList<Integer> one=new ArrayList<Integer>();
int temp=0,i,j=0,count=0;
Scanner in = new Scanner(System.in);
System.out.println("ENTER THE NUMBER OF COINS");
int len=in.nextInt();
int[] a=new int[len];

System.out.println("ENTER THE MONEY");
for(int k=0;k<len;k++)
{
	one.add(in.nextInt());
		
}
System.out.println("ENTER THE AMOUNT TARGET");
int amt=in.nextInt();

Collections.sort(one);
Collections.reverse(one);


	while(amt>=0)
	{
		if((amt/one.get(j))>0)
		{
		
		count+=amt/one.get(j);

		amt=amt-one.get(j);

		}	
		else if(amt>0)
		{
		j++;
		}
		if(amt==0)
		break;
	}


System.out.println(count);
	}
}