/**
 * Created by ever on 5/30/17.
 */
public class Puerta {
    boolean puertaCerrada = true;

    public void cerrarPuerta(){
        this.puertaCerrada = true;
    }

    public void abrirPuerta(){
        this.puertaCerrada = false;
    }

    public boolean estadoPuerta(){
        return this.puertaCerrada;
    }
}
