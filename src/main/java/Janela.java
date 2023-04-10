public class Janela extends Producao{
    private int tamanho;
    public Janela(float maoObra) {
        super(maoObra);
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public float calcularProduto() {
        return (this.maoObra + this.tamanho* this.tipo.custoMaterial());
    }
}
