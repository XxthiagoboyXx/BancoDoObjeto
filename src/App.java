public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco conta_jose = new ContaBanco();
        conta_jose.abrirConta(666, "cc", "José da Silva");
        conta_jose.depositar(15.25f);
        conta_jose.sacar(12.3f);
        conta_jose.estadoAtual();

        ContaBanco conta_maria = new ContaBanco();
        conta_maria.setDono("Maria Pereira");
        conta_maria.setNumConta(443);
        conta_maria.setStatus(true);
        conta_maria.abrirConta("cp");
        conta_maria.sacar(153.0f);
        conta_maria.sacar(150f);
        conta_maria.fecharconta();
        conta_maria.estadoAtual();

    }
}
