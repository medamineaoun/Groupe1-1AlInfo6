package src;

import java.util.Scanner;

public class MedAmineAoun {
    // Fonction pour vérifier si un nombre est premier
    public static boolean estNombrePremier(int nombre) {
        // Les nombres inférieurs à 2 ne sont pas premiers
        if (nombre <= 1) {
            return false;
        }

        // Les nombres de 2 et 3 sont premiers
        if (nombre <= 3) {
            return true;
        }

        // Si le nombre est divisible par 2 ou 3, il n'est pas premier
        if (nombre % 2 == 0 || nombre % 3 == 0) {
            return false;
        }

        // Vérifier la divisibilité par d'autres nombres
        for (int i = 5; i * i <= nombre; i += 6) {
            if (nombre % i == 0 || nombre % (i + 2) == 0) {
                return false;
            }
        }

        // Si aucune condition n'est satisfaite, le nombre est premier
        return true;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nombre pour verfier il premier ou non: ");
        int n = sc.nextInt();
        if (estNombrePremier(n)) {
            System.out.println(n + " est un nombre premier.");
        } else {
            System.out.println(n + " n'est pas un nombre premier.");
        }
        System.out.println("Donner la chaine pour convertir en majuscule: ");
        String ch= sc.next();
        System.out.println("la chaine majuscule est : "+ch.toUpperCase());
    }

}