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
public class PersonajeElfo implements PersonajeAdstracto {

    private BufferedImage ImgPerElf;

    public PersonajeElfo() throws IOException {
        this.ImgPerElf = ImageIO.read(new File("../imagenes/elfo.jpg"));
    }

    @Override
    public BufferedImage ImagenPersonaje() {
        return this.ImgPerElf;
    }

}
