package patternPrinting;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FindMissingnumberFrom {

	@Ignore
	@Test
	public void findMissingNUmberFrom_1_to_10() {

		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 }; // array given with 6 is missing
		int missingNum = 0;
		int arraylength = arr.length + 1;
		int resulttSum = 0;

		// CALCULATE n number sum from formula
		int sum = arraylength * (arraylength + 1) / 2;
		System.out.println(sum);

		// sum of the array.
		for (int i = 0; i < arr.length; i++) {
			resulttSum = resulttSum + arr[i];
		}
		System.out.println(resulttSum);

		// missing number formula
		missingNum = sum - resulttSum;
		System.out.println(missingNum);
	}

	@Test
	public void fibonacciSerie() {
		// 1,2,3,5,8,13,21

		int num1 = 1;
		int num2 = 2;
		int sum = 0;
		int temp;
		int temp2;
		int i = 0;
		while (i < 10) {
			temp = num2 + num1;
			sum = sum + temp;
			temp2 =num2;
			sum = sum + temp2;
			System.out.println(sum);
			i--;
		}

	}

}
