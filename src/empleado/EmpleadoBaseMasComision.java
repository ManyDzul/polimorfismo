/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author Jesus
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision 
{
    private double salarioBase;
    
public EmpleadoBaseMasComision(String nombre, String apellido,
        String nss, double ventas, double tarifa, double salario)
{
    super (nombre, apellido, nss, ventas, tarifa);
    establecerSalarioBase(salario);
}
public void setSalarioBase(double salario)
{
    if (salario >= 0.0)
        salarioBase = salario;
    else
        throw new IllegalArgumentException(
        "El salario base debe ser >=0.0");
}
public double getSalarioBase()
{
    return salarioBase;
}

public double ingreso()
{
    return obtenerSalarioBase() + super.ingresos();
}
    @Override
    public String toString()
{
        
    return String toString ()("%s%s;%s;$%,.2f"
       "con salario base". super.toString().
       "salario base". obtenerSalarioBase() );
}

    void establecerSalarioBase(double salario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double obtenerSalarioBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double ObtenerSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
