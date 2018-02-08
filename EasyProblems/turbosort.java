package EasyProblems;

import java.util.Scanner;
class turbosort {
public static void quicksort(int x[],int lb,int ub)
{
int i,j,key,temp;
if(lb<ub)
  {
  i=lb;
  j=ub;
  key=x[lb];
  while(i<j)
       {
	   i++;
	   while(i<=ub && x[i]<key)
		    i++;
	   while(j>-lb && x[j]>key)
		    j--;
	   if(i<j)
	     {
		 temp=x[i];
		 x[i]=x[j];
		 x[j]=temp;
	     }
       }
  temp=x[j];
  x[j]=x[lb];
  x[lb]=temp;
  
  quicksort(x,lb,j-1);
  quicksort(x,j+1,ub);
  }
}

public static void main(String args[]){
int a[],i,n;
Scanner sc  = new Scanner(System.in);
//System.out.println("Enter the no of elements");
n = sc.nextInt();
a = new int[20];
for(i=0;i<n;i++)
	a[i]=sc.nextInt();
quicksort(a,0,n-1);
for(i=0;i<n;i++)
	System.out.println(a[i]);
  }
}