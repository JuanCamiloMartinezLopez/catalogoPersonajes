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
public class PersonajeHumano implements PersonajeAbstracto {

    private ImageIcon ImgPerHum= new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/humano.png")).getImage());

    @Override
    public ImageIcon ImagenPersonaje() {
        return ImgPerHum;
    }

    

}
