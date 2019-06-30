
package MODELO;

//libreria
import VISTA.Mascota;
import java.io.Serializable;
import java.util.ArrayList;
import VISTA.Mascota;
public class Arreglo_Mascota implements Serializable{
          public ArrayList <Mascota> x;
       
  //creamos el constructor tomando el valor de la clase_alumno
  public Arreglo_Mascota(){
      //crear la coleccion
      x= new ArrayList();
      //se cre ael objeto
      }
 
  //1. Metodo para agregar objetos 
  public void AgrgarObj(Mascota obj)
  { x.add(obj);}
  //2. Metodo para recuperar un objeto
  public Mascota RecuperarObj(int pos){
      return x.get(pos);
  }
  //3. Metodo para eliminar un objeto 
  public void EliminarObj(int pos){
      x.remove(pos);}
      // elimina a todos los registyros
	public void EliminarObj(){
            for (int pos=0; pos<NumObj(); pos++)
		x.remove(0);
  }
  //4. Metodo para actualizar un objeto
  public void ActualizarObj(int pos,Mascota objactual){
      x.set(pos,objactual);
  }
  //5. Metodo para determinar la cantidad de objetos 
  public int NumObj(){
      return x.size();
  }
//6. Metodo para buscar un objeto y retornar la posicion del obj.
public int BuscarObj(String nombre){

for(int i=0;i<NumObj();i++){
    if(nombre.equals(this.RecuperarObj(i).getCodigo())){
        return i;
    }
}
return -1; // que el codigo no existe
}

}
