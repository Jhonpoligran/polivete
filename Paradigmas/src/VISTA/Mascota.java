
package VISTA;

//import java.io.Serializable;
import java.io.Serializable;
import java.util.Date;
import javax.swing.*;

public class Mascota implements Serializable{
     //AQUI DECLARAMOS LOS ATRIBUTOS O VARIABLES DE INSTANCIA
 String codigo;
 String sexo;//DIRECCION DEL PROPIETARIO
  String servicio;
 String n_mascota;//NOMBRE DE LA MASCOTA
 double edad;//EDAD DE LA MASCOTA
 String especie;//TIPO DE MASCOTA
 Date consulta;//FECHA DE CONSULTA
 Icon portada;//FOTO DE LA MASCOTA
 String raza;
 String contextura;
 String estatura;
 double peso;
 String pelo;
 String ojos;

public Mascota(String CODIGO,String SERVICIO,Date CONSULTA,String MASCOTA,double EDAD,String SEXO,double PESO,
        String ESPECIE,String RAZA,String ESTATURA,String CONTEXTURA,String OJOS,String PELO,Icon PORTA){


this.n_mascota=MASCOTA;//ACTUALIZA EL NOMBRE DE LA MASCOTA
this.servicio=SERVICIO;
this.sexo=SEXO;//ACTUALIZA EL SEXO DE LA MASCOTA
this.edad=EDAD;//ACTUALIZA LA EDAD DE LA MASCOTA
this.peso=PESO;
this.especie=ESPECIE;
this.raza=RAZA;
this.estatura=ESTATURA;
this.contextura=CONTEXTURA;
this.ojos=OJOS;
this.pelo=PELO;
this.portada=PORTA;//ACTUALIZA LA FOTO DE LA MASCOTA
this.consulta=CONSULTA;
this.codigo=CODIGO;
}
// OJO creamos el contrusctor(ESTE NO VIENE CREADO  POR DEFECTO)    

    public String getServicio() { return servicio;}
    public void setServicio(String servicio) { this.servicio = servicio;}

    public String getCodigo()            {  return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo;}

    public String getN_mascota()               {return n_mascota;}
    public void setN_mascota(String n_mascota) {this.n_mascota = n_mascota;}

    public String getContextura()                 {return contextura;}
    public void setContextura(String contextura) {this.contextura = contextura;}
    
    public Date getConsulta()                {return consulta;}
    public void setConsulta(Date consulta) {this.consulta = consulta;}

    public double getEdad()          {return edad;}
    public void setEdad(double edad) {this.edad = edad;}

    public String getEspecie()             {return especie;}
    public void setEspecie(String especie) {this.especie = especie;}

    public String getEstatura()              {return estatura;}
    public void setEstatura(String estatura) {this.estatura = estatura;}
    
    public String getOjos()          {return ojos;}
    public void setOjos(String ojos) {this.ojos = ojos;}
    
    public String getPelo()          {return pelo;}
    public void setPelo(String pelo) {this.pelo = pelo;}

    public double getPeso()          {return peso;}
    public void setPeso(double peso) {this.peso = peso; }

    public Icon getPortada() {return portada;}
    public void setPortada(Icon portada) {this.portada = portada; }

    public String getRaza()          { return raza;}
    public void setRaza(String raza) {this.raza = raza;}

    public String getSexo()          { return sexo;}
    public void setSexo(String sexo) { this.sexo = sexo;}
    
 
}
    
    
 
