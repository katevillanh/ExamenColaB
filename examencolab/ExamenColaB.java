
package examencolab;

import java.util.Scanner;

public class ExamenColaB {
 public static void main(String[] args) {
      boolean continuar=true;
      int opc;
      int palabra;
      int turno=0;
              
              
      String []clientes={"VIP", "Común"};
      //Random r=new Random();
      Nodo envioNodo=new Nodo();
      //ColaDinamica cola=new ColaDinamica();
      Scanner leer =new Scanner(System.in);
      while(continuar){
          System.out.println("********************");
          System.out.println("Menú colas dinámicas banco");
          System.out.println("1.Insertar/Cliente nuevo");
          System.out.println("2.Pasar a ventanilla");
          System.out.println("3.Mostrar colas");
          System.out.println("4.Eliminar/Terminar una ventanilla");
          System.out.println("5.Salir");
          opc=leer.nextInt();
          System.out.println("********************");
          
          switch(opc){
              case 1:
                  if(turno==0)
                      turno= (int) (Math.random()*10+1);
                  else
                      turno++;
                  int numero= (int) (Math.random()*2+1);
                  if(numero==1){
                      envioNodo.Empujar(clientes[0], turno);
                  }else{
                      envioNodo.Empujar(clientes[1], turno);
                  }
                  break;
              case 2:
                  envioNodo.PasarVentanilla();
                  break;
              case 3:
                  envioNodo.Mostrar();
                  break;
              case 4:
                  envioNodo.Sacar();
                  break;
              case 5:
                  System.exit(0);
                  break;
              default:
                  System.out.println("Opción incorrecta");
                  break;
          }
      }
    }
    
    
}
