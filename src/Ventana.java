/**
 * Created by ever on 5/30/17.
 */
public class Ventana {
    /* (rango de 0 a 1)
    0 = cerrado
    1 = abierto
     */
    float apertura = 0;

    public void abrirVentana(float apertura){
        this.apertura = apertura;
    }

    public float getApertura(){
        return this.apertura;
    }
}
