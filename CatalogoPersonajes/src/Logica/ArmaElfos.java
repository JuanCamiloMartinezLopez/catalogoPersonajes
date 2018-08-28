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
public class ArmaElfos implements ArmaAdstracta {

    private BufferedImage ImgArmElf;

    public ArmaElfos() throws IOException {
        this.ImgArmElf = ImageIO.read(new File("../imagenes/armaelfo.jpg"));
    }

    @Override
    public BufferedImage ImagenArma() {
        return this.ImgArmElf;
    }

}
