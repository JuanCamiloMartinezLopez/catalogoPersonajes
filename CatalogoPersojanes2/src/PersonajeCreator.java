
public class PersonajeCreator {

    private Personaje personaje;

    public PersonajeCreator(String TypePers) {
        DirectorPersonaje Dir = new DirectorPersonaje();
        
//        if("Elfo".equals(TypePers)){
//            
//            Dir.setConstructor(new Elfo());
//            
//        } else {
//            
//            if("Humano".equals(TypePers)){
//                
//                Dir.setConstructor(new Humano());
//            
//            } else {
//                
//                Dir.setConstructor(new Orco());
//            }
//        }
        
        switch (TypePers) {
            case "Elfo":
                
                Dir.setConstructor(new Elfo());
                break;
            case "Humano":
                
                Dir.setConstructor(new Humano());
                break;
            case "Orco":
                
                Dir.setConstructor(new Orco());
                break;
            default:
                break;
        }
        
        Dir.construirPersonaje();
        personaje=Dir.getPersonaje();
    }
    
    public Personaje retrievePersonaje() {
        return (Personaje) personaje.clone();
    } 

}
