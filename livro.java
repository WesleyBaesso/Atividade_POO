public class Livro extends Produto {
    private String autor;
    private int paginas;
    private boolean capaDura;

    public Livro(String nome, double preco, String autor, int paginas, boolean capaDura) {
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
        this.capaDura = capaDura;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + paginas);
        System.out.println("Capa dura: " + (capaDura ? "Sim" : "Não"));
    }
} {
    
}
