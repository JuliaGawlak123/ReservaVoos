public class Passageiro {

    protected String nome;
    protected String passaporte;



    public Passageiro(String nome, String passaporte) {
        this.nome = nome;
        this.passaporte = passaporte;
    }

    public void exibirInfo(){
        System.out.println("==============================================");
        System.out.println("Nome: "+this.nome);
        System.out.println("Passaporte: "+this.passaporte);

    }
}
