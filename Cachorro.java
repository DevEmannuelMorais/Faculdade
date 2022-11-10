public class Cachorro extends Animal implements deveCorrer{

    @Override
    public void correr() {
        System.out.println("Correr");
    }


    public void emitirSom() {
        System.out.println("AUAUAU");

    }
}
