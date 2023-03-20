package esercizio1;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
		static Scanner s = new Scanner(System.in);
		
		static Logger l = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			int value = (int) Math.round(Math.random()*10);
			arr[i] = value;
		}
		printArray(arr);
		
		int counter = 1;
		int userValue = -1;
		while(userValue != 0) {
			try {
				System.out.println("inserisci il numero");
				userValue = s.nextInt();
				System.out.println("inserisci la posizione");
				int position = s.nextInt();
				int[] newArr = new int[arr.length+counter];
				for(int i = 0; i < newArr.length; i++) {
					if(i < position) {
						newArr[i] = arr[i];
					}else if(i == position) {
						newArr[i] = userValue;
					} else {
						newArr[i] = arr[i-1];
					}
				}
				arr = newArr;
				printArray(newArr);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("inserisci un indice compreso tra 1 e " + arr.length);
			}catch(InputMismatchException e) {
				s.nextLine();
				System.out.println("non puoi inserire stringhe, riprova inserendo un numero");
			}catch(Exception e) {
				System.out.println("C'è stato un errore " + e);
			}
		}	
	}
	
	
	static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("array:" + arr[i]);
		}
	}

}
