import java.util.Random;
public class Prodotto {
    public int codice;

    public String nome;

    public String decrizione;

    public double prezzo;

    public int iva;

    Random ran = new Random();

    public Prodotto(){
        this.codice = ran.nextInt();
    }

    public void prezzoBase(){
        System.out.println(prezzo);
    }

    public void prezzoConIva(){
        double calcoloIva = (prezzo * iva)/100; 
        System.out.println(prezzo + calcoloIva);
    }

    public void nomeEsteso(){
        System.out.println(codice + "-" + nome);
    }
}
