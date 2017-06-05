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
public class EmpleadoAsalariado extends Empleado 
{
    private double salarioSemanal;
    
    public EmpleadoAsalariado(String nombre, String apellido, String nss, 
    double salario)
{
         super(nombre, apellido, nss);
        setSalarioSemanal(salario);
}
    public void setSalarioSemanal(double salario)
{ 
    if (salario >=0.0)
        salarioSemanal = salario;
    else
        throw new IllegalArgumentException(
        "El salario semanal debe se >= 0.0");
}
    public double getSalarioSemanal()
{
    return salarioSemanal;
}
    
    @Override
    public double ingresos()
{   
    return getSalarioSemanal();
}
    
public String toString()
{
    return String.format("empleado asalariado: %s\n%s:s%,2f",
            super.toString(), "salario samanal", obtenersalarioSemanal());
   }
}
