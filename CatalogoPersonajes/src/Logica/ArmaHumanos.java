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
public class ArmaHumanos implements ArmaAbstracta {

    private ImageIcon ImgArmHum= new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/armahumano.jpg")).getImage());

    @Override
    public ImageIcon ImagenArma() {
        return ImgArmHum;
    }

    

    
}
