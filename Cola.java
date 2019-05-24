public class Cola{
    private int cola[];
    private int frente;
    private int finale;

    public Cola(int capacidad){
        cola=new int [capacidad];
        frente=-1;
        finale=-1;
    }
    public boolean colaVacia(){
        return frente == finale;
    }
    public boolean colaLlena(){
        return finale == cola.length-1;
    }
    public void agregar(int dato){
        if(finale < cola.length-1){
            cola[++finale] = dato;
        }
    }
    public int eliminar(){
        if(colaVacia())
            return 0;
        return cola[++frente];
    }
    public int mostrarFrente(){
        if(colaVacia())
            return 0;
        return cola[frente+1];
    }

}