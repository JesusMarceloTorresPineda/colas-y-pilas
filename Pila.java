public class Pila {
    private int tope;
    private int pila[];
    private int id;

    public void setID(int id){
        this.id=id;
    }

    public int getID(){
        return id;
    }

    
    public Pila (int capacidad){
        pila=new int [capacidad];
        tope=-1;
    } 
    public boolean pilaVacia(){
        return tope == -1;
    }
    public void agregar(int dato){
        if(tope+1 < pila.length){
            pila[++tope] = dato;
        }
    }
    public boolean pilaLlena(){
        return tope+1 == pila.length;
    }
    public int eliminar(){
        if(pilaVacia())
            return 0;
        return pila[tope--];
    }
    public int mostrarUltimo(){
        if(pilaVacia())
            return 0;
        return pila[tope];
    }
}