class Prenda{ //El tipo lo especifica el nombre del objeto al crearlo
    private int precioPropio;
    private Estado estado;
}

interface Estado {
    method calcularPrecio();
}

class Nuevo extends Estado{
    @java.lang.Override
    public method calcularPrecio(precioPropio) {
        return precioFinal;
    }
}

class Promocion extends Estado{
    @java.lang.Override
    public method calcularPrecio(precioPropio) {
        return precioFinal;
    }
}

class Liquidacion extends Estado{
    @java.lang.Override
    public method calcularPrecio(precioPropio) {
        return precioFinal;
    }
}

class Negocio{
    private Ventas //lista de Venta

    public method gananciasDe(unDia); // Suma de ganancias de cada Venta en ese dia
}

class Venta{
    private Item items; //Lista de Items
    private LocalDate dia;

    public method importe();
}

class VentaTarjeta extends Venta{

    private method recargo();

    @java.lang.Override
    public method importe() {
        return importe().recargo();
    }
}

class Item{
    private Prenda prendas;
    private int cantidad;

    public method importe();
}

