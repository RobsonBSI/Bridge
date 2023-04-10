public class Porta extends Producao{
    private float tamanho;
    public Porta(float maoObra) {
        super(maoObra);
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public float calcularProduto() {
        return (this.maoObra + this.tamanho* this.tipo.custoMaterial());
    }
}
