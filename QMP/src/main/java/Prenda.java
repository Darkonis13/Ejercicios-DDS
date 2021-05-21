public class Prenda{
    TipoPrenda tipo;
    Material material;
    Color colorPrimario;
    Color colorSecundario;
    //El requerimiento de Categoria esta embebido en TipoPrenda, por razones de compatibilidad entre Tipos y Categorias

    //Con el Constructor se cumple el requisito de poder cargar una prenda
    public Prenda(TipoPrenda tipo, Material material, Color colorPrimario, Color colorSecundario) {
        if(tipo == null || material == null || colorPrimario == null) { //Esto obliga a que los atributos obligatorios se llenen y fail fast
            throw new PrendaInvalidaException("No se llenaron todos los campos obligatorios");
        }
        this.tipo = tipo;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }

    public Categoria getCategoria(){
        return tipo.getCategoria();
    }
}