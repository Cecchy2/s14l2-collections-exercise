package esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Cancella contatto");
            System.out.println("3. Cerca contatto per numero di telefono");
            System.out.println("4. Cerca numero di telefono per nome");
            System.out.println("5. Stampa tutti i contatti");
            System.out.println("6. Esci");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Inserisci il nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Inserisci il numero di telefono:");
                    int numero = Integer.parseInt(scanner.nextLine());
                    rubrica.aggiungiContatto(nome, numero);
                    break;
                case 2:
                    System.out.println("Inserisci il nome del contatto da cancellare:");
                    String nomeToDelete = scanner.nextLine();
                    rubrica.rimuoviContatto(nomeToDelete);
                    break;
                case 3:
                    System.out.println("Inserisci il numero di telefono da cercare:");
                    int numeroToSearch = Integer.parseInt(scanner.nextLine());
                    String foundName = rubrica.cercaPerNumero(numeroToSearch);
                    if (foundName != null) {
                        System.out.println("Il numero di telefono appartiene a: " + foundName);
                    } else {
                        System.out.println("Numero di telefono non trovato.");
                    }
                    break;
                case 4:
                    System.out.println("Inserisci il nome da cercare:");
                    String nomeToSearch = scanner.nextLine();
                    Integer foundPhone = rubrica.cercaPerNome(nomeToSearch);
                    if (foundPhone != null) {
                        System.out.println("Il numero di telefono di " + nomeToSearch + " è: " + foundPhone);
                    } else {
                        System.out.println("Nome non trovato.");
                    }
                    break;
                case 5:
                    rubrica.stampaTuttiContatti();
                    break;
                case 6:
                    System.out.println("Uscita.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }
    }
}
