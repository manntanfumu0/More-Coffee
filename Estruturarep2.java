public class Estruturarep2 {
    public static void main(String[] args) {
        System.out.println("Exemplo 8 - uso do whille");
        System.out.println("");
        char novojogo;
        do {
            System.out.println("Deseja jogar novamente(s/n)?");
            novojogo = 'n';
        } while (novojogo == 'S');
        System.out.println("GAME OVER");

    }
}
