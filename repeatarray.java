import java.util.Arrays;
import java.util.Scanner;
@SuppressWarnings("unused")
public class guvi_02 {
public static void main(String args[]){
	@SuppressWarnings("resource")
	Scanner in=new Scanner(System.in);
	int count=0;
	int r=0;
	System.out.println("Enter size of array");
	int n=in.nextInt();
	System.out.println("Enter elements in array");
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(a[i]==a[j] && i!=j)
			{
				r=a[i];
				count=1;
				break;
			}
		
		}
			 if(count==1)
			break;
	}
	System.out.println("The repeated element is");
	System.out.println(r);
}


}
