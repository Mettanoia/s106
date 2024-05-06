package domain.entities;

public class Generic {

    public <T extends Telephone> void trucar(T e) {
        e.trucar();
    }

    public <R extends Smartphone> void ferFotos(R r) {
        r.ferFotos();
    }

    public <Q extends Telephone> void ferFotosSafe(Q q) {
        try {

            Smartphone smartphone = (Smartphone) q;
            smartphone.ferFotos(); // You safely call the method

        } catch (ClassCastException classCastException) {

            System.out.println("Cannot call ferFotos(). " + q.getClass() + "is not of type Smartphone");

        }
    }

}
