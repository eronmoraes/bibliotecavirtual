public class Manga extends Produto {
   
    public Manga(int id, String nome, double preco, int estoque, String autor, String categoria) {
        super(id, nome, preco, estoque, autor, categoria);
    }

    public void exibirInfo() {
        System.out.println("Livro - Nome: " + getNome() + " Id: " + getId() + " Preço: " + getPreco() + " Estoque: " + getEstoque() + " Autor: " + getAutor());
    }

}
