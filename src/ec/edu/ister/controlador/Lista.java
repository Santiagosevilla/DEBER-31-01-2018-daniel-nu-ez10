package ec.edu.ister.controlador;
import ec.edu.ister.modelo.Nodo;
import javax.swing.JOptionPane;
public class Lista {
  public Nodo inicio;
 public Nodo fin;
 public Lista(){
  inicio=fin=null;
 }
 
 public void iniciar(String texto){
  inicio=fin=null;
  Nodo nuevo;
  int i;
  for(i=0;i<texto.length();i++){
   agregarOrdenado(texto.charAt(i));
  }
  
 }
 
 public void agregarNodo(char a){
  Nodo nuevo=new Nodo(fin,null,a);
  if(fin!=null){
   fin.setSiguiente(nuevo);
   fin=nuevo;
  }else{
   inicio=fin=nuevo;
  }
 }
 
 public void imprimir(){
  Nodo aux=inicio;
  int cont=1;
  while(aux!=null){
   JOptionPane.showMessageDialog(null,cont+""+aux.getInfo());
   cont++;
   aux=aux.getSiguiente();
  }
 }
 
 public void agregarOrdenado(Character valor){
  Nodo nuevo=new Nodo(valor);
  if(inicio==null){
   agregarNodo(valor);
  }else{
   if(valor.compareTo(inicio.getInfo())<=0){
    nuevo.setSiguiente(inicio);
    inicio.setAnterior(nuevo);
    inicio=nuevo;
   }else{
    if(valor.compareTo(fin.getInfo())>=0){
     agregarNodo(valor);
    }else{
     Nodo aux=inicio;
     while(aux.getSiguiente()!=null){
       if(valor.compareTo(aux.getSiguiente().getInfo())<0){
        break;
       }
      aux=aux.getSiguiente();
     }if(aux.getSiguiente()!=null){
      if(valor.compareTo(aux.getSiguiente().getInfo())<0){
       nuevo.setAnterior(aux);
       nuevo.setSiguiente(aux.getSiguiente());
       aux.getSiguiente().setAnterior(nuevo);
       aux.setSiguiente(nuevo);
      }
     }
    }
   }
  }
 }
 public  void menu(){
    
    int op;
    
    do {   
        
       op=Integer.parseInt( JOptionPane.showInputDialog("Ingrese el Item \n\n"
               + "  . . . . . . . . . .  MENU PRINCIPAL . . . . . . . . . . \n\n"
               + "1.ingresar Lista en base a una cadena de caracteres\n"
               + "2.despliegue Lista\n"
               + "3.- SALIR....\n\n"));
        
       switch(op){
            case 1:
              iniciar(JOptionPane.showInputDialog("Ingrese la palabra para generar la lista"));
               break; 
           case 2:
            imprimir();
               break;
          
       }       
    }while (op!=3); 
}
}