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

        Pila canasta = new Pila(5);
        int cliente = 0;
        int productos = 0;
        char resp;
        int vari;

        // boolean terminaCompra;

            while(cliente<=4){
                // terminaCompra = false;
                canasta = new Pila(5);
                cliente++;
                System.out.println("Bienvenido cliente "+cliente);
                do{
                    resp = pregunta("Quiere tomar un articulo?",entrada);
                    if(resp == 's'){
                        productos++;
                        canasta.agregar(productos);
                    }
                }while(resp != 'n');
                int alea = (int) (Math.random()* 3+1);

                switch(alea){
                    case 1:

                    break;
                    case 2:

                    break;
                    case 3:

                    break;
                }
                productos = 0;
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