/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.*;
import views.*;
import controllers.*;
import javax.swing.JPanel;
/**
 *
 * @author RoseLandjlord
 * Prueba 1
 */
public class Main {
   
    public static void main(String Rose[])
    {
      ViewAreas viewAreas=new ViewAreas();
      ModelAreas modelAreas=new ModelAreas();
      ControllerArea controllerAreas=new ControllerArea(modelAreas,viewAreas);
      
      ViewVolumenes viewVolumen=new ViewVolumenes();
      ModelVolumenes modelVolumen= new ModelVolumenes();
      controllerVolumenes controllerVolumen=new controllerVolumenes(modelVolumen,viewVolumen);
      
      ViewPerimetros viewP = new ViewPerimetros();
      ModelPerimetros modelPerimetros = new ModelPerimetros();
      ControllerPerimetros controllerPerimetros = new ControllerPerimetros(viewP,modelPerimetros);
              
      
         JPanel view[]=new JPanel[3];
                view[0]=viewAreas;
                view[1]=viewVolumen;
                view[2]=viewP;
    
       ViewMain viewMain= new ViewMain();
       ModelMain modelMain=new ModelMain();
       ControllerMain controllerMain = new ControllerMain(modelMain,viewMain,view);
       controllerMain.init_view();
       
    
    
    
    }
}

