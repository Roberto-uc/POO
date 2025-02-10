public class Lapicero {
    private String color;
    private String colortinta;
    private String tipotinta;
    private String marca;
    private boolean tienetapa;

    // Constructor
    public Lapicero(String color, String colortinta, String tipotinta, String marca, boolean tienetapa) {
        this.setMarca(marca);
        this.setColor(color);
        this.setColortinta(colortinta);
        this.setTipotinta(tipotinta);
        this.setTienetapa(tienetapa);
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getColortinta() {
        return colortinta;
    }

    public String getTipotinta() {
        return tipotinta;
    }

    public boolean getTienetapa() {
        return tienetapa;
    }

    // Setters con validaciones
    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            this.marca = "Generico"; 
        } else {
            this.marca = marca;
        }
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "Negro"; 
        } else {
            this.color = color;
        }
    }

    public void setColortinta(String colortinta) {
        if (colortinta == null || colortinta.isEmpty()) {
            this.colortinta = "Negro"; 
        } else {
            this.colortinta = colortinta;
        }
    }

    public void setTipotinta(String tipotinta) {
        if (tipotinta == null || tipotinta.isEmpty()) {
            this.tipotinta = "Aceite"; 
        } else {
            this.tipotinta = tipotinta;
        }
    }

    public void setTienetapa(boolean tienetapa) {
            this.tienetapa = tienetapa;
    }

}
