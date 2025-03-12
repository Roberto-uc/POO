public class Sumadora{

    public String suma(int i, int j){
         return "LA SUMA ES: "+ (i+j);
    }

    public String suma(char i, char j){
        return "LA SUMA ES :"+ (i+j)+"\n";
    }

    public String suma(double i, double j){
        return "la suma es: "+(i+j) +"\n";
    }
    
    public String suma(double i, int j){
        return "LA SUMA ES :"+(i+j) +"\n";
    }
   

    public static void main(String[] args) {
        
        Sumadora s = new Sumadora();

        System.out.println(s.suma(1, 5));
        System.out.println( s.suma(5.5, 4.5));



    }
    


}