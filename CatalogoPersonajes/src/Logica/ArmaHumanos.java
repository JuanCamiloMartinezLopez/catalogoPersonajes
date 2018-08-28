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
public class ArmaHumanos implements ArmaAdstracta {

    private BufferedImage ImgArmHum;;

    public ArmaHumanos() throws IOException {
        this.ImgArmHum = ImageIO.read(new File("../imagenes/armahumano.jpg"));
    }

    @Override
    public BufferedImage ImagenArma() {
        return this.ImgArmHum;
    }
}
