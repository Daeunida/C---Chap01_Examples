// 예제 2-12의 성적 매기는 코드를 switch 문으로 작성하라
// switch 문을 이용하여 입력받은 성적에 대해 학점을 부여하는 프로그램을 작성해보자
import java.util.Scanner;
public class daeun_GradingSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요: ");
		
		int score = scanner.nextInt();
		char grade;
		
		switch(score/10) {
			case 10: // switch문에서 case 뒤에는 세미콜론 아니고 그냥 콜론임 !!!!
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
			break;
			
			default:
			grade = 'F';
		}
		
		System.out.println("당신의 성적은 " + grade + " 입니다.");
		
		scanner.close();
	}

}
