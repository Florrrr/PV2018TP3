/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static java.lang.Math.sqrt;
import java.util.Scanner;
import modelo.ListaPunto;
import modelo.Punto;

/**
 *
 * @author CX
 */
public class PuntoBean {
    private Punto punto;
    private ListaPunto listaPunto;

    public PuntoBean() {
        listaPunto= new ListaPunto();
    }

    public PuntoBean(Punto punto, ListaPunto listaPunto) {
        this.punto = punto;
        this.listaPunto = listaPunto;
    }
    
    public Punto crearPunto(int c){
        Punto unPunto=new Punto();
        Scanner in=new Scanner(System.in);
        System.out.println("Ingrese x"+c+": ");
        unPunto.setX(in.nextInt());
        System.out.println("Ingrese y"+c+": ");
        unPunto.setY(in.nextInt());
        return unPunto;
    }
    
    public void llenarLista(){
        getListaPunto().getListadoPunto().add(crearPunto(1));
        getListaPunto().getListadoPunto().add(crearPunto(2));
    }
    
    public double calcularDistancia(){
        double m,aux1,aux2;
        int i=0;
        int[] aiuda=new int[5];
        for(Punto cadaPunto:listaPunto.getListadoPunto()){
            aiuda[i]=cadaPunto.getX();
            i++;
            aiuda[i]=cadaPunto.getY();
            i++;
        }
        aux1=aiuda[i-1]-aiuda[i-3];
        aux2=aiuda[i-2]-aiuda[i-4];
        aux1=Math.pow(aux1,2);
        aux2=Math.pow(aux2,2);
        m=sqrt(aux1+aux2);
        return m;
    }

    /**
     * @return the punto
     */
    public Punto getPunto() {
        return punto;
    }

    /**
     * @param punto the punto to set
     */
    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    /**
     * @return the listaPunto
     */
    public ListaPunto getListaPunto() {
        return listaPunto;
    }

    /**
     * @param listaPunto the listaPunto to set
     */
    public void setListaPunto(ListaPunto listaPunto) {
        this.listaPunto = listaPunto;
    }
    
}
