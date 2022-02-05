/**
 * Respresenta una persona y algunos de sus caracteristica elementales.
 * 
 * @author Paola Andrea Guerreo
 */
public class Engineer {
    //Atributos
    
    /**
     * Representa el nombre del ingeniero
     */
    public String name;
    /**
     * Representa la profesión del ingeniero
     */
    public String profession;
    /**
     * Representa los años de experiencia del ingeniero.
     */
    protected int yearsExperience;
    /**
     * Representa el campo de trabajo en el que se desempeña el ingeniero.
     */
    public String Workfield;

    //Metodos Publicos

    /**
     * Getter. Método que devuelve  los años de experiencia del ingeniero.
     * @return yearsExperience: Años de experiencia.
     */
    public int getYearsExperience() {
        return yearsExperience;
    }
    /**
     * Setter. Método que modifica los años de experiencia del ingeniero.
     * @param yearsExperience
     */
    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
}
