/**
 * Respresenta una persona y algunos de sus caracteristica elementales.
 * 
 * @author Paola Andrea Guerreo
 */
public class Musicalinstrument {
    //Atributos
    
    /**
     * Representa el  nombre  del instrumento musical
     */
    public String name;
     /**
     * Representa la clasificación del instrumento musical (Viento, percusión, cuerda, eléctrico).
     */
    protected String classification;
     /**
     * Representa el  material del instrumento musical
     */
    public String material;
    /**
     * Representa el tono del instrumento musical
     */
    private String tone;

    //Metodos Publicos

    /**
     * Getter. Método que devuelve la clasificación del instrumento musical
     * @return classification: viento, cuerda, percusión o eléctrico.
     */
    public String getClassification() {
        return classification;
    }
    /**
     * Setter. Método que modifica la clasificación del instrumento musical
     * @param classification
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * Getter. Método que devuelve el tono del instrumento musical
     * @return tone
     */
    public String getTone() {
        return tone;
    }
    /**
     * Setter. Método que modifica el tono del instrumento musical
     * @param tone
     */
    public void setTone(String tone) {
        this.tone = tone;
    }  
}
