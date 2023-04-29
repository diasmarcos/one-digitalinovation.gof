package one.digitalinivation.gof;
/* Instancia apressado;
 *
 * @author Marcos Dias
 *
 */
public class SingletonLazy {
    private static SingletonLazy instancia;
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getIntancia() {
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
