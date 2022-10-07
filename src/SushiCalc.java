import java.util.Scanner;

public class SushiCalc {
    public static void main(String[] args) {
        final int coperto = 2;
        final int prezzoAcqua = 2;
        final int prezzoAnalcolici = 3;

        Scanner in = new Scanner(System.in);
        System.out.println("Inserire numero di clienti");
        int nc = in.nextInt();
        System.out.println("Inserire numero di bottiglie di acqua");
        int numeroAcqua = in.nextInt();
        System.out.println("Inserire numero di bottiglie di analcolici");
        int numeroAnalcolici = in.nextInt();
        System.out.println("Inserire costo del pasto attuale");
        double prezzoPasto = in.nextInt();
        in.close();
        
        double costoTotale = (coperto * nc) + (nc * prezzoPasto) + (prezzoAcqua * numeroAcqua + prezzoAnalcolici * numeroAnalcolici);
        double costoPerPersona = costoTotale / nc;
        
        System.out.println(costoPerPersona);
    }

}
