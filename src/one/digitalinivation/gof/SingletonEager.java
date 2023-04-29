package one.digitalinivation.gof;
/* Instancia apressado;
*
* @author Marcos Dias
*
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();
    private SingletonEager(){
        super();
    }

    public static SingletonEager getIntancia() {
        return instancia;
    }

}
