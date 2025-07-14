public class Main {
    public static void main(String[] args) throws Exception {
        Prodotto prodotto1 = new Prodotto(0, "Playstation 5", null, 400, 20);
       

        System.out.println(prodotto1.prezzoBase());
        System.out.println(prodotto1.prezzoConIva());
        System.out.println(prodotto1.nomeEsteso());

    }
}
