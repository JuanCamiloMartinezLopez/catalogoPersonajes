/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Juan Camilo
 */
public class ArmaduraElfos implements ArmaduraAdstracta {

    private BufferedImage ImgArmduraElf;

    public ArmaduraElfos() throws IOException {
        this.ImgArmduraElf = ImageIO.read(new File("../imagenes/armaduraelfo.jpg"));
    }

    @Override
    public BufferedImage ImagenArmadura() {
        return this.ImgArmduraElf;
    }

}
