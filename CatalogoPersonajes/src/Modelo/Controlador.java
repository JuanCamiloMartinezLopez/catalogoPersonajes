package Modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    
    private Vista ventana;
    private Modelo model;

    public Controlador(Vista v) {
        ventana = v;
        model = ventana.getModelo();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == ventana.getJBHumanos()) {
            System.out.println("humanos");
            //model.enviarraza("humanos");
            System.out.println("Llegué a esta línea");
        } else if (evt.getSource() == ventana.getJBElfos()) {
            System.out.println("elfos");
            //model.enviarraza("elfos");              
        } else if (evt.getSource() == ventana.getJBOrcos()) {
            System.out.println("orcos");
            //model.enviarraza("orcos");               
        }

    }

}
