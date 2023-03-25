
import java.util.Scanner;


public class Lista {
    
    public nodo primero;
    public Lista(){
    primero = null;
    }
private int leerEntero(){
System.out.println("Ingrese valor, -1 para terminar");
return Integer.parseInt(new Scanner(System.in).nextLine());

}
public Lista crearLista(){
int x=0;
primero = null;
do {
x = leerEntero();
if (x != -1){
primero = new nodo(x, primero);
}

} while (x != -1);
return this;
} 
public Lista insertarCabezaLista(int entrada){
nodo nuevo;
nuevo = new nodo(entrada);
nuevo.enlace = primero;
primero = nuevo;
return this;
}
public void visualizar(){
nodo n;
int k =0;
n = primero;
while (n!= null){
    System.out.print(n.Dato+" ");
    n = n.enlace;
    k++;
    System.out.print((k%15 !=0 ? " " : "\n"));
}
}
public nodo buscarPocision(int pocision){
 nodo indice;
 int i;
 if (pocision <0){
    return null;
 }
 indice = primero;
 for (i=1;(i< pocision)&&(indice != null); i++){
     indice = indice.enlace;
 }

return indice;
}
public Lista insertaUltimo(nodo ultimo, int entrada){
    ultimo.enlace = new nodo(entrada);
    ultimo = ultimo.enlace;
    return this;
}
public nodo buscarLista(int destino){
nodo indice;
for(indice = primero; indice !=null; indice = indice.enlace){
    if(destino == indice.Dato){
}
}
return null;
}
public Lista insertarLista(int testigo, int entrada){
nodo nuevo, anterior;
anterior = buscarLista(testigo);
if (anterior != null){
    nuevo = new nodo(entrada);
    nuevo.enlace = anterior.enlace;
    anterior.enlace = nuevo;
}
return this;
}
}
