package ClientesFacturas;

import java.util.Date;


public class Factura {
    //idCliente
    private int idFactura;
    private Date fechaFactura;

    @Override
    public String toString() {
        return "Identificador de la factura: " + idFactura +
                "\nFecha: " + fechaFactura;
    }
}
