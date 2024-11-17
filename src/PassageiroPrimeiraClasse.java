public class PassageiroPrimeiraClasse extends Passageiro {
    private String vinhoEscpolhido;

    public PassageiroPrimeiraClasse(String nome, String passaporte, String vinhoEscpolhido) {
        super(nome, passaporte);
        //armazena o atribyto de classe especifico
        this.vinhoEscpolhido = vinhoEscpolhido;
    }
    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Vinho escolhido: "+this.vinhoEscpolhido);
    }
}
