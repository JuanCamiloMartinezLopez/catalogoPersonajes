/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Logica.Logica;

/**
 *
 * @author Juan Camilo
 */
public class Modelo {

    private Vista MiVista;
    private Logica MiCatalogo;

    public Modelo() {

    }

    public void iniciar() {
        getVista().setVisible(true);

    }

    public Vista getVista() {
        if (MiVista == null) {
            MiVista = new Vista(this);
            MiVista.setSize(730, 395);
            MiVista.setResizable(false);
            MiVista.setLocationRelativeTo(null);
        }
        return MiVista;

    }

    public Logica getLogica() {
        if (MiCatalogo == null) {
            MiCatalogo = new Logica(this);
        }
        return MiCatalogo;
    }

    public void enviarraza(String raza) {

        getLogica().dibujarRaza(raza);
    }

    public void prueba() {
        System.out.println("6");
    }

}
