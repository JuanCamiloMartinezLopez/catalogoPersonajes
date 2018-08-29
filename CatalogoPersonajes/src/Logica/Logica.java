/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Modelo;
import java.awt.Graphics;

public class Logica {

    FabricaAdstracta fabrica;
    ArmaAdstracta arma;
    ArmaduraAdstracta armadura;
    PersonajeAdstracto personaje;
    CaballeriaAdstracta caballeria;
    private final Modelo Mimodelo;

    public void dibujarRaza(String raza) {
        Graphics IPer=Mimodelo.getVista().getLPersonaje().getGraphics();
        Graphics IArm=Mimodelo.getVista().getLArma().getGraphics();
        Graphics IArmd=Mimodelo.getVista().getLArmadura().getGraphics();
        Graphics ICab=Mimodelo.getVista().getLCaballeria().getGraphics();
        
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
        IPer.drawImage(personaje.ImagenPersonaje().getImage(), 0, 0,Mimodelo.getVista().getLPersonaje().getWidth() , Mimodelo.getVista().getLPersonaje().getHeight(),null );
        IArm.drawImage(arma.ImagenArma().getImage(), 0, 0,Mimodelo.getVista().getLPersonaje().getWidth() , Mimodelo.getVista().getLPersonaje().getHeight(),null );
        IArmd.drawImage(armadura.ImagenArmadura().getImage(), 0, 0,Mimodelo.getVista().getLPersonaje().getWidth() , Mimodelo.getVista().getLPersonaje().getHeight(),null );
        ICab.drawImage(caballeria.ImagenCaballeria().getImage(), 0, 0,Mimodelo.getVista().getLPersonaje().getWidth() , Mimodelo.getVista().getLPersonaje().getHeight(),null );

    }

    public Logica(Modelo m) {
        Mimodelo = m;
    }

}
