
import java.util.*;
public class Employee {
	public static void main(String[] args) {
		double employeeincome;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter income");
		employeeincome=sc.nextDouble();
		if(employeeincome<50000){
			System.out.println("no income tax to be paid");
		}
		else if(employeeincome>50000 && employeeincome<100000){
			double amt;
			amt=(employeeincome/100)*10;
			System.out.println("income tax:"+amt);
		}
		else if(employeeincome>100000 && employeeincome<150000){
			double amt2;
			amt2=(25/100)*employeeincome;
			System.out.println("income tax:"+amt2);
		}
		else{
			System.out.println("income tax:"+employeeincome*0.35);
		}
		
	}
}	