package codingBat.com;

public class SmallBricks {

	private static final int BIG_BRICK = 5;

	public static void main(String[] args) {
		System.out.println(makeBricks(3, 2, 10));
	}

	private static boolean makeBricks(int small, int big, int goal) {
		return !(goal % BIG_BRICK > small || goal > big * BIG_BRICK + small);
	}

}
