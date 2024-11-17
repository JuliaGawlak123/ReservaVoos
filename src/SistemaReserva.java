import java.util.ArrayList;

public class SistemaReserva {
    public static void main(String[] args) {

        Passageiro p1 = new PassageiroClasseEconomica("Julia","4545JFSF",false);
        Passageiro p2 = new PassageiroPrimeiraClasse("Julia Gawlak","JHU9009","MALBEC");
        // System.out.println(p1);
        // p1.exibirInfo();
        // p2.exibirInfo();

        Reserva r1 = new Reserva(p1,"New York");
        Reserva r2 = new Reserva(p2,"Milão");
        Reserva r3 = new Reserva(p2,"Bangcoc");

        ArrayList<Reserva> reservas = new ArrayList<Reserva>();
        reservas.add(r1);
        reservas.add(r2);
        reservas.add(r3);

        r1.checkIn("3A");
        r2.checkIn();
        r3.checkIn();

        System.out.println("INFORMAÇÕES DAS RESERVAS: ");
        for (Reserva res : reservas){
            res.exbrInfo();
        }

    }
}
