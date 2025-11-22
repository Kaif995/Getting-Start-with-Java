import java.util.Scanner; 
public class array {

	public static void main(String[] args) {
		int[] temp=new int[7];
		double maxtemp=0.0,mintemp=0.0,sum=0.0,avg=0.0;
		
		Scanner sc=new Scanner(System.in);
		//input lia loops se
		System.out.println("Enter 7 temperatures Day wise: ");
		for(int i=0;i<7;i++) {
			temp[i]=sc.nextInt();	
			sum+=temp[i];
			
			}
		avg=sum/7.0;
		
		//max check
		for(int i=0;i<7;i++) {
			if(temp[i]>maxtemp) {
				maxtemp=temp[i];
			}		
			}
		//min_check
		for(int i=0;i<7;i++) {
			if(temp[i]<maxtemp) {
				mintemp=temp[i];
			}		
			}
		//output
		for(int i=0;i<7;i++) {
			System.out.println("Temperature of Day "+i+" is "+temp[i]);
			}
		
		System.out.println("Sum is "+sum);
		System.out.println("Maximum is "+maxtemp);
		System.out.println("Minimum is "+mintemp);
		System.out.println("Average of 5 temperature is "+avg);

	}

}
