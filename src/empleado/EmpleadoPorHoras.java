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
public class EmpleadoPorHoras extends Empleado
{
    private double sueldo;
    private double horas;

public EmpleadoPorHoras(String nombre, String apellido, String nss,
        double sueldoPorHoras, double horasTrabajadas)
{
    super(nombre, apellido, nss);
    setSueldo (sueldoPorHoras);
    setHoras(horasTrabajadas);
}
public void setSueldo(double sueldoPorHoras)
{
    if (sueldoPorHoras >=0.0)
        sueldo = sueldoPorHoras;
    else
        throw new IllegalArgumentException(
        "El sueldo po horas debe ser >= 0.0");
}
public double getSueldo()
{
    return sueldo;
}
public void setHoras(double horasTrabajadas)
{
    if ((horasTrabajadas >= 0.0) && (horasTrabajadas <= 168.0))
       horas = horasTrabajadas;
    else
        throw new IllegalArgumentException(
        "Las horas trabajadas deben ser >=0.0 y <=168.0");
}
public double getHoras()
{
    return horas;
}

    @Override
    public String toString()
{
    return String.format("empleado por horas:%s\n%s: s%,.2f; %,.2f",
            super.toString(), "sueldo por hora", obtenerSueldo(),
            "horas trabajaas", obtenerHoras() );
}
}
