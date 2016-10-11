/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import models.ModelMain;
import views.ViewMain;

/**
 *
 * @author RoseLandjlord
 */
public class ControllerMain implements ActionListener {
     private ModelMain modelMain;
     private ViewMain viewMain;
     JPanel views[];
     
     public  ControllerMain(ModelMain modelMain,ViewMain viewMain, JPanel views[])
     {
         this.viewMain=viewMain;
         this.modelMain=modelMain;
         this.views=views;
         this.viewMain.jMenuItemAreas.addActionListener(this);
         this.viewMain.jMenuItemVolumenes.addActionListener(this);
         this.viewMain.jMenuItemPerimetros.addActionListener(this);
         
         
     
     }
     public void init_view()
     {
         this.viewMain.setTitle("CALCULO DE AREAS,VOLUMENES Y Perimetros");
         this.viewMain.setLocationRelativeTo(null);
         this.viewMain.setVisible(true);
     
     }
     public void actionPerfomedArea()
    {
       this.viewMain.setContentPane(views[0]);
       this.viewMain.revalidate();
       this.viewMain.repaint();
    
    }
     public void actionPerfomedVolumen()
    {
       this.viewMain.setContentPane(views[1]);
       this.viewMain.revalidate();
       this.viewMain.repaint();
    
    }
      public void actionPerfomedPerimetros()
    {
       this.viewMain.setContentPane(views[2]);
       this.viewMain.revalidate();
       this.viewMain.repaint();
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==this.viewMain.jMenuItemAreas)
        {
           actionPerfomedArea();
        
        } else if(ae.getSource()==this.viewMain.jMenuItemVolumenes)
        {
           actionPerfomedVolumen();
        
        } else if(ae.getSource()==this.viewMain.jMenuItemPerimetros)
        {
           actionPerfomedPerimetros();
        
        }
    }
    
}
