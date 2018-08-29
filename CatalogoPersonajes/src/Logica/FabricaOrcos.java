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
public class FabricaOrcos implements FabricaAbstracta {

    @Override
    public ArmaAbstracta crearArma() {
        return new ArmaOrcos();
    }

    @Override
    public ArmaduraAbstracta crearArmadura() {
        return new ArmaduraOrcos();
    }

    @Override
    public CaballeriaAbstracta crearCaballeria() {
        return new CaballeriaOrcos();
    }

    @Override
    public PersonajeAbstracto crearPersonaje() {
        return new PersonajeOrcos();
    }

}
