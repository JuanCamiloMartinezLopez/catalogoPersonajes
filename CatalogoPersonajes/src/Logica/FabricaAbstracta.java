/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Juan Camilo
 */
public interface FabricaAbstracta {
    
    public ArmaAbstracta crearArma();
    public ArmaduraAbstracta crearArmadura();
    public CaballeriaAbstracta crearCaballeria();
    public PersonajeAbstracto crearPersonaje();
    
    
}
