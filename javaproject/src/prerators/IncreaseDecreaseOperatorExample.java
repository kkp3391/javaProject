package prerators;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(y++);
		System.out.println(++y);
		
		System.out.println("___________________________");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("___________________________");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("____________________________");
		z = x++;
		System.out.println("z=" +z);
		System.out.println("x=" +x);
		
		System.out.println("___________________________");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("___________________________");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}
