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
public class FabricaHumanos implements FabricaAdstracta {

    @Override
    public ArmaAdstracta crearArma() {
        return new ArmaHumanos();
    }

    @Override
    public ArmaduraAdstracta crearArmadura() {
        return new ArmaduraHumanos();
    }

    @Override
    public CaballeriaAdstracta crearCaballeria() {
        return new CaballeriaHumanos();
    }

    @Override
    public PersonajeAdstracto crearPersonaje() {
        return new PersonajeHumano();
    }

}
