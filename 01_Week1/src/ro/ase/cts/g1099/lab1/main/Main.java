package ro.ase.cts.g1099.lab1.main;

import ro.ase.cts.g1099.lab1.main.exceptions.InsufficientFundsException;
import ro.ase.cts.g1099.lab1.main.interfaces.Profitable;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello. 1st Laboratory");
		
		//use the interface as a reference type
		Profitable reference;
		
		try {
			throw new InsufficientFundsException("You nedd a top-up");
		}
		catch(InsufficientFundsException ex) {
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("We have a problem");
		}
		finally {
			System.out.println("Exceptions example");
		}
		
	}

}
