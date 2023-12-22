class UserInterface {
	public static void divide(int x, int y) {
		try {
			if (y == 0)
				throw new Exception("The divisor should not be zero");
			int z = x / y;
			System.out.println(z);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		UserInterface.divide(10, 0);
	}
}
