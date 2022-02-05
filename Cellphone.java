/**
 * Respresenta una persona y algunos de sus caracteristica elementales.
 * 
 * @author Paola Andrea Guerreo
 */
public class Cellphone {
    //Atributos
    
    /**
     * Representa el peso promedio del celular
     */
    public float averageweight;
    /**
     * Representa el color del celular
     */
    public String color;
    /**
     * Representa tipo de pantalla del celular
     */
    public String screen;
    /**
     * Representa la generacion de tecnologia a la que trabaja el celular
     */
    private String technology;
    /**
     * Representa numero de imei del celular
     */
    protected int imei;

    //Metodos Publicos

    /**
     * Getter. Método que devuelve el imei del celular
     * @return imei: Huella de identidad del dispositivo
     */
    public int getImei() {
        return imei;
    }
    /**
     * Setter. Método que modifica el imei del celular
     * @param imei
     */
    public void setImei(int imei) {
        this.imei = imei;
    }
    
    /**
     * Getter. Método que devuelve la generacion de tecnologia a la que trabaja el celular
     * @return technology: 4G, 5G, etc.
     */
    public String getTechnology() {
        return technology;
    }
    /**
     * Setter. Método que modifica  la generacion de tecnologia a la que trabaja el celular
     * @param technology
     */
    public void setTechnology(String technology) {
        this.technology = technology;
    }  
    
}
