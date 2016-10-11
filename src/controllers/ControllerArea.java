/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelAreas;
import views.ViewAreas;
import SRL.CambioString;
        
/**
 *
 * @author RoseLandjlord
 */
public class ControllerArea implements ActionListener{
        private ModelAreas modelAreas;
        private ViewAreas viewAreas;
        CambioString cambio=new CambioString();
    public ControllerArea(ModelAreas modelAreas, ViewAreas viewAreas)
        {
            this.modelAreas=modelAreas;
            this.viewAreas=viewAreas;
            this.viewAreas.jbtnResultCuad.addActionListener(this);
            this.viewAreas.jbtnResultCubo.addActionListener(this);
            this.viewAreas.jbtnAreaTriang.addActionListener(this);
            this.viewAreas.setVisible(true);
        }
    
    public void areaCuadro()
    {
       double lado=cambio.StringToDouble(this.viewAreas.jtfLado.getText());
       double area= lado*lado;
       this.viewAreas.jtfAreaCuadrado.setText(""+area);
    }
    public void areaCubo()
    {
        double a=cambio.StringToDouble(this.viewAreas.jtfA.getText());
        double area=6*(a*a);
        this.viewAreas.jtfA.setText(""+area);
    }
     public void areaTriang()
    {
       double base=cambio.StringToDouble(this.viewAreas.jtfBase.getText());
       double altura=cambio.StringToDouble(this.viewAreas.jtfAltura.getText());
       double area= (altura*base)/2;
       this.viewAreas.jtfAreaTriang.setText(""+area);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()==this.viewAreas.jbtnResultCuad)
      {
         areaCuadro();
      }else if(ae.getSource()==this.viewAreas.jbtnResultCubo)
      {
          areaCubo();
      }else if(ae.getSource()==this.viewAreas.jbtnAreaTriang)
      {
          areaTriang();
      }
        
    }
    
}
