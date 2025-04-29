
public class ConversorTemperaturaVitor2009Vt2A {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        
        while(continuar){
            System.out.println("===Conversor de Temperatura ==");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("4. Sair");
            System.out.println("Escolha a unidade de origem (1-4: ");
            int escolha = scanner.nexInt();
            
            if(escolha == 4) {
                continuar=false;
                continue;
            }
            if(escolha<1 || escolha>4) {
                System.out.println("Opcao invalida!");
                continue;
                
            }
            
            System.out.println("Digite o valor da Temperatura");
            double graus = scanner.nextDouble();
            
            switch(escolha){
                case 1:
                    Celsius celsius = new Celsius(valorGraus: graus);
                    System.out.println("*********************");
                    System.out.println("Resultado: ");
                    System.out.println("Fahrenheit: " + celsius.paraKelvin());
                    System.out.println("Kelvin " + celsius.paraKelvin());
                    System.out.println("***************************");
                    
                    break;
                    Farhenheit f = new Farenheit(valorGraus: graus);
                    System.out.println("*********************");
                    System.out.println("Resultado: ");
                    System.out.println("Fahrenheit: " + Fahrenheit.paraKelvin());
                    System.out.println("Kelvin " + celsius.paraKelvin());
                    System.out.println("***************************");
                    
                    break;
                    
                case 3;
                    Celsius celsius = new Celsius(valorGraus: graus);
                    System.out.println("*********************");
                    System.out.println("Resultado: ");
                    System.out.println("Fahrenheit: " + celsius.paraKelvin());
                    System.out.println("Kelvin " + celsius.paraKelvin());
                    System.out.println("***************************");
            }
    }     
       
}
