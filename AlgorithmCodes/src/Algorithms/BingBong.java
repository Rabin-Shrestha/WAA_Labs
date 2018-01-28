package Algorithms;

public class BingBong {

	public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println("Bing Bong"); // For those whose index which is at both 5th and 7th position we printed both value
				continue;
			} else if (i % 5 == 0) {
				System.out.println("Bing");
				continue;
			} else if (i % 7 == 0) {
				System.out.println("Bong");
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}
