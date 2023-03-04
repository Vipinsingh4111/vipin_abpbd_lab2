package com.greatlearning.iitr.dsa.labsession2;

import java.util.Scanner;

public class CurrencyDenomination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int size = sc.nextInt();
		int currency[] = new int[size];
		System.out.println("enter the currency denominations value");
		for(int i=0;i<size;i++){
		currency[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		int count[] = new int[size];
		for(int i=0;i<size;i++){
		if(currency[i]>amount) continue;
		count[i] = amount/currency[i];
		amount -= count[i]*currency[i];
		}
		if(amount>0){
		System.out.println("Payment is not possible");
		}else{
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i=0;i<size;i++){
		if(count[i]>0){
		System.out.println(currency[i] + ":" + count[i]);
		}
		}
		}
		}
}
