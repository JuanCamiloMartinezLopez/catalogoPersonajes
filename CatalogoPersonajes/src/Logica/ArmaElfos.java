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
public class ArmaElfos implements ArmaAbstracta {

    private ImageIcon ImgArmElf= new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/armaelfo.jpg")).getImage());
    
    @Override
    public ImageIcon ImagenArma() {
        return ImgArmElf;
    }

    

}
