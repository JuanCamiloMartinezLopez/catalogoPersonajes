
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class logica {

    public void dibujar(int NumH, int NumE, int NumO, JPanel lienzo) {
        Graphics g = lienzo.getGraphics();
        ImageIcon Orco = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/Orco.png")).getImage());
        ImageIcon Humano = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/Humano.png")).getImage());
        ImageIcon ArmaO = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/ArmaO.png")).getImage());
        ImageIcon ArmaduraO = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/ArmaduraO.png")).getImage());
        ImageIcon ArmaH = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/ArmaH.png")).getImage());
        ImageIcon ArmaduraH = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/ArmaduraH.png")).getImage());
        //ImageIcon MatrizImg[][];
        int Sx = 0, Sy = 0;
        int n = 0, m = 0;
        int TImg = NumH + NumE + NumO;
        if (TImg != 0) {
            if (TImg % 2 == 0) {
                n = (int) Math.ceil(Math.sqrt(((TImg * 3.) / 4.)));
                System.out.println("1." + Math.sqrt(((TImg * 3) / 4)));
                m = (int) Math.ceil((n * 4.) / 3.);
                float prueba;
                prueba = (float) Math.sqrt(4.5);
                System.out.println("2.1" + prueba);
                System.out.println("2." + (n * 4) / 3);
            } else {
                n = (int) Math.ceil(((Math.sqrt(((TImg * 3) / 4)))) + 1);
                m = (int) Math.ceil((n * 4) / 3);

            }

            //MatrizImg = new ImageIcon[n][m];
            g.setColor(lienzo.getBackground());
            g.fillRect(0, 0, lienzo.getWidth(), lienzo.getHeight());
            System.out.println("n." + n);
            System.out.println("m." + m);
            g.setColor(Color.BLACK);
            Sx = (lienzo.getWidth() / m);
            Sy = (lienzo.getHeight() / n);
            System.out.println("Sx." + Sx);
            System.out.println("Sy." + Sy);
            for (int i = 0; i < m + 1; i++) {

                g.drawLine(i * Sx, 4, i * Sx, n * Sy);

            }
            for (int k = 0; k < n + 1; k++) {
                g.drawLine(4, k * Sy, m * Sx, k * Sy - 4);
            }
            int cont = TImg;
            int contH = NumH, contO = NumO;
            for (int i = 0; i < m; i++) {
                for (int k = 0; k < n; k++) {
                    if (cont != 0) {
                        if (contO != 0) {
                            System.out.println("cont." + cont);
                            g.drawImage(Orco.getImage(), i * Sx, k * Sy, Sx, Sy, null);
                            g.drawImage(ArmaduraO.getImage(), i * Sx, k * Sy, Sx, Sy, null);
                            g.drawImage(ArmaO.getImage(), i * Sx, k * Sy, Sx, Sy, null);
                            contO--;
                        } else {
                            if (contH != 0) {
                                System.out.println("cont." + cont);
                                g.drawImage(Humano.getImage(), i * Sx, k * Sy, Sx, Sy, null);
                                g.drawImage(ArmaduraH.getImage(), i * Sx, k * Sy, Sx, Sy, null);
                                g.drawImage(ArmaH.getImage(), i * Sx, k * Sy, Sx, Sy, null);
                                contH--;
                            }
                        }
                        cont--;
                    } else {
                        g.setColor(lienzo.getBackground());
                        g.fillRect((i * Sx) + 1, k * Sy, Sx, Sy);
                    }
                }
            }

        }

    }

}
