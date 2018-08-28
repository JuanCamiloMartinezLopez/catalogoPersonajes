/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Modelo;
import java.awt.Canvas;
import java.awt.Graphics;

public class Logica {

    FabricaAdstracta fabrica;
    ArmaAdstracta arma;
    ArmaduraAdstracta armadura;
    PersonajeAdstracto personaje;
    CaballeriaAdstracta caballeria;
    private final Modelo Mimodelo;

    public void dibujarRaza(String raza) {
        System.out.println("1");
        Canvas LPersonaje = Mimodelo.getVista().getLienzoPer();
        Canvas LArma = Mimodelo.getVista().getLienzoArma();
        Canvas LArmadura = Mimodelo.getVista().getLienzoArmad();
        Canvas LCaballeria = Mimodelo.getVista().getLienzoCab();
        Graphics lapizPer = LPersonaje.getGraphics();
        Graphics lapizArm = LArma.getGraphics();
        Graphics lapizArmad = LArmadura.getGraphics();
        Graphics lapizCab = LCaballeria.getGraphics();
        System.out.println("2");

        if (raza.equals("humanos")) {
            fabrica = new FabricaHumanos();

        } else {
            if (raza.equals("elfos")) {
                fabrica = new FabricaElfos();
            } else {
                if (raza.equals("orcos")) {
                    fabrica = new FabricaOrcos();
                }
            }
        }
        System.out.println("3");

        arma = fabrica.crearArma();
        armadura = fabrica.crearArmadura();
        personaje = fabrica.crearPersonaje();
        caballeria = fabrica.crearCaballeria();
        lapizPer.drawImage(personaje.ImagenPersonaje(), 0, 0, LPersonaje.getWidth(), LPersonaje.getHeight(), LPersonaje);
        lapizArm.drawImage(arma.ImagenArma(), 0, 0, LArma.getWidth(), LArma.getHeight(), LArma);
        lapizArmad.drawImage(armadura.ImagenArmadura(), 0, 0, LArmadura.getWidth(), LArmadura.getHeight(), LArmadura);
        lapizCab.drawImage(caballeria.ImagenCaballeria(), 0, 0, LCaballeria.getWidth(), LCaballeria.getHeight(), LCaballeria);
        System.out.println("4");

    }

    public Logica(Modelo m) {
        Mimodelo = m;
    }

}
