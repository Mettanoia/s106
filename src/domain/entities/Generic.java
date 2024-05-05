package domain.entities;

public class Generic {

    public <T extends Telephone> void firstMethod(T e) {
        e.trucar();
    }

    public <R extends Smartphone> void secondMethod(R r) {
        r.ferFotos();
    }

    public <Q extends Telephone> void secondMethodSafeCase(Q q) {
        try {

            Smartphone smartphone = (Smartphone) q;
            smartphone.ferFotos(); // You safely call the method

        } catch (ClassCastException classCastException) {

            System.out.println("Cannot call ferFotos(). " + q.getClass() + "is not of type Smartphone");

        } catch (Exception e) {
            throw new RuntimeException(e); // If there is an Exception while closing we will consider it an invariant violation
        }
    }

}
