public class Main {
    public static void main(String[] args) {

        ContaBanco u1 = new ContaBanco("123","CC","Jonivaldo");
        ContaBanco u2 = new ContaBanco("321","CP","Rudinelsa");

        u1.abriConta();
        u1.depositar(100);
        u1.sacar(150);
        u1.fecharConta();

        u1.telaDoCaixa();


        System.out.println("\n\n\n");


        u2.abriConta();
        u2.depositar(500);
        u2.sacar(100);

        u2.telaDoCaixa();



    }
}