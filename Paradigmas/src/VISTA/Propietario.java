
package VISTA;

import java.io.Serializable;
import java.util.Date;


public class Propietario implements Serializable{
 String codigo;//CODIGO DE MASCOTA=DNI DEL PROPIETARIO
 String nom;//ACTUALIZA EL NOMBRE DEL PROPIETARIO
 String apePA;
 String apeMA;
 String correo;
 String direccion;
 String tel;//TELEFONO DEL PROPIETARIO
 Date registro;
   
  public Propietario(String CODIGO,Date REGISTRO,String NOM,String APEPA,String APEMA,String TEL,String CORREO,String DIRECCION){

this.codigo=CODIGO;
registro=REGISTRO; 
this.apePA=APEPA;
this.apeMA=APEMA;
this.nom=NOM;
this.tel=TEL;
this.direccion=DIRECCION;
this.correo=CORREO;
}

    public Date getRegistro() {
        return registro;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
    }
    

    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}

    public String getCodigo()            { return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getApeMA()           {return apeMA;}
    public void setApeMA(String apeMA) {this.apeMA = apeMA;}

    public String getApePA()           {return apePA;}
    public void setApePA(String apePA) {this.apePA = apePA;}
  
    public String getDireccion()                {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getNom()         {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public String getTel() {return tel;}
    public void setTel(String tel) {this.tel = tel;}
  
}
