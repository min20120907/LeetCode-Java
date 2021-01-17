import java.util.Scanner;
public class address{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String addr = s.next();
		System.out.println(addr.replace(".","[.]"));
			
	}
}
