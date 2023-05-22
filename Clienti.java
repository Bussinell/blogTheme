import java.lang.*;
import java.util.*;

class TroppiClienti extends Exception {
}
class ClienteSconosciuto extends Exception {
}
public class Clienti implements Costanti{
    public static void main(String[] args) throws ClienteSconosciuto, TroppiClienti {
        ArrayList<Cliente>servizioDiSpedizione = new ArrayList(MAX);
        ArrayList<Cliente>servizioDiRicezione = new ArrayList(MAX);
        ArrayList<Cliente>servizioFinanziario = new ArrayList(MAX);
        // servizio di spedizione : S
        //servizio di ricezione : R
        //servizio finanziario : F
        Cliente c1 = new Cliente("Francesco", "S", 1);
        Cliente c2 = new Cliente("Francesco", "R", 1);
        Cliente c3 = new Cliente("Francesco", "F", 1);
        Cliente c4 = new Cliente("Francesco", "F", 2);

        servizioDiSpedizione.add(c1);
        servizioDiRicezione.add(c2);
        servizioFinanziario.add(c3);
        servizioFinanziario.add(c4);
        
        System.out.println("clienti in attesa del servizio di spedizione: "+ servizioDiSpedizione.size());
        System.out.println("clienti in attesa del servizio di ricezione: "+ servizioDiRicezione.size());
        System.out.println("clienti in attesa del servizio finanziario: "+ servizioFinanziario.size());
    }
}
