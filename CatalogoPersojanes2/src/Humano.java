
public class Humano extends ConstrutorPersonaje {

    @Override
    public void construirPers() {
        Pers = new Personaje();
        Fabrica = new FabricaHumanos();
        Arma = Fabrica.crearArma();
        Armadura = Fabrica.crearArmadura();
        Personaje = Fabrica.crearPersonaje();
    }

    @Override
    public void construirImgPers() {
        Pers.setImgArma(Arma.ImagenArma());
        Pers.setImgArmadura(Armadura.ImagenArmadura());
        Pers.setImgPersonaje(Personaje.ImagenPersonaje());
    }

}
