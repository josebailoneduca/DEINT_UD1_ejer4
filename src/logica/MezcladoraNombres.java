/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */
package logica;

import gui.PantallaMain;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Inicio del programa. Contiene la logica de control de la mezcla de nombres
 * 
 * @author Jose Javier Bailón Ortiz
 */
public class MezcladoraNombres {

     //ATRIBUTOS
    /**
     * Referencia a la pantalla principal
     */
    private PantallaMain pPrin;

    /**
     * Set referencia a pantalla principal
     *
     * @param pPrin La pantalla principal
     */
    public void setpPrin(PantallaMain pPrin) {
        this.pPrin = pPrin;
    }

    /**
     * Mezcla los nombres 4 veces y los manda a la pantalla principal
     *
     * @param nombre1 Primer nombre a usar en la mezcla
     * @param nombre2 Segundo nombre a usar en la mezcla
     */
    public void mezcla(String nombre1, String nombre2) {
        //validacion
        if (!validar(nombre1) || !validar(nombre2)) {
            this.pPrin.avisoError();
        }
        //Genera un resultado con 4 nombres mezclados

        String resultado
                = this.mezclaNombres(nombre1, nombre2) + ", "
                + this.mezclaNombres(nombre1, nombre2) + ", "
                + this.mezclaNombres(nombre1, nombre2) + ", "
                + this.mezclaNombres(nombre1, nombre2);

        //avisa  all pantalla principal del resultado
        this.pPrin.activarResultado(resultado);
    }

    /**
     * Mezcla dos nombres. Lo hace entremezclando tramos de cada nombre de manera aleatoria.
     * Va avanzando por los nombres detectando tramos que terminan en vocal.
     * y agregandolos de manera desordenada al resultado.
     *
     * @param nombre1 Primer nombre
     * @param nombre2 Segundo nombre
     * @return Mezcla de los nombres
     */
    private String mezclaNombres(String nombre1, String nombre2) {
        //preparacion de datos para la mezcla
        nombre1 = nombre1.toLowerCase();
        nombre2 = nombre2.toLowerCase();
        String resultado = "";
        Random r = new Random();
        int indice1 = 0;
        int indice2 = 0;
        String[] v = {"a", "e", "i", "o", "u"};
        List<String> vocales = Arrays.asList(v);

        //Mezclar los tramos de los nombres
        while (indice1 != nombre1.length() || indice2 != nombre2.length()) {
            //decidir de qué palabra se coge el siguiente tramo
            float azar = r.nextFloat();
            //buscar un tramo en alguna de las palabras
            boolean segmentoEncontrado = false;
            //si azar es <0.5 coger tramo de primer nombre
            if (azar < 0.5) {
                //agregar tramo que acaba en vocal o en el final de palabra
                while (!segmentoEncontrado && indice1 != nombre1.length()) {
                    String caracter = nombre1.substring(indice1, indice1 + 1);
                    resultado += caracter;
                    indice1++;
                    if (vocales.contains(caracter)) {
                        segmentoEncontrado = true;
                    }
                }
            //si azar no es menor de 0.5 coger tramo de segundo nombre
            } else {
                //deteccion del tramo que acaba en vocal o en el final de palabra
                while (!segmentoEncontrado && indice2 != nombre2.length()) {
                    String caracter = nombre2.substring(indice2, indice2 + 1);
                    resultado += caracter;
                    indice2++;
                    if (vocales.contains(caracter)) {
                        segmentoEncontrado = true;
                    }
                }
            }
        }
        //poner en mayuscula la primera letra
        String primeraLetra = resultado.substring(0,1);
        resultado=primeraLetra.toUpperCase()+resultado.substring(1,resultado.length());
        //devolucion del resultado
        return resultado;
    }

    /**
     * Valida un nombre para ser usado
     *
     * @param nombre El nombre a validar
     * @return True si no es nulo y tiene 4 o mas caracteres. False en otro caso
     */
    private boolean validar(String nombre) {
        return (nombre != null && nombre.length() >= 4) ;
    }

    /**
     * Main del programa. crea una instancia de la logica. Despues crea la ventana
     * principal y le pasa una referencia a la logica.
     * @param args 
     */
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                //creacion de la logica de negocio
                MezcladoraNombres mN = new MezcladoraNombres();
                
                //creacion de la pantalla principal 
                //pasando una referencia de la logica a la ventana
                PantallaMain pPrin = new PantallaMain(mN);
                //Pasar referencia de la pantalla a logica negocio
                mN.setpPrin(pPrin);
                //posicionamiento y visualizacin de la ventana principal
                pPrin.setLocationRelativeTo(null);
                pPrin.setVisible(true);
            }
        });
    }

}//end MezcladoraNombres
