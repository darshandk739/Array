package demo;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int even = 0, odd = 0;
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the elements in array: ");
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else if (arr[i] % 2 != 0) {
				odd++;
			}
		}
		if (even % 2 == 0 && odd % 2 == 0) {
			System.out.println("1");
		} else if (even % 2 == 0 && odd % 2 != 0) {
			System.out.println("1");
		} else if (even % 2 != 0 && odd % 2 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}
}
