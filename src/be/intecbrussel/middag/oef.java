package be.intecbrussel.middag;

import java.sql.SQLOutput;

public class oef {
    public static void main(String[] args) {


        //oefening 1Maak een char variabel aan. Print hier de waarde vanuit.Als je dit hebt gedaan increment je de waarde en print deze nogmaals uit.

        char myChar = 'a';
        System.out.println(myChar);
        ++myChar;
        System.out.println(myChar);


        // oefening 2 schrijf 2 variabelen van het type float en bereken hier de oppervlakte (L*B) van en ook de omtrek (2* (L + B)).

        float numDecF = 0.9F;
        float numDecA = 0.4F;

        System.out.println(numDecF * numDecA);

        System.out.println(2 * (0.9 + 0.4));

        // oefening 3 Maak 2 variabelen aan van het datatype int en print deze uit.Daarna wissel dan de waarde om van de variabelen
        //bijvoorbeeld: a wordt b en b wordt a. Print deze nogmaals uit.

        int a;
        a = 50;
        int b;
        b = 100;
        System.out.println(a);
        System.out.println(b);
        int temp = 0;
        temp = a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
   }
}

