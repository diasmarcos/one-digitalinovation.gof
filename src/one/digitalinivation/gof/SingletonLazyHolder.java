package one.digitalinivation.gof;
/* Instancia Lazy Holder;
 *
 * @author Marcos Dias
 *
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }
    public SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getIntancia() {

        return InstanceHolder.instancia;
    }
}
