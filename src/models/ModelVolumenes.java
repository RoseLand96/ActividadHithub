package models;
import views.ViewVolumenes;

public class ModelVolumenes {
    private ViewVolumenes viewVolumenes;
    
    private double lado=0;
    private double baseC=0;
    private double alturaC=0;
    private double altura=0;

    /**
     * @return the lado
     */
    public double getLado() {
        double l =Double.parseDouble(this.viewVolumenes.jtfLado.getText());
        return l;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     * @return the baseC
     */
    public double getBaseC() {
        double BC=Double.parseDouble(this.viewVolumenes.jtfBaseC.getText());
        return BC;
    }

    /**
     * @param baseC the baseC to set
     */
    public void setBaseC(double baseC) {
        this.baseC = baseC;
    }

    /**
     * @return the alturaC
     */
    public double getAlturaC() {
        double AC=Double.parseDouble(this.viewVolumenes.jtfAlturaC.getText());
        return AC;
    }

    /**
     * @param alturaC the alturaC to set
     */
    public void setAlturaC(double alturaC) {
        this.alturaC = alturaC;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        double alt=Double.parseDouble(this.viewVolumenes.jtfAltura.getText());
        return alt;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
