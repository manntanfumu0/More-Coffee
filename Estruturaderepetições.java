public class Estruturaderepetições {
    public static void main(String[] args) {
        System.out.println("Estuturas de repetições");
        System.out.println("");
        System.out.println("Exemplo 5 uso do for");
        for (int j = 10; j > 0; j--){
            System.out.println(j);
        }
        System.out.println("");
        System.out.println("Exemplo 6 - Tabuada");
        for (int tabuada = 0; tabuada <= 10; tabuada++){
            System.out.println("");
            for (int valor = 0; valor <= 10; valor++){
                System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
            }
           
        }
    }
}
