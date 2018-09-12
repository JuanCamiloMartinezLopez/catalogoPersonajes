
public class PersonajeCreator {

    private Personaje personaje;

    public PersonajeCreator(String TypePers) {
        DirectorPersonaje Dir = new DirectorPersonaje();
        if ("Elfo".equals(TypePers)) {
            Dir.setConstructor(new Elfo());
        } else {
            if ("Humano".equals(TypePers)) {
                Dir.setConstructor(new Humano());
            } else {
                Dir.setConstructor(new Orco());
            }
        }
        Dir.construirPersonaje();
        personaje=Dir.getPersonaje();
    }
    
    public Personaje retrievePersonaje() {
        return (Personaje) personaje.clone();
    } 

}
