/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * Esta clase se ocupa del control del personaje y del label (su nombre) que le acompaña.
 * @author rubee
 * @version 1.0.0
 */
public class Controles {

    private int alturaInicial; //variable que obtendrá la altura inicial del personaje.
    private int alturaDespues; //La altura despues será la altura que cogerá en el salto.
    private int velocidad; //La velocidad a la que queremos que avance posiciones el personaje para volver a la altura inicial.
    private Timer timer; // Declaramos timer para controlar mejor la caida del personaje.
    
    
    /**
     * Ocupa todo el movimiento del personaje.
     * @param personaje es el label del personaje
     * @param pepito label del nombre
     * @param evt será el keyevent que lo tenemos en el espacio.
     */
    public void moverPersonaje(JLabel personaje, JLabel pepito, KeyEvent evt) {
        alturaInicial = personaje.getY();
        alturaDespues = personaje.getY() - 230;
        velocidad = 3;
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_SPACE:
                personaje.setLocation(personaje.getX(), alturaDespues); //Le indicamos que al presionar el espacio el personaje se localiza en la alturaDespues.
                pepito.setLocation(pepito.getX(), alturaDespues + 20); //Lo mismo con su label que acompaña.
                 timer = new Timer(58, new ActionListener() { //Instaciamos un Timer.
                    int deltaY = velocidad; // Esta variable hará el efecto de gravedad. Mas adelante lo veremos.
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int posY = personaje.getY(); //Esta variable será la que almacene la posicióna actual del personaje.
                        if (posY < alturaInicial) { //Si la posicion actual es menor que la de la altura inicial.
                            personaje.setLocation(personaje.getX(), posY + deltaY); //Añadimos la localizacion del personaje con la posicion actual + velocidad, que será los pixeles que baje.
                            pepito.setLocation(pepito.getX(), posY + deltaY); //Lo mismo con el label.
                            deltaY += velocidad; // Le sumamos 5 a la velocidad en cada iteracion del timer para que haga efecto de gravedad.
                        } else {
                            personaje.setLocation(personaje.getX(), alturaInicial); //Si la condición no se cumple el personaje vuelve a la posicion incial.
                            pepito.setLocation(pepito.getX(), alturaInicial); // Lo mismo con su label.
                            timer.stop(); // Y paramos el timer para que se reinicie el metodo.
                        }
                    }
                });
                timer.start();
                break;            
            default:
                throw new AssertionError();
        }
    }

}
