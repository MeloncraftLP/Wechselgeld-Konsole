

// alles nochmal durchgehen das ist was konfus!

package WechselStube;

import java.util.Scanner;

public class Wechselstube
{

//  public class frame()
// {
//
//   JFrame f = new JFrame( "Game" );                     // JFrame intialisieren und betiteln
//   f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // Standard Close Methode
//   f.setSize( 1080, 720 );                             // groesse des Fensters
//   f.add(new JLabel("Made by Meloncraft"));      // Text im Fenster
//   f.setResizable(false);                              // nicht vergroeßer oder kleinerbar
//   f.pack();
//
//   f.setVisible (true);
//
// }

  // Variablen, die zum berechnen benötigt werden intialisieren!
  public static void main(String[] args)
  {

    //frame();

    Scanner keyboard = new Scanner(System.in);
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
    System.out.println("Geben sie bitte die Beträge mit einem Punkt ein!");
       System.out.println("Da dieses Programm nicht für Großgeld ausgelegt ist, ist der höchste Schein nur 100€!");

    double SummeDouble = keyboard.nextDouble();
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
    System.out.println("Sie bekommen" + SummeDouble + "Euro");// !!!ACHTUNG!!! SummeDouble (double)
    System.out.println(hunderteuro + " 100-Euroschein(e)");
    System.out.println(fuenfzigeuro + " 50-Euroschein(e)");
    System.out.println(zwanzigeuro + " 20-Euroschein(e)");
    System.out.println(zehneuro + " 10-Euroschein(e)");
    System.out.println(fuenfeuro + " 5-Euroscheine(e)");
    System.out.println(zweieuro + " 2-Euromünze(n)");
    System.out.println(euro + " 1-Euromünze(n)");
    System.out.println(fuenfzigcent + " 50-Centmünze(n)");
    System.out.println(zwanzigcent + " 20-Centmünze(n)");
    System.out.println(zehncent + " 10-Centmünze(n)");
    System.out.println(fuenfcent + " 5-Centmünze(n)");
    System.out.println(zweicent + " 2-Centmünze(n)");
    System.out.println(cent + " Centmünze(n)");

    keyboard.close();

  //  public void ();

  }

    // ...

}
