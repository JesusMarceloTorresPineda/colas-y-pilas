import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
         
        Cola cola1 = new Cola(4);
        Cola cola2 = new Cola(4);
        Cola cola3 = new Cola(4);

        ArrayList<Pila> canastas = new ArrayList<>();      
        Pila canasta;
        int cliente = 0;
        int productos = 0;
        char resp;
        int vari;

        // boolean terminaCompra;

            while(cliente<=4){
                // terminaCompra = false;
                canasta = new Pila(5);
                cliente++;
                canasta.setID(cliente);
                System.out.println("Bienvenido cliente "+cliente);
                do{
                    resp = pregunta("Quiere tomar un articulo?",entrada);
                    if(resp == 's'){
                        productos++;
                        canasta.agregar(productos);
                    }
                }while(resp != 'n');
                int alea = (int) (Math.random()* 3+1);
                canastas.add(canasta);
                //System.out.println(alea);
                switch(alea){
                    case 1:
                        System.out.println("Me fui a la cola 1");
                        cola1.agregar(cliente-1);
                    break;
                    case 2:
                        System.out.println("Me fui a la cola 2");
                        cola2.agregar(cliente);
                    break;
                    case 3:
                        System.out.println("Me fui a la cola 3");
                        cola3.agregar(cliente);
                    break;
                }
                productos = 0;
            }
            int precio = 0;
            System.out.println("En la cola 1");
            if(!cola1.colaVacia()){
                int myClient = cola1.eliminar()-1;
                Pila pago = canastas.get(myClient);
                while(!pago.pilaVacia()){
                    precio = precio + pago.eliminar();
                }
                System.out.println("el cliente" + myClient + "pagara:" + precio);
            }else{
                System.out.println("la cola 1 esta vacia");
            }
            precio=0;
            System.out.println("En la cola 2");
            if(!cola2.colaVacia()){
                int myClient = cola2.eliminar()-1;
                Pila pago1 = canastas.get(myClient);
                while(!pago1.pilaVacia()){
                    precio = precio + pago1.eliminar();
                }
                System.out.println("el cliente" + myClient + "pagara:" + precio);
            }else{
                System.out.println("la cola 2 esta vacia");
            }
            precio = 0;
            System.out.println("En la cola 3");
            if(!cola3.colaVacia()){
                int myClient = cola3.eliminar()-1;
                Pila pago3 = canastas.get(myClient);
                while(!pago3.pilaVacia()){
                    precio = precio + pago3.eliminar();
                }
                System.out.println("el cliente" + myClient + "pagara:" + precio);
            }else{
                System.out.println("la cola 3 esta vacia");
            }
    }

    private static char pregunta(String men, Scanner teclado) {
        char resp;
        System.out.println(men + "  [ s / n ] ");
        resp = teclado.next().toLowerCase().charAt(0);
        while(resp != 's' && resp != 'n'){
            System.out.println("Error! solo puede ser S o N");
            resp = teclado.next().toLowerCase().charAt(0);
        }
        return resp;
    }
    
}