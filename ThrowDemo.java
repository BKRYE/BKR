import java.util.Scanner;
public class ThrowDemo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		try { //square() 메서드에서 에외가 발생하면 스스로 처리하지 않고 여기서 처리한다.
			square(in.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("정수가 아닙니다.");
		}
	}
	private static void square(String s) throws NumberFormatException { //호출한 메소드에서 예외를 처리하도록 떠넘긴다.
		int n = Integer.parseInt(s); // s가 숫자 문자열이 아니면 예외가 발생한다.
		System.out.println(n * n);
	}
}
