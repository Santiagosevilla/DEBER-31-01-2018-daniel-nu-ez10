package ec.edu.ister.modelo;
public class Nodo {
     private Nodo anterior;
     private Nodo siguiente;
     private Character info;
   public Nodo(Nodo anterior, Nodo siguiente, char info) {
    this.anterior = anterior;
    this.siguiente = siguiente;
    this.info = info;
 }
   public Nodo(char info) {
    anterior=siguiente=null;
    this.info = info;
 }
   public Nodo getAnterior() {
    return anterior;
 }
   public void setAnterior(Nodo anterior) {
    this.anterior = anterior;
 }
   public Nodo getSiguiente() {
    return siguiente;
 }
   public void setSiguiente(Nodo siguiente) {
    this.siguiente = siguiente;
 }
   public char getInfo() {
    return info;
 }
   public void setInfo(char info) {
    this.info = info;
 }
 
}
    
