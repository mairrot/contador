
package contar;
import java.util.Scanner;
public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,con;
		num=0;
		con=-1;
		Scanner scan = new Scanner(System.in);
		if(num>=0) {
			while(num>=0){
				System.out.println(num);
				num=scan.nextInt();
				con=con+1;
			}
			
		}
		System.out.println(con);
	}

}
