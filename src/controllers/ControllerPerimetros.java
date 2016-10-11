/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import models.ModelPerimetros;
import views.ViewMain;
import views.ViewPerimetros;

/**
 *
 * @author AlfrEdO..XD
 */
public class ControllerPerimetros implements ActionListener{

         
    
    public ViewMain view;
    public ViewPerimetros viewP;
    public ModelPerimetros modelPerimetro;
    
       public ControllerPerimetros(ViewPerimetros viewP, ModelPerimetros modelPerimetros) {
        this.modelPerimetro = modelPerimetro;
        
        this.viewP = viewP;
        
        this.viewP.jbtn_calcular.addActionListener(this);
        
    }
      
    @Override
    public void actionPerformed(ActionEvent ae) {
       
        if (ae.getSource () == this.viewP.jbtn_calcular) {
            
            if(viewP.jcb_figuras.getSelectedItem().equals("Esfera")) {
                Esfera();
            }
            
            else if (viewP.jcb_figuras.getSelectedItem().equals("Cubo")) {
                Cubo();
            }
            
            else if (viewP.jcb_figuras.getSelectedItem().equals("Prisma")) {
                Prisma();
            }
        }
    }
    
    public void Esfera () {
        
        Integer pi = Integer.parseInt(viewP.jtf_num1.getText());
        Integer radio = Integer.parseInt(viewP.jtf_altura.getText());
        
        String resultado = pi.toString(2 * pi * radio);
        
              
        viewP.jtf_resultado.setText(resultado);
    }
    public void Cubo () {
        
        Integer numero = Integer.parseInt(viewP.jtf_num1.getText());
        Integer cuadrado = Integer.parseInt(viewP.jtf_altura.getText());
        
        String resultado = numero.toString(numero*numero*numero);
             
        viewP.jtf_resultado.setText(resultado);
    }
    public void Prisma () {
        
        int pi = 3;
        Integer base = Integer.parseInt(viewP.jtf_num1.getText());
        
        
        String resultado = base.toString(pi * base);
        
               viewP.jtf_resultado.setText(resultado);
    }
}
