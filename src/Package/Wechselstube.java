package Package;

// alles nochmal durchgehen das ist was konfus!

import java.util.Scanner;

public class Wechselstube
{

  // Variablen, die zum berechnen benötigt werden intialisieren!
  public static void main(String[] args)
  {
    // Keyboardabfrage erstellen
    Scanner keyboard = new Scanner(System.in);
    //Variablen
    int hunderteuro;
    int fuenfzigeuro;
    int zwanzigeuro;
    int zehneuro;
    int fuenfeuro;
    int zweieuro;
    int euro;
    int fuenfzigcent;
    int zwanzigcent;
    int zehncent;
    int fuenfcent;
    int zweicent;
    int cent;
    int rest;

    // Frage stellen und darauf die Summen einlesen!
    System.out.println("Wie viele Cent haben Sie? Bitte keine Euroangaben!");
    System.out.println("Geben sie bitte die Betraege mit einem Kommata ein!");
       System.out.println("Da dieses Programm nicht fuer Grossgeld ausgelegt ist, ist der hoechste Schein nur 100Euro!");

    double SummeDouble = keyboard.nextDouble(); // Werte von Tastatur
    SummeDouble = SummeDouble * 100;// Summe = double      summe = int
    //int summe = SummeDouble.intValue();

    int summe = (int) SummeDouble;

    // Nacheinander die möglichen Scheine/Münzen herausrechnen nach Rest-Verfahren

    hunderteuro =  summe / 10000;    // 100 Euro
    rest =  summe % 10000;          //  100 Euro

    fuenfzigeuro = rest / 5000;      //50 Euro
    rest = rest % 5000;              // 50 Euro

    zwanzigeuro = rest / 2000;      // 20 Euro
    rest = rest % 2000;             // 20 Euro

    zehneuro = rest / 1000;         // 10 Euro
    rest = rest % 1000;             // 10 Euro

    fuenfeuro = rest / 500;         // 5 Euro
    rest = rest % 500;              // 5 Euro

    zweieuro = rest / 200;          // 2 Euro
    rest  = rest % 200;             // 2 Euro

    euro = rest / 100;              // 1 Euro
    rest = rest % 100;              // 1 Euro

    fuenfzigcent = rest / 50;        // 0.5 Euro
    rest = rest % 50;                // 50 Cent

    zwanzigcent = rest / 20;         // 20 Cent
    rest = rest % 20;                // 20 Cent

    zehncent = rest / 10;            // 10 Cent
    rest = rest % 10;                // 10 Cent

    fuenfcent = rest / 5;             // 5 Cent
    rest = rest % 5;                  // 5 Cent

    zweicent = rest / 2;              // 2 Cent
    rest = rest % 2;                  // 2 Cent

    cent = rest;                      // 1 Cent

    // Ausgabe des Geldes, dass am besten ist + Ermittlung!
    System.out.println();
    System.out.println("Sie bekommen " + SummeDouble / 100 + " Euro");// !!!ACHTUNG!!! SummeDouble (double)

    if (hunderteuro > 1)
    {
      System.out.println(hunderteuro + " 100-Euroscheine");
    }
    else
    {
      System.out.println(hunderteuro + " 100-Euroschein");
    }

/******************************************************************************/

    if (fuenfzigeuro > 1)
    {
      System.out.println(fuenfzigeuro + " 50-Euroscheine");
    }
    else
    {
      System.out.println(fuenfzigeuro + " 50-Euroschein");
    }

/******************************************************************************/
    if (zwanzigeuro > 1)
    {
      System.out.println(zwanzigeuro + " 20-Euroscheine");
    }
    else
    {
      System.out.println(zwanzigeuro + " 20-Euroschein");
    }

/******************************************************************************/

    if (zehneuro > 1)
    {
      System.out.println(zehneuro + " 10-Euroscheine");
    }
    else
    {
      System.out.println(zehneuro + " 10-Euroschein");
    }

/******************************************************************************/

    if (fuenfeuro > 1)
    {
      System.out.println(fuenfeuro + " 5-Euroscheine");
    }
    else
    {
      System.out.println(fuenfeuro + " 5-Euroschein");
    }

/******************************************************************************/

    if (zweieuro > 1)
    {
      System.out.println(zweieuro + " 2-Euromuenzen");
    }
    else
    {
    System.out.println(zweieuro + " 2-Euromuenze");
    }

/******************************************************************************/

    if (euro > 1)
    {
      System.out.println(euro + " 1-Euromuenzen");
    }
    else
    {
      System.out.println(euro + " 1-Euromuenze");
    }

/******************************************************************************/

    if (fuenfzigcent > 1)
    {
      System.out.println(fuenfzigcent + " 50-Centmuenzen");
    }
    else
    {
      System.out.println(fuenfzigcent + " 50-Centmuenze");
    }

/******************************************************************************/

    if (zwanzigcent > 1)
    {
      System.out.println(zwanzigcent + " 20-Centmuenzen");
    }
    else
    {
      System.out.println(zwanzigcent + " 20-Centmuenze");
    }

/******************************************************************************/

    if (zehncent > 1)
    {
      System.out.println(zehncent + " 10-Centmuenzen");
    }
    else
    {
      System.out.println(zehncent + " 10-Centmuenze");
    }

/******************************************************************************/

    if (fuenfcent > 1)
    {
      System.out.println(fuenfcent + " 5-Centmuenzen");
    }
    else
    {
      System.out.println(fuenfcent + " 5-Centmuenze");
    }

/******************************************************************************/

    if (zweicent > 1)
    {
      System.out.println(zweicent + " 2-Centmuenzen");
    }
    else
    {
      System.out.println(zweicent + " 2-Centmuenze");
    }

/******************************************************************************/

    if (cent > 1)
    {
      System.out.println(cent + " 1-Centmuenzen");
    }
    else
    {
      System.out.println(cent + " 1-Centmuenze");
    }

    keyboard.close();

  }

}
