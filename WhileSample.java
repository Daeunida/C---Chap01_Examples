// while문을 이용하여 정수를 여러 개 입력 받고 평균을 출력하라. -1이 입력되면 입력을 종료한다.
import java.util.Scanner;
public class WhileSample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0; // count는 입력된 정수의 갯수
		int sum = 0; // sum은 합
		System.out.println("정수를 입력하고 마지막에 마지막에 -1을 입력하세요.");
		
		int n = scanner.nextInt(); // 정수 입력
		while (n != -1)
			sum = sum + n;
			count++;
			n = scanner.nextInt();// 정수 입력
		
	}
	while()

}
