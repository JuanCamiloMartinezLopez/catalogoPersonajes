/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.ImageIcon;

/**
 *
 * @author Juan Camilo
 */
public class PersonajeOrcos implements PersonajeAbstracto {

    private ImageIcon ImgPerOrcs= new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/orco.jpg")).getImage());

    @Override
    public ImageIcon ImagenPersonaje() {
        return ImgPerOrcs;
    }

    

}
