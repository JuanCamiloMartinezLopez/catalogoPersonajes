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
public class ArmaduraHumanos implements ArmaduraAdstracta {

    private BufferedImage ImgArmduraHum;

    public ArmaduraHumanos() throws IOException {
        this.ImgArmduraHum = ImageIO.read(new File("../imagenes/armadurahumano.jpg"));
    }

    @Override
    public BufferedImage ImagenArmadura() {
        return this.ImgArmduraHum;
    }

}
