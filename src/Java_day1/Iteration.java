package Java_day1;
import java.util.*;

public class Iteration {
	public static void main(String[] args) {
		//for loop
		
		int n=10;
		System.out.println("Ascending order");
		for(int i=0; i<=n;i++) {
			System.out.println(i); //Ascending order
			}
		System.out.println("\n");
		
		
		System.out.println("Descending order");
		for(int i=1; n>=i;n--) {
			System.out.println(n);//Descending order
			}
		System.out.println("\n");
		
		//while loop
		int a=1;
		int x=10;
		while (a<=x) {
			System.out.println(a);
			a++;
		}
		System.out.println("\n");
		
		//do-while
		int a1=1;
		int x1=10;
		do {
			a1++;
			System.out.println(a1);
		}while(a1<=x1);
			
		}
	}


