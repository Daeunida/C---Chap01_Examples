public class Hello {

	public static int sum(int n, int m) {
		return n+m;
	}
	
	// main() 메소드에서 실행 시작
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i,10); // 메소드 호출
		a = '?';
		System.out.println(a); // 문자열 '?' 출력
		System.out.println("Hello"); // 문자열 "Hello 출력"
		System.out.println(s); // 정수 30 출력
	
		String toolName = "JDK";
		toolName = toolName + 1.8; // 1.8도 문자열로 인식함
		System.out.println(toolName+ "이 출시됨");
	}
}
