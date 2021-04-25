public class Color{
    int rojo;
    int verde;
    int azul;

    public Color(int rojo, int verde, int azul) {
        if(rojo === null || verde === null || azul === null){
            throw new ColorException("Se deben cargar los tres valores de colores (rojo, verde y azul), aunque sea en cero");
        }
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }
}