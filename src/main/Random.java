package main;

public class Random {

    public static void main(String[] args) {
        System.out.println("************\n1. feladat\n************\n");
        System.out.println("Robotok Tippelnek");
        int gondoltSzam1 = (int) (Math.random() * 10) + 1;
        System.out.println("A gondolt szám: " + gondoltSzam1 + "\n----------------------");

        for (int i = 1; i < 4; i++) {

            int randomInt = (int) (Math.random() * 10) + 1;
            System.out.println(i + ". robot Tippje (0-10): " + randomInt);
            if (randomInt == gondoltSzam1) {
                System.out.println("Talált!!!\n");

            } else {
                System.out.println("Nem talált\n");
            }

        }

        System.out.println("************\n2. feladat\n************\n");
        System.out.println("A Robot Tippel\n----------------------");

        int gondoltSzam2 = (int) (Math.random() * 10) + 1;
        System.out.println("A gondolt szám: " + gondoltSzam2 + "\n----------------------");

        int talalt2 = 0;
        for (int i = 1; i < 4; i++) {

            int randomInt = (int) (Math.random() * 10) + 1;
            System.out.println("Robot " + i + ". Tippje (0-10): " + randomInt);
            if (randomInt == gondoltSzam2) {
                talalt2 += 1;
            }

        }
        if (talalt2 > 0) {
            System.out.println("A Robot Talált!");

        } else {
            System.out.println("\nEgyik tipp sem talált!");
        }

        //A robotnak 3 tippje van de csak addig mig nem talál
        System.out.println("\n************\n3. feladat\n************\n");
        System.out.println("A Robot Tippel\n----------------------");

        int gondoltSzam3 = (int) (Math.random() * 10) + 1;
        System.out.println("A gondolt szám: " + gondoltSzam3 + "\n----------------------");

        int szamlalo = 0;
        int talalt3 = 0;
        while (szamlalo < 3) {
            if (talalt3 < 1) {
                szamlalo += 1;
                int randomInt = (int) (Math.random() * 10) + 1;
                System.out.println("Robot " + szamlalo + ". Tippje (0-10): " + randomInt);
                if (randomInt == gondoltSzam2) {
                    talalt3 += 1;
                    System.out.println("A Robot Talált!");

                }

            }

        }
        if (talalt3 == 0) {
            System.out.println("\nEgyik tipp sem talált!");

        }

    }

}
