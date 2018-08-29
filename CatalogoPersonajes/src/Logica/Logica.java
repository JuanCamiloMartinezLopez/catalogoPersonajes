/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Modelo;
import java.awt.Graphics;

public class Logica {

    FabricaAbstracta fabrica;
    ArmaAbstracta arma;
    ArmaduraAbstracta armadura;
    PersonajeAbstracto personaje;
    CaballeriaAbstracta caballeria;
    private final Modelo Mimodelo;

    public void dibujarRaza(String raza) {
        Graphics IPer=Mimodelo.getVista().getLPersonaje().getGraphics();
        Graphics IArm=Mimodelo.getVista().getLArma().getGraphics();
        Graphics IArmd=Mimodelo.getVista().getLArmadura().getGraphics();
        Graphics ICab=Mimodelo.getVista().getLCaballeria().getGraphics();
        
        switch (raza) {
            case "humanos":
                fabrica = new FabricaHumanos();
                break;
            case "elfos":
                fabrica = new FabricaElfos();
                break;
            case "orcos":
                fabrica = new FabricaOrcos();
                break;
            default:
                break;
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
