package ClientesFacturas;


import java.math.BigDecimal;

public class Factura {
    //idCliente
    private int idFactura;
    private BigDecimal importe;

    @Override
    public String toString() {
        return "Identificador de la factura: " + idFactura +
                "\nImporte: " + importe;
    }
}
