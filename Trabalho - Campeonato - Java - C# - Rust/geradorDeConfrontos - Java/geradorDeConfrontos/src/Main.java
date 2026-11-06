public class Main  {
    public static void main(String[] args) {
        String[] times = {"Atlético-MG", "Cruzeiro", "América-MG", "Villa Nova"};

        System.out.println("=== TABELA DOS 4 INICIAIS TIMES ===");
        gerarTabelas(times);

        String[] novoArray = new String[times.length + 1];
        for (int i = 0; i < times.length; i++) {
            novoArray[i] = times[i];
        }
        novoArray[novoArray.length - 1] = "Tombense";
        times = novoArray;

        System.out.println("\n=== TABELA DOS 5 FINAIS TIMES ===");
        gerarTabelas(times);
    }

    private static void gerarTabelas(String[] times) {
        System.out.println("\nTimes:");
        for (int i = 0; i < times.length; i++) {
            System.out.println("[" + i + "] " + times[i]);
        }

        System.out.println("\nIda e Volta:");
        int totalIdaEVolta = 0;
        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < times.length; j++) {
                if (i != j) {
                    totalIdaEVolta++;
                    System.out.println("Jogo " + totalIdaEVolta + ": " + times[i] + " x " + times[j]);
                }
            }
        }
        System.out.println("Total (Ida e Volta): " + totalIdaEVolta);

        System.out.println("\nTurno Único:");
        int totalTurnoUnico = 0;
        for (int i = 0; i < times.length; i++) {
            for (int j = i + 1; j < times.length; j++) {
                totalTurnoUnico++;
                System.out.println("Jogo " + totalTurnoUnico + ": " + times[i] + " x " + times[j]);
            }
        }
        System.out.println("Total (Turno Único): " + totalTurnoUnico);
    }
}