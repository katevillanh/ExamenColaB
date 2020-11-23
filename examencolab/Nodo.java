
package examencolab;

public class Nodo {
     int dato;
    Nodo siguiente;
    Nodo siguiente2;
    Nodo ventanilla;
    String match="VIP";
   /* void Empujar(String cliente, int turno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    public Nodo raiz,cima;
    public Nodo raiz2,cima2;
    //int tamaño;
    Nodo(){
        raiz=null;
        cima=null;
    }
    
    public boolean Contiene(){
        if (raiz==null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean Contiene2(){
        if (raiz2==null){
            return true;
        }else{
            return false;
        }
    }

    public Nodo Empujar(String clientes, int turno){
        if(clientes=="VIP"){
        Nodo nuevo;
        nuevo=new Nodo ();
        nuevo.dato=turno;
        nuevo.siguiente=null;
        if (Contiene()) {
            raiz=nuevo;
            cima=nuevo;
        }else{
            cima.siguiente = nuevo;
            cima=nuevo;
        }return raiz;
        }
        if(clientes=="Común"){
        Nodo nuevo2;
        nuevo2=new Nodo ();
        nuevo2.dato=turno;
        nuevo2.siguiente2=null;
        if (Contiene2()) {
            raiz2=nuevo2;
            cima2=nuevo2;
        }else{
            cima2.siguiente2= nuevo2;
            cima2=nuevo2;
        }
        }return raiz2;
    }
    
    public Nodo[] PasarVentanilla(){
        if (Contiene() && Contiene2()){
            System.out.println("No hay clientes en las colas");
        }
       Nodo []ventanilla={null, null, null};
        if (!Contiene()){
            
         if (ventanilla[0]==null){
             ventanilla[0]=raiz;
            System.out.println("ventanilla 1: "+ventanilla[0]);
         }if (ventanilla[1]==null){
             ventanilla[1]=raiz;
            System.out.println("ventanilla 2: "+ventanilla[1]);
         }if (ventanilla[2]==null){
             ventanilla[2]=raiz;
            System.out.println("ventanilla 3: "+ventanilla[2]);
        }
        int elementos=raiz.dato;
            if (raiz==cima){
                raiz=null;
                cima=null;
            }else{
                raiz=raiz.siguiente;
            }
        }if (!Contiene2()){
            if (ventanilla[0]==null){
                ventanilla[0]=raiz2;
            System.out.println("ventanilla 1: "+ventanilla[0]);
         }if (ventanilla[1]==null){
             ventanilla[1]=raiz2;
            System.out.println("ventanilla 2: "+ventanilla[1]);
         }if (ventanilla[2]==null){
             ventanilla[2]=raiz2;
            System.out.println("ventanilla 3: "+ventanilla[2]);
              }
           int elementos=raiz2.dato;
            if (raiz2==cima2){
                raiz2=null;
                cima2=null;
            }else{
                raiz2=raiz2.siguiente2;
             }}
       return ventanilla;  
    }

    public void Sacar(){
        //if(!ventanilla){
            //System.out.println("Las ventanillas están vacías");
        //} else {
         //}
         int numero= (int) (Math.random()*3+1);
         //System.out.println(numero);
         Nodo []ventanillass={null, null, null};
    if(numero==1){
        ventanilla=ventanillass[0];
    }
    if(numero==2){
        ventanilla=ventanillass[1];
    }
    if(numero==3){
        ventanilla=ventanillass[2];
    }
    }

    public void Mostrar(){
        //if (Contiene() && Contiene2()){
           // System.out.println("No hay clientes");
        //}else{
        if (raiz==null){
            System.out.println("No hay Clientes VIP");
        }else{
        Nodo recorre=raiz;
        System.out.print("Cola VIP: ");
        while (recorre!=null) {
            
            System.out.print("Vip"+recorre.dato+" ");
            recorre=recorre.siguiente;
        }System.out.println(" ");
      }
        
        if (raiz2==null){
            System.out.println("No hay clientes comúnes");
        }else{
        Nodo recorre2=raiz2;
        System.out.print("Cola común: ");
        while (recorre2!=null) {
            
            System.out.print("Común"+recorre2.dato+" ");
            recorre2=recorre2.siguiente2;
        }System.out.println(" ");
      }
    //}
    }
        
}
