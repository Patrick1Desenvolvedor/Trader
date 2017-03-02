
package juroscompostos;


public class JurosCompostos {

  static int periodos=30;
   static double capital=100;
   static double juros;
   static double taxa=10;
  static  double resultado= 1 +  (taxa/100 );
   
  
    public static void main(String[] args) 
    {
        
   for(int i = 0; i <=30 ; i++)
        {
    juros = capital* Math.pow(resultado,i); 
    System.out.println("\nValor acumulado "+":"+i+"\n"+juros);
    System.out.println("Porcentagem: "+juros/10);
    }
        
    
    }

  
    
}
