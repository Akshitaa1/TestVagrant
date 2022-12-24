import java.util.*;
import java.lang.*;

public class Newspaper {
	
public static void main(String args[])

{
	Scanner sc=new Scanner(System.in);
	double cost[][]=new double[5][7];
	cost[0][0]=3;
	cost[0][1]=3;
	cost[0][2]=3;
	cost[0][3]=3;
	cost[0][4]=3;
	cost[0][5]=5;
	cost[0][6]=6;
	
	cost[1][0]=2.5;
	cost[1][1]=2.5;
	cost[1][2]=2.5;
	cost[1][3]=2.5;
	cost[1][4]=2.5;
	cost[1][5]=4;
	cost[1][6]=4;
	
	cost[2][0]=4;
	cost[2][1]=4;
	cost[2][2]=4;
	cost[2][3]=4;
	cost[2][4]=4;
	cost[2][5]=4;
	cost[2][6]=10;
	
	cost[3][0]=1.5;
	cost[3][1]=1.5;
	cost[3][2]=1.5;
	cost[3][3]=1.5;
	cost[3][4]=1.5;
	cost[3][5]=1.5;
	cost[3][6]=1.5;
	
	
	cost[4][0]=2;
	cost[4][1]=2;
	cost[4][2]=2;
	cost[4][3]=2;
	cost[4][4]=2;
	cost[4][5]=4;
	cost[4][6]=4;
	
	double weeklyCost[]=new double[5];
	for(int i=0;i<cost.length;i++)
	{
		double sum=0;
		for(int j=0;j<cost[0].length;j++)
		{
			sum=sum+cost[i][j];
		}
		weeklyCost[i]=sum;
	}
	for(int i=0;i<weeklyCost.length;i++)
	{
		System.out.println(weeklyCost[i]);
	}
	String[] news= {"TOI","Hindu","ET","BM","HT"};
	
	int budget=sc.nextInt();
	
	ArrayList<ArrayList<String>> res=new ArrayList<>();
	for(int i=0;i<weeklyCost.length;i++)
	{
		for(int j=i+1;j<weeklyCost.length;j++)
		{
			if(weeklyCost[i]+weeklyCost[j]<=budget)
			{
				ArrayList<String> r=new ArrayList<>();
				r.add(news[i]);
				r.add(news[j]);
				res.add(r);
			}
				
		}
	}
	System.out.println(res);
}
}
