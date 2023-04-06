import java.util.Scanner;
public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // 원래 in대신 scanner 썼었음 근데 in 써도 ㅇㅋ
		
		System.out.println("수를 입력하시오: ");
		int number = in.nextInt(); // 원래 in 대신 scanner 썼어서 scanner.nextInt()써도 됐었음
		
		if (number%3==0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다");
		}
		
		in.close();
		}

}
