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
public class CaballeriaOrcos implements CaballeriaAbstracta {

    private ImageIcon ImgCabOrcs= new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/caborco.jpg")).getImage());

    @Override
    public ImageIcon ImagenCaballeria() {
        return ImgCabOrcs;
    }

    

}
