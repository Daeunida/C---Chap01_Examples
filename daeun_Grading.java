// 다중 if-else문을 이용하여 입력받은 성적에 대해 학점을 부여하는 프로그램을 작성해보자
import java.util.Scanner;
public class daeun_Grading {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("점수를 입력하세요: ");
		
		int score = scanner.nextInt();
		char grade;
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else if (score >= 60) {
			grade = 'D';
		}
		else 
			grade = 'F';
		
		System.out.println("당신의 학점은 " + grade +"입니다.");
		
		scanner.close();
	}
}
