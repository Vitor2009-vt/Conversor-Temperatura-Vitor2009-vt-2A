//CLASSE FILHA
public class Celsius extends Temperatura {
    //COSTRUTOR
    public Celsius(double valorGraus){
        //SUPER SE REFERE A CLASSE PAI
        super(valorGraus);
    }  
    //CRIANDO OS METODOS PARA VONVERTER
    public double paraFahrenheit(){
        return (getGraus()*9/5)+32;
    }
    //CRINADO METODOS DE CELSIUS PARA KELVIN
    public double paraKelvin(){
        return getGraus()+273;
    }
}
