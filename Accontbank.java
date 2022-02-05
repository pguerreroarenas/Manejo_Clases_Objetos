/**
 * Respresenta una persona y algunos de sus caracteristica elementales.
 * 
 * @author Paola Andrea Guerreo
 */
public class Accontbank {
    //Atributos
    
    /**
     * Representa el numero de la cuenta.
     */
    private int accountNumber;
    /**
     * Representa una variable booleana para saber si la cuenta esta activa.
     */
    protected boolean activated;
    /**
     * Representa nombre de la propietaria de la cuenta.
     */
    public String nameowner;

    //Metodos Publicos

    public Accontbank() {
    }
    /**
     * Getter. Método que devuelve el valor booleano de la activación de la cuenta.
     * @return activated: Falce, True.
     */
    public boolean isActivated() {
        return activated;
    }
    /**
     * Setter. Método que modifica el valor booleano de la activación de la cuenta.
     * @param activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Getter. Método que devuelve el numero de la cuenta.
     * @return accountNumber: Numero.
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * Setter. Método que modifica el numero de la cuenta
     * @param ccountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }   
    
}
