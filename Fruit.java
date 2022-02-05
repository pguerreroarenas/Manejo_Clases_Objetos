import java.util.ArrayList;

/**
 * Respresenta una persona y algunos de sus caracteristica elementales.
 * 
 * @author Paola Andrea Guerreo
 */
public class Fruit {
    //Atributos
    
    /**
     * Representa el nombre de la fruta.
     */
    public String name;
    /**
     * Representa el peso promedio de la fruta.
     */
    private float averageWeight;
    /**
     * Representa un array con los posibles colores de la fruta.
     */
    private ArrayList <String> colors;

    //Metodos Publicos

    /**
     * Getter. Método que devuelve  un array con el color de la fruta
     * @return colors: verde, roja, amarilla, etc.
     */
    public ArrayList<String> getColors() {
        return colors;
    }
    /**
     * Setter. Método que modifica el array con el color de la fruta.
     * @param colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Getter. Método que devuelve el peso promedio de la fruta.
     * @return averageWeight
     */
    public float getAverageWeight() {
        return averageWeight;
    }
    /**
     * Setter. Método que modifica el peso promedio de la fruta.
     * @param yearsExperience
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    
  
}
