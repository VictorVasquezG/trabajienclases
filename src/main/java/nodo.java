
public class nodo {
 
    
    
    int Dato;
    
    nodo enlace;

    public nodo(int x, nodo n){
    
    Dato = x;
    enlace= n;
    
    }

    nodo(int entrada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int getDato(){
    return Dato;
    
    }
    public nodo getenlace(){
    return enlace;
    }

    public void setenlace(nodo n){
    enlace = n;
    }

}


