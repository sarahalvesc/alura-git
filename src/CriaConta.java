public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraconta = new Conta();
        primeiraconta.saldo = 200;
        System.out.println(primeiraconta.saldo);

        primeiraconta.saldo += 100;
        System.out.println(primeiraconta.saldo);

        Conta segundaconta = new Conta();
        segundaconta.saldo = 50;

        System.out.println(primeiraconta.saldo);
        System.out.println(segundaconta.saldo);


    }
}
