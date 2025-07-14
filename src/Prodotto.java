import java.util.Random;
public class Prodotto {
    private int codice;

    private String nome;

    private String descrizione;

    private double prezzo;

    private int iva;

    private Random ran = new Random();

    public Prodotto(int codice , String nome , String  descrizione , double prezzo , int iva ){
        this.codice = ran.nextInt();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva =iva;
        

    }

    public double prezzoBase(){
        return prezzo;
        }

    public double prezzoConIva(){
        double calcoloIva = (prezzo * iva)/100; 
        return calcoloIva + prezzo;
    }

    public String nomeEsteso(){
        return codice + "-" + nome;
    }



}

