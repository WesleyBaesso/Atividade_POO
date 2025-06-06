public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("O Pequeno Príncipe", 39.90, "Antoine de Saint-Exupéry", 96, true);
        Camisa camisa = new Camisa("Camisa Polo", 89.90, "Azul", "M", "Algodão");

        System.out.println("=== Informações do Livro ===");
        livro.exibirInfo();

        System.out.println("\n=== Informações da Camisa ===");
        camisa.exibirInfo();
    }
}