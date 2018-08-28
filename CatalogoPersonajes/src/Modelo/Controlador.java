package Modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    private final Vista ventana;
    private Modelo model;

    public Controlador(Vista v) {
        ventana = v;
        model = ventana.getModelo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventana.getJBHumanos()) {
            System.out.println("humanos");
            model.enviarraza("humanos");
            
        } else {
            if (e.getSource() == ventana.getJBElfos()) {
                System.out.println("elfos");
                model.enviarraza("elfos");
                
            } else {
                if (e.getSource() == ventana.getJBOrcos()) {
                    System.out.println("orcos");
                    model.enviarraza("orcos");
                    
                }
            }
        }
    }

}
