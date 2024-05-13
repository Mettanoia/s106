package n1;

import n1.domain.entities.Generic;
import n1.domain.entities.Smartphone;
import n1.domain.entities.Telephone;

/**
 * <p>Per fer aquest exercici necessites una interfície anomenada Telefon i tres classes: Smartphone, Generica i la Principal.</p>
 *
 * <p>La interfície Telefon ha de tenir un mètode anomenat trucar(). La classe Smartphone ha d’implementar Telefon, i a més del mètode trucar(), també ha de tenir el mètode ferFotos(). </p>
 *
 * <p>La classe Generica ha de tenir dos mètodes genèrics, el primer ha de rebre un tipus d’argument limitat per la interfície Telefon i el segon ha de rebre un argument limitat per la classe Smartphone. Des d’aquests dos mètodes crida els mètodes pertinents de Telefon i Smartphone. En el main() de la classe Principal, passa un objecte de la classe Smartphone als dos mètodes genèrics de la classe Generica.</p>
 *
 * <p>El mètode limitat per la interfície Telefon, de la classe Generica, pot cridar al mètode ferFotos()?</p>
 */
class Application implements Runnable {
    @Override
    public void run() {


        Telephone covariantTelephone = new Smartphone(); // Smartphone is the only implementation of Telephone
        Smartphone actualSmartphone = new Smartphone();

        Generic generic = new Generic();

        generic.trucar(covariantTelephone); // Forwarding to trucar() using Telephone as reference type

        generic.trucar(actualSmartphone);   // Forwarding to trucar() using Smartphone as reference type
        generic.ferFotos(actualSmartphone); // Forwarding to ferFotos() using Smartphone as reference type

        generic.ferFotosSafe(() -> System.out.println("ferFotos")); // Functional interface in order to fake a non-Smartphone Telephone subtype
        generic.ferFotosSafe(covariantTelephone); // Forwarding to ferFotos using a Smartphone as reference type

    }
}
