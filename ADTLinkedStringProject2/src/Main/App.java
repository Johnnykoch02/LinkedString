/**
 * 
 */
package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import ADTLinkedString.DoublyLinkedString;
import ADTLinkedStringException.LinkedStringException;
import ADTLinkedStringException.NullNodeAccessException;

/**
 * @author John
 *	@version 1.0
 *	This Project is designed to mimmick a Doubly Linked List as well as String Java Collections.
 */
	public class App {
	
		private static Scanner fileScanner;
		private static Random r = new Random();		
	
	protected App() {	
		System.out.println("Working");
		init();
	}
	/**
	 * This Method Initializes the Helper Class and prepares it for the tests we will conduct.
	 */
	private static void init() {
		ArrayList<DoublyLinkedString> DLSList = new ArrayList<>();
		try {
			fileScanner = new Scanner(new File("src/Main/Demo.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		start(DLSList);
		
	}
	/**
	 * This method Starts the ArrayList's objects by Reading 'Demo.txt'
	 * @param DLSList
	 */
	public static void start(ArrayList<DoublyLinkedString> DLSList) {
			
			int i = 0;
			while(fileScanner.hasNextLine())
		{
			String input = fileScanner.nextLine();
			if(i%2==0)
			DLSList.add(new DoublyLinkedString(input));
			else {
				DLSList.add(new DoublyLinkedString(input.toCharArray()));
			}
			i++;
		}	
			displayAndMore(DLSList);
		
	}
	/** 
	 * This method Showcases how DoublyLinkedString Methods Work
	 * @param DLSList
	 */
	
	public static void displayAndMore(ArrayList<DoublyLinkedString> DLSList) {
		
	
		for(int i =0; i< DLSList.size(); i++) {
			//Get the next two Doubly Linked strings!
			DoublyLinkedString one = DLSList.get(i);
			DoublyLinkedString two = DLSList.get(i+1);
			
			//Get two char indexes for CharAt Method
			int charOneRandom = 0;
			int charTwoRandom = 0;
			try { charOneRandom = r.nextInt(one.length());} catch(IllegalArgumentException e) {System.out.println("Can't access length() because DLS one is null.");}
			try { charTwoRandom = r.nextInt(two.length());} catch(IllegalArgumentException e) {System.out.println("Can't access length() because DLS two is null.");}
		
			
				
			
			//Get Starting and Ending indexes for the two DLS's!
			int startPos1 = r.nextInt(5);	//These are going to cause errors potentially,
			int startPos2 = r.nextInt(5);	//because some LS's are less than 5 indexes long. We want this.
			
			int endPos1 = startPos1 + r.nextInt(10);
			int endPos2 = startPos2 + r.nextInt(10);
			
		try {
			
			if(one.isEmpty() || two.isEmpty()) {
				if(one.isEmpty() && two.isEmpty()) {
					System.out.println("Both DLS's are empty.");
			}
				else if(one.isEmpty()) {
					System.out.println("The First DoublyLinkedString is Empty.");
					
					System.out.println(two.length() + " is the length of DLS Two.");
					try {System.out.println(two.charAt(charTwoRandom)+ " is the char of DLS Two.");} catch(LinkedStringException e) {e.printStackTrace();}
					try {System.out.println(two.subString(startPos2, endPos2)+ " is the substring of DLS Two.");} catch(LinkedStringException e){e.printStackTrace();}
				}
				else if(two.isEmpty()) {
					
					System.out.println(one.length() + " is the length of DLS One.");
					try {System.out.println(one.charAt(charOneRandom)+ " is the char of DLS One.");} catch(LinkedStringException e) {e.printStackTrace();}
					try {System.out.println(one.subString(startPos1, endPos1)+ " is the substring of DLS One.");} catch(LinkedStringException e){e.printStackTrace();}
					
					System.out.println("The Second DoublyLinkedString is Empty.");
				}
			}
			else {
				
				System.out.println(one.length() + " is the length of DLS One.");
				try {System.out.println(one.charAt(charOneRandom)+ " is the char of DLS One.");} catch(LinkedStringException e) {e.printStackTrace();}
				try {System.out.println(one.subString(startPos1, endPos1)+ " is the substring of DLS One.");} catch(LinkedStringException e){e.printStackTrace();}
				
				System.out.println(two.length() + " is the length of DLS Two.");
				try {System.out.println(two.charAt(charTwoRandom)+ " is the char of DLS Two.");} catch(LinkedStringException e) {e.printStackTrace();}
				try {System.out.println(two.subString(startPos2, endPos2)+ " is the substring of DLS Two.");} catch(LinkedStringException e){e.printStackTrace();}
				
				System.out.println(one.concat(two).toString()+ " is the concatonation of Both DLS 1 & 2.");
			}
			i++;
		}catch(NullNodeAccessException e) {e.printStackTrace();}
		}
	}

}
