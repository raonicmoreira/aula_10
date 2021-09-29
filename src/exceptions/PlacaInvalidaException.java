package exceptions;

// Criada a exceção personalizada.
public class PlacaInvalidaException extends Exception{
    private static final long serialVersionUID = 1L;

    public PlacaInvalidaException(){
        super("A placa deve ser composta por 3 letras e 4 numeros.");
    }

    public PlacaInvalidaException(String mensagem){
        super(mensagem);
    }
    
}
