import entities.Number;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Inserisci il numero di parole che vuoi inserire: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        Set<String> parole = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (int i = 0; i < N; i++) {
            System.out.print("Inserisci la parola numero" + (i + 1) + ": ");
            String parola = scanner.nextLine();
            if (parole.contains(parola)) {
                duplicate.add(parola);
            } else {
                parole.add(parola);
            }

        }

        scanner.close();

        System.out.println(parole);
        System.out.println(parole.size());
        System.out.println("Parole duplicate " + duplicate);*/

        Number number = new Number(10);
        List<Integer> numeriCasualiOrdinati = number.numeriRandom(10);
        System.out.println(numeriCasualiOrdinati);


    }
}