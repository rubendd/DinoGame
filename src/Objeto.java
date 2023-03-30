
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author rubee
 */
public class Objeto {
    
    
   Timer timer;
    
    
    
    public void moverObjeto(JLabel objeto, JPanel panel, JLabel personaje, JLabel puntos) {
        int velocidad = 10; //velocidad a la que irá el objeto
        int posicionInicial = panel.getWidth() - objeto.getWidth(); // Posición inicial a la derecha del panel
         timer = new Timer(10, new ActionListener() {
            int posX = posicionInicial; // posicion que se actualizará
            @Override
            public void actionPerformed(ActionEvent e) {
                posX -= velocidad; // se le resta la posicion por 5 en cada iteracion.
                objeto.setLocation(posX - velocidad, objeto.getY()); //añadimos la posicion.   
                if (posX + objeto.getWidth() < 0) { // Si el objeto ha salido por completo del panel por la izquierda
                    posX = posicionInicial; // Reiniciamos la posición a la derecha del panel
                    objeto.setLocation(posX, objeto.getY());
                    puntuacion(puntos); //Llamamos al metodo de los puntos.
                }
                if(detectarColision(objeto, personaje)){
                    objeto.setLocation(posicionInicial, objeto.getY());
                    int n = JOptionPane.showConfirmDialog(panel, "Repetir?");
                    if (n == JOptionPane.YES_OPTION) {                       
                       reiniciarJuego(panel);
                       timer.stop();
                    } else {
                        System.exit(0);
                    }
                    
                }                 
            }
        });
        timer.start();
    }

    public boolean detectarColision(JLabel objeto, JLabel personaje) {
        Rectangle rect1 = objeto.getBounds();
        Rectangle rect2 = personaje.getBounds();
        return rect1.intersects(rect2);
    }
    
    public void reiniciarJuego(JPanel panel){
       SwingUtilities.getWindowAncestor(panel).dispose();
       Pantalla pantalla = new Pantalla();
       pantalla.setVisible(true);
    }
    
    public void puntuacion(JLabel puntos){
           int n = Integer.parseInt(puntos.getText());
           n++;
           puntos.setText(String.valueOf(n));
    }
}
