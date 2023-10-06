package projeto.software.game;

public class Textura implements Cloneable {
    private String nome;
    private String caminho;
    private int largura;

    public Textura(String nome, String caminho, int largura) {
        this.nome = nome;
        this.caminho = caminho;
        this.largura = largura;
    }

    @Override
    public Textura clone() throws CloneNotSupportedException {
        return (Textura) super.clone();
    }

    @Override
    public String toString() {
        return "Textura{" +
                "nome=" + nome +
                ", caminho=" + caminho +
                ", largura=" + largura +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
}
