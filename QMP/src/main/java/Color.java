public class Color{
    int rojo;
    int verde;
    int azul;

    public Color(int rojo, int verde, int azul) {
        if(dentroDelRango(rojo)){
            throw new ColorException("El color rojo debe estar dentro del rango admitido (de 0 a 256)");
        }
        if(dentroDelRango(verde)){
            throw new ColorException("El color verde debe estar dentro del rango admitido (de 0 a 256)");
        }
        if(dentroDelRango(azul)){
            throw new ColorException("El color azul debe estar dentro del rango admitido (de 0 a 256)");
        }
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }

    private boolean dentroDelRango(int color){
        return color >= 0 && color <=256;
    }
}