package org.login;

import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		int[] a = { 2, 5, 3, 7, 4, 2 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				int sum = a[i] + a[j];

				if (sum == 9) {

					System.out.println("First Number value is :" + a[i] + "Index Position is :" + i);
					System.out.println("Second Number Valus is:" + a[j] + "Index Position is :" + j);
				}
			}

			System.out.println("AAA");
			System.out.println("BBB");
		}
		System.out.println("Biehds");
		System.out.println("dfiahrguf");
		System.out.println("sarsoethiud");
	}

}
