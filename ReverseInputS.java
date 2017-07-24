import java.util.Scanner;

public class ReverseInputS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner sc = new Scanner(System.in);
		        String s;
		        s = sc.nextLine();
		        StringBuffer sb = new StringBuffer();
		        sb.append(s);
		        sb.reverse();
		        System.out.println(sb);
	 }		
}
