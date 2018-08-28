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
public interface FabricaAdstracta {
    
    public ArmaAdstracta crearArma();
    public ArmaduraAdstracta crearArmadura();
    public CaballeriaAdstracta crearCaballeria();
    public PersonajeAdstracto crearPersonaje();
    
    
}
