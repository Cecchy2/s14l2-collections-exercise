package esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;


        while (true) {
            try {
                System.out.println("inserisci un numero");
                n = Integer.parseInt(scanner.nextLine());
                if (n > 0) {
                    break;
                } else {
                    System.out.println("devi inserire un numero positivo");

                }
            } catch (NumberFormatException e) {
                System.out.println("devi inserire un numero intero");
            }
        }

        Random random = new Random();

        List<Integer> casuali = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            casuali.add(random.nextInt(101));
        }
        casuali.sort(Integer::compareTo);

        System.out.println("lista ordinata di numeri casuali " + casuali);

        /*List<Integer> reversedCasuali = new ArrayList<>();
        reversedCasuali.addAll(casuali.reversed());

        System.out.println(reversedCasuali);*/
        List<Integer> mirror = creaMirrorList(casuali);

        System.out.println("lista a specchio dei numeri casuali" + mirror);

        boolean stampaTrue = false;
        while (true) {
            try {
                System.out.println("vuoi stampare i valori in posizione pari? scrivi true, dispari? scrivi false");

                stampaTrue = Boolean.parseBoolean(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("errore per favore inserisci true o false");
            }
        }

        stampaPariIfTrue(mirror, stampaTrue);
    }

    public static List<Integer> creaMirrorList(List<Integer> list) {
        List<Integer> reversedCasuali = new ArrayList<>(list);
        reversedCasuali.addAll(list.reversed());
        return reversedCasuali;
    }

    public static void stampaPariIfTrue(List<Integer> list, Boolean stampaTrue) {
        if (stampaTrue) {
            for (int i = 0; i < list.size(); i += 2) {
                System.out.println("le posizioni pari sono: " + list.get(i));
            }

        } else {
            for (int i = 1; i < list.size(); i += 2) {
                System.out.println("in posizione dispari:" + list.get(i));

            }
        }
    }
}
