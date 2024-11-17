public class PassageiroClasseEconomica extends Passageiro{
    private  boolean internetContrada;
    public PassageiroClasseEconomica(String nome, String passaporte, boolean internetContrada) {
        super(nome, passaporte);
        this.internetContrada = internetContrada;
    }
    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Internet escolhido: "+this.internetContrada);
    }
}
