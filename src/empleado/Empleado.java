/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author Manuel
 */
public class Empleado 
{
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    public Empleado(String nombre, String apellido, String nss)
    {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
    }
    public void setprimernombre(String nombre)
    {
        primerNombre = nombre;
    }
    public String getprimernombre()
    {
        return primerNombre;
    }
    public void setApellidoPaterno(String apellido)
    {
        apellidoPaterno = apellido;
    }
    public String getApelidoPaterno()
    {
        return apellidoPaterno;
    }
    public void setNumeroSeguroSocial(String nns)
    {
        numeroSeguroSocial = nns;
    }
    public String getNumeroSeguroSocial()
    {
        return numeroSeguroSocial;
 
    @Override
   public String toString()
    {
       return String.format("%s %s\nnumero de seguro social: %s")
   }
   public abstract double ingresos();
}
        
    }

  
    
}
