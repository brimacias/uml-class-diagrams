package ClientesFacturas;

import java.util.Arrays;
import java.util.Date;

 public class Cliente {
    private String dni;
    private int idCliente;
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private String[] facturas;

     @Override
     public String toString() {
         return "Cliente{" +
                 "dni='" + dni + '\'' +
                 ", idCliente=" + idCliente +
                 ", nombre='" + nombre + '\'' +
                 ", apellidos='"+ apellidos + '\'' +
                 ", fechaNacimiento=" + fechaNacimiento +
                 ", facturas=" + Arrays.toString(facturas) +
                 '}';
     }

 }
