 class Tester {
	public static int findSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		System.out.println(i+" "+sum);
		}
		return sum;
	}
	public static void main(String args[]) {
		System.out.println(findSum(5));
	}
}
