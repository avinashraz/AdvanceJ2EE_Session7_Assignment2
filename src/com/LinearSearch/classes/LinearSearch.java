package com.LinearSearch.classes;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		
		int [] arr = {12,15,178,58,95,105};
		
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("Enter the Number: ");
		Scanner scanner = new Scanner(System.in);
		int searchNumber = scanner.nextInt();
		int i;
		for(i=0;i<arr.length;i++ ){
			if(searchNumber == arr[i]){
				//System.out.println("Element is present");
				break;
			}
		}
			if (i == arr.length){
				System.out.println("Element not found");
			}
					else{
				System.out.println("Element is present");
			}
			}
		}


