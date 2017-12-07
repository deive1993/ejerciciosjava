/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticagraficos;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 2014
 */
public class Ventana {
JFrame ventana;
JPanel PanelA,PanelB;
JLabel saludo,saludo2;
JButton boton;


public void crearPanelA(){
    PanelA =new JPanel();
    saludo = new JLabel("Bienvenidos");
    saludo2 = new JLabel(" Bienvenido de nuevo ");
    PanelA.setLayout(new BoxLayout(PanelA,BoxLayout.X_AXIS));
    PanelA.setLayout(new BoxLayout(PanelA,BoxLayout.X_AXIS));
    PanelA.add(saludo);//colcando etiqueta
    PanelA.add(saludo2);
    
    
//  saludo.setText("Bienvenidos");
}

public void crearPanelB(){
    
    PanelB =new JPanel();
    boton = new JButton();
    boton.setText("Entrar");
    PanelB.setLayout(new BoxLayout(PanelB, BoxLayout.X_AXIS));
    PanelB.add(boton);
}



    
    public void crearVentana(){
        
        ventana = new JFrame();
        ventana.setTitle(" Se supone que soy un ascensor ");
        ventana.setSize(400,400);
        ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));//PARA AGREGAR PANELÑ
        ventana.add(PanelA);
        ventana.add(PanelB);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
                
        
        
       
            
        }
    
     public Ventana(){
         crearPanelA();
         crearPanelB();
         crearVentana();
        
    }
    
    
}

    

