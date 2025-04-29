public class Fahrenheit extends Temperatura {
    //CONSTRUTOR
    public Fahrenheit(double valorGraus) {
        //SUPER SE REFERE A CLASSE PAI
        super(valorGraus);
    }
    //METODOS QUE CONVERTE FAHRENHEIT PARA CELSIUS
    public double paraCelsius(){
        return (getGraus() -32)*5/9;
}
    //METODO QUE CONVERTE FAHRENHEIT PARA KELVIN
    public double paraKelvin(){
        return paraCelsius()+273;
    }
    
    
}
