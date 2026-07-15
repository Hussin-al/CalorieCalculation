package dev;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

 class CalorieCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean weiter = true;

        while (weiter) {
            System.out.print("Dein Name : ");
            String name = scanner.next();

            System.out.print("Gewicht : ");
            int weight = scanner.nextInt();

            System.out.print("Länge in cm : ");
            double length = scanner.nextDouble();

            System.out.print("Alter : ");
            int age = scanner.nextInt();

            System.out.println("Ist die Person: 1- Mann, 2- Frau");
            int gender = scanner.nextInt();

            double bmr = 0;

            switch (gender) {
                case 1:
                    bmr = 88.362 + (13.397 * weight) + (4.799 * length) - (5.677 * age);
                    break;
                case 2:
                    bmr = 447.593 + (9.247 * weight) + (3.098 * length) - (4.330 * age);
                    break;
                default:
                    System.out.println("Ungültige Auswahl");
                    continue;
            }

            System.out.println("Wie ist deine Bewegung?");
            System.out.println("1. Wenig Bewegung");
            System.out.println("2. Leichte Aktivität (1–3 Tage/Woche)");
            System.out.println("3. Mittlere Aktivität (3–5 Tage/Woche)");
            System.out.println("4. Hohe Aktivität (6–7 Tage/Woche)");
            System.out.println("5. Sehr intensive Aktivität");

            int move = scanner.nextInt();
            double tdee = 0;

            switch (move) {
                case 1:
                    tdee = bmr * 1.2;
                    break;
                case 2:
                    tdee = bmr * 1.375;
                    break;
                case 3:
                    tdee = bmr * 1.55;
                    break;
                case 4:
                    tdee = bmr * 1.725;
                    break;
                case 5:
                    tdee = bmr * 1.9;
                    break;
                default:
                    System.out.println("Ungültige Auswahl");
                    continue;
            }

            long result = Math.round(tdee);
            System.out.println("Dein täglicher Kalorienbedarf (TDEE): " + result);

            try (FileWriter writer = new FileWriter("calories.txt", true)) {
                writer.write("Name: " + name + "\n" + "Gewicht: " + weight + "\n" +
                        " Größe: " + length + "\n" +
                        " Alter: " + age + "\n" +
                        " TDEE: " + result + " kcal\n");
            } catch (IOException e) {
                System.out.println("Fehler beim Schreiben der Datei");
            }

            System.out.println("Möchtest du eine weitere Berechnung?");
            System.out.println("1. Ja");
            System.out.println("2. Nein");

            int choice = scanner.nextInt();
            if (choice == 2) {
                weiter = false;
            }
        }

        System.out.println("Programm beendet.");
    }
}
