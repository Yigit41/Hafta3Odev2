package patikadev;

import java.util.Scanner;

public class Hafta3Odev2 {

	public static void main(String[] args) {
		
		int inputNum;
		int num = 0;
		
		Scanner input = new Scanner(System.in);	

    	System.out.print("Please Enter A Number : ");
    	inputNum = input.nextInt();
		
    	for (int i = 1 ; i < inputNum ; i++) {
    		if (inputNum % i == 0){
    			num += i;
    		}
    	}

    	if (inputNum == num) {
    		System.out.printf( inputNum+" is perfect number");
    	}
    	else {
    		System.out.printf(inputNum+" is not perfect number");

    	}
	}

}
