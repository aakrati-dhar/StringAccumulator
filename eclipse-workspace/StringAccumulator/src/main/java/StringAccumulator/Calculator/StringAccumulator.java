package StringAccumulator.Calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.print.attribute.HashPrintRequestAttributeSet;

/**
 *
 * @author Aakrati Dhar
 */
public class StringAccumulator {

	public static void main(String ar[]) {
		StringAccumulator stringAccumulator = new StringAccumulator();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sum = 0;
		sum = stringAccumulator.add(str);
		System.out.println("Sum of numbers is : "+sum);
		sc.close();

	}

	public int add(String numbers) {

		int sum = 0;
		boolean exceptionMessage = false;
		int tempNumber = 0;
		List<Integer> negative = new ArrayList<Integer>();

		if (!numbers.isEmpty()) {
			List<String> numbersList = new ArrayList<String>();
			numbers = numbers.replaceAll("[^-0-9]+", " ");
			
			StringTokenizer stringTokenizer = new StringTokenizer(numbers, " ");
			while (stringTokenizer.hasMoreTokens()) {
				numbersList.add(stringTokenizer.nextToken());
			}

			if (!numbers.isEmpty()) {
				numbersList = (List<String>) Arrays.asList(numbers.trim().split(" "));

				for (String temp : numbersList) {
					tempNumber = Integer.parseInt(temp);

					if (tempNumber >= 0 && tempNumber <= 1000) {
						sum = sum + tempNumber;

					} else if (tempNumber < 0) {
						negative.add(tempNumber);
						exceptionMessage = true;
					}

					else {
						sum = sum + 0;
					}
				}

			}
		}

		if (exceptionMessage == true) {
			throw new NumberFormatException("Negatives are not allowed " + negative.toString());
		}

		return sum;
	}
}
