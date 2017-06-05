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
public class EmpleadoPorComision extends Empleado
{
    private double ventasBrutas;
    private double tarifaComision;
    
public EmpleadoPorComision(String nombre, String apellido, String nss,
        double ventas, double tarifa)
{
    super(nombre, apellido, nss);
    establecerVentasBrutas(ventas);
    establecerTarifaComision(tarifa);
}
public void estableceTarifaComision(double tarifa)
{
    if (tarifa > 0.0 && tarifa < 1.0)
        tarifaComision=tarifa;
    else
        throw new IllegalArgumentException(
        "La tarifa de caomision debe ser > 0.0 y 1.0");
}
public double obtenerTarifaComicion()
{
    return tarifaComision;
}
public void establecerVentasBrutas(double ventas)
{
    if (ventas >=0.0)
        ventasBrutas=ventas;
    else 
        throw new IllegalArgumentException(
        "las ventas brutas denben ser >= 0.0");
}
public double obtenerVentasBrutas()
{
    return ventasBrutas;
}

public double ingresos()
{
    return obtenerTarifaComision() * obtenerVentasBrutas();
}

    @Override
    public String toString()
{
    return String.format("%s: %s\n%s: s%, .2f; %s: %.2f",
            "empleado por comision", super.toString(),
            "ventas brutas", obtenerVentasBrutas(),
            "tarifa de comision", obtenerTarifaComicion());
}

    @Override
    double ingresos()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double obtenerTarifaComision() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void establecerTarifaComision(double tarifa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
