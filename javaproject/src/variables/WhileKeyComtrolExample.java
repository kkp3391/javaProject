package variables;

public class WhileKeyComtrolExample {

	public static void main(String[] args) throws Exception {
		while (true) {
		System.out.println("keyCode 입력하세요.");
		int keycode = System.in.read();
		System.out.println(keycode);
		keycode = System.in.read();
		System.out.println(keycode);
		keycode = System.in.read();
		System.out.println(keycode);
		keycode = System.in.read();
		if (keycode == 113) {
			break;
		}
	}
	System.out.println("end of program");

	}

}
