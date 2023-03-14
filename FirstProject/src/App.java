import br.edu.up.util.Calculadora;
import br.edu.up.util.Console;
import br.edu.up.util.Jogador;

public class App{
    public static void main(String[] args){

        Console.imprimir("Hello World");


       

        Jogador j1 = new Jogador();
        j1.nome = "Paulo";
        j1.vivo = true;
        j1.folego = 5;


        Jogador j2 = new Jogador();
        j2.nome = "João";
        j2.vivo = true;
        j2.folego = 8;








        Calculadora qualquerCoisa = new Calculadora();
         System.out.println(qualquerCoisa.somar(10, 10));
         
    }
}