
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class logica {

    public void dibujar(int NumH, int NumE, int NumO, JPanel lienzo) {
        Graphics g = lienzo.getGraphics();
        ImageIcon Orco = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/Orco F PNG.png")).getImage());
        ImageIcon MatrizImg[][];
        int Sx = 0, Sy = 0;
        int n = 0, m = 0;
        int TImg = NumH + NumE + NumO;
        if (TImg != 0) {
            if (TImg % 2 == 0) {
                n = (int) Math.sqrt(((TImg * 3) / 4));
                System.out.println("1." + (int) Math.sqrt(((TImg * 3) / 4)));
                m = (n * 4) / 3;
                System.out.println("2." + (n * 4) / 3);
            } else {
                n = ((int) (Math.sqrt(((TImg * 3) / 4)))) + 2;
                m = (int) (Math.sqrt(((TImg * 3) / 4)) * 4) / 3;

            }

            MatrizImg = new ImageIcon[n][m];
            g.setColor(lienzo.getBackground());
            g.fillRect(4, 4, lienzo.getWidth() - 10, lienzo.getHeight() - 10);
            System.out.println("n." + n);
            System.out.println("m." + m);
            g.setColor(Color.BLACK);
            Sx = (lienzo.getWidth() / m);
            Sy = (lienzo.getHeight() / n);
            System.out.println("Sx." + Sx);
            System.out.println("Sy." + Sy);
            for (int i = 0; i < m + 1; i++) {
                g.drawLine(i * Sx, 4, i * Sx, lienzo.getHeight() - 4);

            }
            for (int k = 0; k < n + 1; k++) {
                g.drawLine(4, k * Sy, lienzo.getWidth(), k * Sy - 4);
            }
            int cont = TImg;
            for (int i = 0; i < m; i++) {
                for (int k = 0; k < n; k++) {
                    if (cont != 0) {
                        System.out.println("cont." + cont);
                        g.drawImage(Orco.getImage(), i * Sx, k * Sy, Sx, Sy, null);
                        cont--;
                    }
                }
            }

        }

    }

}
