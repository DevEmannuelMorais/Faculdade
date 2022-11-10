public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Preguica preguica = new Preguica();
        Cavalo cavalo = new Cavalo();
        Veterinaria veterinaria = new Veterinaria();


        cavalo.emitirSom();
        cachorro.emitirSom();
        preguica.emitirSom();


        veterinaria.examinar(cachorro);
        veterinaria.examinar(cavalo);
        veterinaria.examinar(preguica);
    }


}
