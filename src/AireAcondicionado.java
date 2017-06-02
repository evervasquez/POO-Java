/**
 * Created by ever on 5/30/17.
 */
public class AireAcondicionado {
    float temperatura = 0;
    boolean aireApagado = true;

    public void encenderAire(){
        this.aireApagado = false;
    }

    public void apagarAire(){
        this.aireApagado = true;
    }

    public void setTemperatura(float temperatura){
        this.temperatura = temperatura;
    }

    public boolean estadoAire(){
        return  this.aireApagado;
    }

    public float getTemperatura(){
        return this.temperatura;
    }
}
