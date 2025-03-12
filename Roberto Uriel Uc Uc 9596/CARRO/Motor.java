public class Motor {
    private String marca, tipo;
    private int hp;

    public Motor(String marca, String tipo, int hp) {
        setMarca(marca); 
        setTipo(tipo);
        setHp(hp);
    }

    public Motor(int hp){
        this.tipo="-GASOLINA-";
        this.marca="HYUNDAY";
        this.hp = hp;
    } 
   
    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setMarca(String marca) {
        this.marca = (marca == null || marca.isEmpty()) ? "NISSAN" : marca;
    }

    public void setHp(int hp) {
        this.hp = (hp < 0 || hp > 1000) ? 100 : hp;  
    }

    public void setTipo(String tipo) {
        tipo = tipo.toLowerCase();
        if (tipo == null || tipo.isEmpty() || 
            !(tipo.equals("gasolina") || tipo.equals("diesel") || tipo.equals("hibrido"))) {
            this.tipo = "gasolina"; 
        } else {
            this.tipo = tipo;
        }
    }

    public String toString() {
        return "---MOTOR--- \n" +
                "Marca: " + getMarca() + "\n" +
                "Tipo: " + getTipo() + "\n" +
                "Hp: " + getHp() + "\n";
    }
}
