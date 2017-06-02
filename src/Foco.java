/**
 * Created by ever on 5/30/17.
 */
public class Foco {
    boolean encendido = false;

    public void encendido(){
        this.encendido = true;
    }

    public void apagado(){
        this.encendido = false;
    }

    public boolean estado(){
        return this.encendido;
    }
}
