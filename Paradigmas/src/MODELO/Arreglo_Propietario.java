
package MODELO;

//libreria
import VISTA.Propietario;
import java.io.Serializable;
import java.util.ArrayList;
import VISTA.Propietario;

public class Arreglo_Propietario implements Serializable{
 public ArrayList <Propietario> p;

 
  //creamos el constructor tomando el valor delPropietario
  public Arreglo_Propietario(){
      //crear la coleccion
      p= new ArrayList();}
  //1. Metodo para agregar objetos 
  public void AgrgarObj(Propietario obj)
  {p.add(obj);}
  //2. Metodo para recuperar un objeto 
  public Propietario RecuperarObj(int pos)
  {  return p.get(pos);}
  //3. Metodo para eliminar un objeto de la Coleccion
  public void EliminarObj(int pos)
  {p.remove(pos);}
      // elimina a todos los Propietarios
public void EliminarObj()
{for (int pos=0; pos<NumObj(); pos++)
p.remove(0);
}
  //4. Metodo para actualizar un objeto
    public void ActualizarObj(int pos,Propietario objactual){
      p.set(pos,objactual);
  }
  //5. Metodo para determinar la cantidad de objetos 
  public int NumObj(){return p.size();}
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
