package imran.practice.com;
import java.util.*;

public class Practice{
	void space(int x) {
		for(int i = 0; i < (x - 2) + 2 * (x - 1); i++) {
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		Practice call = new Practice();
		int n = new Scanner(System.in).nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i == 1 || i == n) {
				
				for(int j = 0; j < n; j++) {
					System.out.print(" * ");
				}
			}else {
				System.out.print(" *");
				call.space(n);
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
