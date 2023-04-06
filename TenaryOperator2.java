public class TenaryOperator2 {
	public static void main(String[] args) {
		int a = 3, b = 5;
		int subtraction;
		
		if(a>b) {
			subtraction = a-b;// int subtraction = a-b라고 선언하고 바로 if 문에서 사용하면 에러 뜸 Why??
		}
		else {
			subtraction = b-a;
		}
		System.out.println("두 수의 차는 " + subtraction + "입니다.");
		
	}
}
