public class Moto {

     private String marca ;
     private String modelo;
     private String color;
     private int altura;
     private int cilindraje;
     private int año;
     

     public Moto(String marca, String modelo, String color, int altura, int cilindraje, int año) {
          this.marca = marca;
          this.modelo = modelo;
          this.color = color;
          this.altura = altura;
          this.cilindraje = cilindraje;
          this.año = año;
      }
      //getters
      public int getAltura() {
          return altura;
      }

      public int getAño() {
          return año;
      }

      public int getCilindraje() {
          return cilindraje;
      }

      public String getColor() {
          return color;
      }
      
      public String getMarca() {
          return marca;
      }

      public String getModelo() {
          return modelo;
      }
      // Setters con validaciones
    public void setMarca(String marca) {
     if (marca == null || marca.isEmpty()) {
         this.marca = "Italika"; 
     } else {
         this.marca = marca;
     }
 }

 public void setModelo(String modelo) {
     if (modelo == null || modelo.isEmpty()) {
         this.modelo = "ft";  
     } else {
         this.modelo = modelo;
     }
 }

 public void setColor(String color) {
     if (color == null || color.isEmpty()) {
         this.color = "Oxido";  
     } else {
         this.color = color;
     }
 }

 public void setAltura(int altura) {
     if (altura <= 0) {
         this.altura = 100;  
     } else {
         this.altura = altura;
     }
 }

 public void setCilindraje(int cilindraje) {
     if (cilindraje <= 0) {
         this.cilindraje = 125;  
     } else {
         this.cilindraje = cilindraje;
     }
 }

 public void setAño(int año) {
     if (año < 1900 || año > 2025) {
         this.año = 2020;  
     } else {
         this.año = año;
     }
 }
}
