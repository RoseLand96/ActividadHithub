/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.*;
import views.*;
import controlllerss.*;
import javax.swing.JPanel;
/**
 *
 * @author RoseLandjlord
 */
public class Main {
   
    public static void main(String Rose[])
    {
      ViewAreas viewAreas=new ViewAreas();
      ModelAreas modelAreas=new ModelAreas();
      ControllerArea controllerAreas=new ControllerArea(modelArea,viewArea);
      
      ViewVolumen viewVolumen=new ViewVolumen();
      ModelVolumen modelVolumen= new ModelVolumen();
      ControllerVolumen controllerVolumen=new ControllerVolumen(modelVolumen,viewVolumen);
      
         JPanel view[]=new JPanel[2];
                view[0]=viewArea;
                view[1]=viewVolumen;
    
       ViewMain viewMain= new ViewMain();
       ModelMain modelMain=new ModelMain();
       ControllerMain controllerMain = new ControllerMain(modelMain,viewMain,view);
       controllerMain.init_view();
       
    
    
    
    }
}
