public class Preguica extends Animal implements SubirArvore{


    public void emitirSom() {
        System.out.println("ausaushda");
    }


    @Override
    public void subirEmArvore() {
        System.out.println("subindo na arvore");
    }
}
