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
public class FabricaElfos implements FabricaAdstracta {

    @Override
    public ArmaAdstracta crearArma() {
        return new ArmaElfos();
    }

    @Override
    public ArmaduraAdstracta crearArmadura() {
        return new ArmaduraElfos();
    }

    @Override
    public CaballeriaAdstracta crearCaballeria() {
        return new CaballeriaElfos();
    }

    @Override
    public PersonajeAdstracto crearPersonaje() {
        return new PersonajeElfo();
    }

}
