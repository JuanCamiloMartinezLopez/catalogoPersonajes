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
public class FabricaElfos implements FabricaAbstracta {

    @Override
    public ArmaAbstracta crearArma() {
        return new ArmaElfos();
    }

    @Override
    public ArmaduraAbstracta crearArmadura() {
        return new ArmaduraElfos();
    }

    @Override
    public CaballeriaAbstracta crearCaballeria() {
        return new CaballeriaElfos();
    }

    @Override
    public PersonajeAbstracto crearPersonaje() {
        return new PersonajeElfo();
    }

}
