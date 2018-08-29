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
public class CaballeriaElfos implements CaballeriaAdstracta{
    
    private ImageIcon ImgCabElf= new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/cabelfo.jpg")).getImage());

    @Override
    public ImageIcon ImagenCaballeria() {
        return ImgCabElf;
    }

    
    
}
