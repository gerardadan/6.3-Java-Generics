package ex1;

public class Smartphone implements Phone{
    public void takePhoto() {
        System.out.println("Photo made");
    }

    @Override
    public void phoncall() {
        System.out.println("Phonecall made!");
    }
}
