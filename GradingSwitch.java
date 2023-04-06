import java.util.Scanner;
public class GradingSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.println("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		
		switch (score/10) {
			case 10: // switch문은 break를 만날 때까지 밑으로 계속 내려감, grade 'A'에 걸린 뒤 break 통해 빠져나감ㄴ
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
			default:
				grade = 'F';
		}
		System.out.println("학점은 " + grade + "입니다.");
		scanner.close();
	}

}
