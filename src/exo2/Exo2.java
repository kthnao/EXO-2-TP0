/*
*nom : KITCH Naomi
*groupe : TDA
*rôle du programme : addition d'entiers
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author naomi
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaration des variables 
int nb; // nombre d!entiers a additionner

//nb=5; 
Scanner sc = new Scanner(System.in); 
System.out.println("\n Entrer le nombre :"); 
nb=sc.nextInt(); // On demande a sc de donner le prochain entier

int result; // resultat 
int ind; //indice 
 
result=0;

// Addition des nb premiers entiers 
ind=1;
while (ind <= nb) { 
    result=result+ind;
    ind=ind+1; //ind prend la valeur de ind+1 afin de répéter la boule 5 fois pour additionner les 5 premiers entiers
}

// Affichage du resultat 
System.out.println();
System.out.println("La somme des "+ nb + "entiers est: "+result);
    }
    
}
