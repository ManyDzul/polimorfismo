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
public class pruebaSistemaNomina 
{

    private static Object empleadoAsalariado;
    private static Object empleadoPorHoras;
    private static Object empleadoPorcomision;
    private static Object empleadoBaseMasComision;
    public static void main (String[] args)
    {
        EmpleadoAsalariado empledoAsalariado=
          new EmpleadoAsalariado("john", "Smith", "111-11-1111",800.00);
        EmpleadoPorHoras empleadoporhoras=
                new EmpleadoPorHoras("karen","price","222-22-2222", 16.75,40);
        EmpleadoPorComision empleadoporcomision=
                new EmpleadoBaseMasComision (
                "Bob", "lewis", "444-44-4444", 5000, .40, 300);
        
        System.out.println("Empleado procesados por separado:\n");
        
        System.out.println("%s\n%s: s%,.2f\n\n",
                empleadoAsalariado,"ingresos", empleadoAsalariado.ingresos() );
          System.out.println("%s\n%: s%,.2f\n\n",
               empleadoPorHoras,"ingresos", empleadoPorHoras.ingresos() );
        Object empleadoPorComision = null;
          System.out.println("%s\n%: s%,.2f\n\n",
                  empleadoPorComision,"ingresos", empleadoPorcomision.ingresos() );
          System.out.printf("%s\n%: s%,.2f\n\n",
                  empleadoBaseMasComision,
                  "ingresos", empleadoBaseMasComision.ingresos());
          
          Empleado[] empleados = new Empleado[4];
        Object[] empleado = null;
          
          empleado[0]=empleadoAsalariado;
          empleado[1]=empleadoPorHoras;
          empleado[2]=empleadoPorComision;
          empleado[3]=empleadoBaseMasComision;
          
          System.out.println("empleados procesados en forma polimorfica:\n");
        boolean empleadoActual;
          
          for (Empleado empleeadoActual: empleados)
          {
              System.out.println(empleadoActual);
              
              if(empleadoActual instanceof EmpleadoBaseMasComison)
              {
                  EmpleadoBaseMasComision empleado=
                     (EmpleadoBaseMasComision)empleadoActual;
                  
                  empleado.establecerSalarioBase(1.10 * empleado.ObtenerSalario() );
                  
                  System.out.printf(
                      "el nuevo salario base con 10%% de aumento es: 5%,.2f\n",
                          empleado.obtenerSalarioBase() );
              }
              }
          System.out.printf(
               "ingresos $%,.2f\n\n", empleadoActual.ingresos() );
      }
    for (int j=0; j < empleados.length; j++)
        System.out.printf("El empleadob%d es un %s\n", j.
           empleados [j].getclass().getName() );

    
