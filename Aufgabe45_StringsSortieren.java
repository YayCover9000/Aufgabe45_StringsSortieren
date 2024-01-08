import java.util.Scanner;
public class Aufgabe45_StringsSortieren {
	public static void main (String [] args) {
		Eingabe(args);
		sort(args);
	}
	
	public static void Eingabe(String [] args) {
		//Scanner sc = new Scanner(System.in);
		int answer = 0;
		if(args != null)  {
			for(int i = 0; i < args.length-1; i++) {
				answer = args[i].compareTo(args[i+1]);
				switch (Integer.signum(answer)) { // gibt signums zurück also -1 0 oder +1
		        case -1:
		            Ausgabe(-1); 
		            break;
		        case 0:
		            Ausgabe(0); 
		            break;
		        case 1:
		            Ausgabe(1); 
		            break;
		    }
		}
	}else {
		System.out.println("Fehler");
	}
	
}
	public static void sort(String [] args) {
		boolean bigger = false;
		String zwischen;
		System.out.println("---------");
		for(String e: args) {
			System.out.println(e);
		}
		for(int i = 0; i < args.length-1; i++) {
			if(args[i].compareTo(args[i+1]) > 0) {
				zwischen = args[i+1];
				args[i+1] = args[i];
				args[i] = zwischen;
				i--;
			} else if(args[i].compareTo(args[i+1]) == 0) {
				
			}
		}
		System.out.println("---------");
		for(String e: args) {
			System.out.println(e);
		}
	}
	public static void Ausgabe(int zahl) {
		System.out.println(zahl);
	}
}
