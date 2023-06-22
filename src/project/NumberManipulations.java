package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import project.interfaces.NumberInterface;

public class NumberManipulations implements NumberInterface {

	@Override
	public void palidrome(int num) {

		int digit, temp = num;
		int rev = 0;
		while (num != 0) {

			digit = num % 10;
			rev = (rev * 10) + digit;
			num /= 10;

		}
		if (temp == rev) {
			System.out.println(temp + " is Palidrome Number.s");
		} else {
			System.out.println(temp + " is not a Palidrome Number");
		}
	}

	@Override
	public void prime(int num) {

		int count = 0;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a Prime number");
		}

		else {

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {

					count++;
					break;

				}
			}

			if (count == 0) {
				System.out.println(num + " is a Prime Number");
			}

			else {
				System.out.println(num + " is not a Prime Number");
			}
		}
	}

	@Override
	public void evenOrOdd(int num) {

		System.out.println(num % 2 == 0 ? num + " is a Even number." : num + "is a Odd number");

	}

	@Override
	public void multiplication(int num) {

		for (int i = 1; i <= num; i++) {

			System.out.println(num + " x " + i + " = " + num * i);
		}
	}

	@Override
	public void reverseNumber(int num) {

		int digit;
		int rev = 0;
		while (num != 0) {

			digit = num % 10;
			rev = (rev * 10) + digit;
			num /= 10;

		}
		System.out.println(num + " the reverse of a given number : " + rev);

	}

	@Override
	public void pairs(int[] num, int target) {

		Arrays.sort(num);
		int start = 0;
		int end = num.length - 1;
		List<List<Integer>> arr=new ArrayList<>();
		while (start < end) {

			if (num[start] + num[end] < target) {
				start++;
			}

			else if (num[start] + num[end] == target) {

				arr.add(Arrays.asList(num[start],num[end]));
				start++;
				end--;
			}

			else if (num[start] + num[end] > target) {
				end--;
			}
			
		}
		System.out.println(arr);
	}

	@Override
	public void triplets(int[] num, int target) {

		Arrays.sort(num);
		List<List<Integer>> arr=new ArrayList<>();
		for(int i=0;i<num.length-2;i++) {
			
			int sum=target-num[i];
			int start=i+1;
			int end=num.length-1;
			
			while(start<end) {
				
				if(num[start]+num[end]<sum) {
					
					start--;
				}
				else if(num[start]+num[end]==sum) {
					
					arr.add(Arrays.asList(num[start],num[i],num[end]));
				      start++;
				      end--;
				}
				
				
				else if(num[start]+num[end]>sum) {
					
					end--;
				}
				
				else {
					
					System.out.println("no triplets found");
				}
			}
		}
		System.out.println(arr);
	}

	@Override
	public void fibanocci(int count) {
		
		int n1=0,n2=1,n3;
		System.out.println(n1 +" "+n2);
		
		for(int i=2;i<count;i++) {
			
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
