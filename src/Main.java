public class Main {
    public static void main(String[] args) throws Exception {
        Prodotto prodotto1 = new Prodotto();
        prodotto1.nome = "PlayStation 5";
        prodotto1.prezzo = 400;
        prodotto1.iva = 20;

        prodotto1.prezzoBase();
        prodotto1.prezzoConIva();
        prodotto1.nomeEsteso();
    }
}
