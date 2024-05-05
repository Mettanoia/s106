package domain.entities;

public class Smartphone implements Telephone{

    public void ferFotos(){
        System.out.println("ferFotos()");
    }

    @Override
    public void trucar() {
        System.out.println("trucar()");
    }
}
