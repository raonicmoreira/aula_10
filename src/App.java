import java.util.Scanner;

import exceptions.PlacaInvalidaException;
import modelo.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        Carro car = new Carro();

        System.out.println("informe o numero da placa do carro: ");
        try{
            
            // esse bloco é responsavel por capturar as exceções
            car.setPlaca(ler.next());

        }catch (PlacaInvalidaException e){
           
            // este bloco será executado somente se ocorrer uma exceção
            System.out.println("---------------ERRO--------------");
            System.out.println(e.getMessage());
            System.out.println("---------------------------------");

        }finally{
           
            // este bloco sempre será executado
            ler.close();

        }
    }
}
