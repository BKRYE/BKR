import java.util.Scanner;
public class ThrowDemo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		try { //square() �޼��忡�� ���ܰ� �߻��ϸ� ������ ó������ �ʰ� ���⼭ ó���Ѵ�.
			square(in.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("������ �ƴմϴ�.");
		}
	}
	private static void square(String s) throws NumberFormatException { //ȣ���� �޼ҵ忡�� ���ܸ� ó���ϵ��� ���ѱ��.
		int n = Integer.parseInt(s); // s�� ���� ���ڿ��� �ƴϸ� ���ܰ� �߻��Ѵ�.
		System.out.println(n * n);
	}
}
