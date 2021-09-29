package modelo;

import exceptions.PlacaInvalidaException;

public class Carro {
    
    private String LetrasPlaca;
    private int numerosPlaca;
    private int numChassi;

    public Carro() {
    }

    public Carro(String placa) throws PlacaInvalidaException {
        setPlaca(placa);
    }

    public String getPlaca() {
        return LetrasPlaca + numerosPlaca;
    }

    // como o método setPlaca lança uma exceção é preciso incluir 
    // em sua assinatura o throws PlacaInvalidaException
    public void setPlaca(String placa) throws PlacaInvalidaException {

        if(placa.length() != 7){
            // essa linha lança uma exceção com mensagem personalizada
            throw new PlacaInvalidaException("O tamanho da placa deve ser igual a 7");
        }

        if(!placa.matches("[a-z]{3}\\d{4}")){
            // essa linha lança uma exceção com mensagem padrão da classe PlacaInvalidaException
            throw new PlacaInvalidaException();
        }

        this.LetrasPlaca = placa.substring(0,3);
        this.numerosPlaca = Integer.parseInt(placa.substring(3));
    }
    
    public int getNumChassi() {
        return numChassi;
    }
    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }
    
    
}
