package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc, sc1 = null;
		sc = new Scanner(System.in);
		String url = sc.nextLine();
		File file = new File(url);
		try {
			sc1 = new Scanner(file);
			while (sc1.hasNextLine()) {
				System.out.println(sc1.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc1!= null) {
				sc1.close();
			}
			sc.close();
		}
	}

}
