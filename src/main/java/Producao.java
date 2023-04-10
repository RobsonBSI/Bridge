public abstract class Producao {

    protected TipoMaterial tipo;
    protected float maoObra;

    public Producao(float maoObra){
        this.maoObra= maoObra;
    }

    public void setTipo(TipoMaterial tipo) {
        this.tipo = tipo;
    }

    public void setMaoObra(float maoObra) {
        this.maoObra = maoObra;
    }
    public abstract float calcularProduto();
}
