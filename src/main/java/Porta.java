public class Porta extends Producao{
    private int tamanho;
    public Porta(float maoObra) {
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
