package esercizio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero, saranno il numero di elementi.");
        int ripetizioni = Integer.parseInt(scanner.nextLine());

        List<String> parole = new ArrayList<>();

        for (int i = 0; i < ripetizioni; i++) {
            System.out.println("scrivi una parola");
            String parola = scanner.nextLine();
            parole.add(parola);
        }

    }
}