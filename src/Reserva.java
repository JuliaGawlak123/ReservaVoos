import java.util.Random;

public class Reserva {

    private String codidoReserva;
    private  Passageiro passageiro;
    private String cidadeDestino;

    public Reserva(Passageiro passageiro,String cidadeDestino) {
        this.codidoReserva = this.generateRandomCode(8);
        this.passageiro = passageiro;
        this.cidadeDestino = cidadeDestino;

    }

    public void checkIn(){
        System.out.println("Check - in para a reserva "+this.codidoReserva + " Feito com sucesso!");
    }

    public void checkIn(String assento){
        System.out.println("Check - in para a reserva "+this.codidoReserva + " No assento: "+assento+" Feito com sucesso!");
    }

    public void exbrInfo(){
        this.passageiro.exibirInfo();
        System.out.println("Reserva: "+this.codidoReserva);
        System.out.println("Destino: "+this.cidadeDestino);

    }

    public String generateRandomCode(int length){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWYZ0123456789";
        StringBuilder code = new StringBuilder();
        Random random = new Random();

        for(int i =0; i<length;i++){
            int index = random.nextInt(characters.length());
            code.append(characters.charAt(index));
        }
        return code.toString();
    }
}
