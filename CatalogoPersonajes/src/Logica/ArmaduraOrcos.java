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
public class ArmaduraOrcos implements ArmaduraAdstracta {

    private ImageIcon ImgArmaduraOrcs= new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/armaduraorco.jpg")).getImage());

    @Override
    public ImageIcon ImagenArmadura() {
        return ImgArmaduraOrcs;
    }

    

}
