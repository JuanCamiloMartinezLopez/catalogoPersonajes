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
public class FabricaOrcos implements FabricaAdstracta {

    @Override
    public ArmaAdstracta crearArma() {
        return new ArmaOrcos();
    }

    @Override
    public ArmaduraAdstracta crearArmadura() {
        return new ArmaduraOrcos();
    }

    @Override
    public CaballeriaAdstracta crearCaballeria() {
        return new CaballeriaOrcos();
    }

    @Override
    public PersonajeAdstracto crearPersonaje() {
        return new PersonajeOrcos();
    }

}
