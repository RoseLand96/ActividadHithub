package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.modelVolumenes;
import views.ViewVolumenes;

public class controllerVolumenes implements ActionListener{
    private modelVolumenes modelVolumenes;
    private ViewVolumenes viewVolumenes;

    public controllerVolumenes(modelVolumenes modelVolumenes, ViewVolumenes viewVolumenes) {
        this.modelVolumenes=modelVolumenes;
        this.viewVolumenes=viewVolumenes;
             
        this.viewVolumenes.jbResultado.addActionListener(this);
        this.viewVolumenes.jrbCubo.addActionListener(this);
        this.viewVolumenes.jrbPrisma.addActionListener(this);
        this.viewVolumenes.jrbPiramide.addActionListener(this);
    }
         
        public void init_view(){
        this.viewVolumenes.setLocation(null);
        this.viewVolumenes.setVisible(true);
        this.viewVolumenes.jrbCubo.isSelected();
        String nl= System.getProperty("line.separator");
        JOptionPane.showMessageDialog(viewVolumenes,"Instrucciones"
                +nl+"1.- Eliga la figura"
                +nl+"2.- Inserte los valores"
                +nl+"3.- Presione resultado");
        }
        
        public double cubo(){
            double l=Double.parseDouble(this.viewVolumenes.jtfLado.getText());
            double rs=0;
            rs=((l*l)*l);
            return rs;
        }
        
        public double prisma(){
            double BC=Double.parseDouble(this.viewVolumenes.jtfBaseC.getText());
            double AC=Double.parseDouble(this.viewVolumenes.jtfAlturaC.getText());
            double Al=Double.parseDouble(this.viewVolumenes.jtfAltura.getText());
            double rs=0;
            rs=(BC*AC)*Al;
            return rs;
        }
    
        public double piramide(){
            double l=Double.parseDouble(this.viewVolumenes.jtfLado.getText());
            double Al=Double.parseDouble(this.viewVolumenes.jtfAltura.getText());
            double rs=0;
            rs=((l*l)*Al)/3;
            return rs;
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.viewVolumenes.jrbCubo.isSelected()){
            this.viewVolumenes.jtfAlturaC.setVisible(false);
            this.viewVolumenes.jlAlturaC.setVisible(false);
            this.viewVolumenes.jtfBaseC.setVisible(false);
            this.viewVolumenes.jlBaseC.setVisible(false);
            this.viewVolumenes.jtfAltura.setVisible(false);
            this.viewVolumenes.jlAltura.setVisible(false);
            this.viewVolumenes.jtfLado.setVisible(true);
            this.viewVolumenes.jlLado.setVisible(true);
        }else if(this.viewVolumenes.jrbPiramide.isSelected()){
            this.viewVolumenes.jtfAlturaC.setVisible(false);
            this.viewVolumenes.jlAlturaC.setVisible(false);
            this.viewVolumenes.jtfBaseC.setVisible(false);
            this.viewVolumenes.jlBaseC.setVisible(false);
            this.viewVolumenes.jtfAltura.setVisible(true);
            this.viewVolumenes.jlAltura.setVisible(true);
            this.viewVolumenes.jtfLado.setVisible(true);
            this.viewVolumenes.jlLado.setVisible(true);
        }else{
            this.viewVolumenes.jtfAlturaC.setVisible(true);
            this.viewVolumenes.jlAlturaC.setVisible(true);
            this.viewVolumenes.jtfBaseC.setVisible(true);
            this.viewVolumenes.jlBaseC.setVisible(true);
            this.viewVolumenes.jtfAltura.setVisible(true);
            this.viewVolumenes.jlAltura.setVisible(true);
            this.viewVolumenes.jtfLado.setVisible(false);
            this.viewVolumenes.jlLado.setVisible(false);
        }
            if(e.getSource()==this.viewVolumenes.jbResultado) {
            if(this.viewVolumenes.jrbCubo.isSelected()){
                this.viewVolumenes.jlResultado.setText(""+cubo());
            }else if(this.viewVolumenes.jrbPiramide.isSelected()){
                this.viewVolumenes.jlResultado.setText(""+piramide());
            }else{
                this.viewVolumenes.jlResultado.setText(""+prisma());
            }
        }
            
    }
}