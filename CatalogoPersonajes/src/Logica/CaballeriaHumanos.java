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
public class CaballeriaHumanos implements CaballeriaAdstracta {

    private BufferedImage ImgCabHum;

    public CaballeriaHumanos() throws IOException {
        this.ImgCabHum = ImageIO.read(new File("../imagenes/cabhumano.jpg"));
    }

    @Override
    public BufferedImage ImagenCaballeria() {
        return this.ImgCabHum;
    }

}
