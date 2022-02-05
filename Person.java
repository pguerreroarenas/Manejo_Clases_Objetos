import java.util.Date;;

/**
 * Respresenta una persona y algunos de sus caracteristica elementales.
 * 
 * @author Paola Andrea Guerreo
 */
public class Person {
    //Atributos
    
    /**
     * Representa el  nombre  de la persona
     */
    public String name;
    /**
     * Representa el primer apellido de la  persona.
     */
    public String lastName1;
    /**
     * Representa el segundo apellido de la  persona.
     */
    public String lastName2;
    /**
     * Representa la fecha de nacimiento de la persona.
     */
    public Date dateBrith;
    /**
     * Representa la altura de la persona persona.
     */
    public float height;

    //Metodos Publicos

    /**
     * Getter. Método que devuelve el nombre de la persona
     * @return name: nombre de la persona.
     */
    public String getName() {
        return name;
    }
    /**
     * Setter. Método que modifica el nombre de la persona
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}