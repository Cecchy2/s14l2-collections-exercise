package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ripetizioni = 0;

        while (true) {

            System.out.println("inserisci un numero, sarà il numero di elementi.");
            try {
                ripetizioni = Integer.parseInt(scanner.nextLine());
                if (ripetizioni <= 0) {
                    System.out.println("Dovevi inserire un numero maggiore di 0");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("dovevi inserire un numero");
            }
        }

        Set<String> parole = new HashSet<>();
        Set<String> paroleRipetute = new HashSet<>();

        for (int i = 0; i < ripetizioni; i++) {
            System.out.println("scrivi una parola");
            String parola = scanner.nextLine();
            if (parole.contains(parola)) {
                paroleRipetute.add(parola);
            } else {
                parole.add(parola);
            }
            scanner.close();
        }
        System.out.println("queste sono le parole ripetute: " + paroleRipetute);
        System.out.println("questa è la quantità delle parole singole: " + parole.size());
        System.out.println("queste sono le parole singole: " + parole);


    }
}