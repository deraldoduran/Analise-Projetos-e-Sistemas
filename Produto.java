package analiseprojetossistemas;

public class Produto {

    private int codigoProduto;
    private String descricaoProduto;
    private double valorCompra;
    private double custoArmazenagemouBeneficiamento;
    private double margemLucro;
    private int qtdEstoque;
    
    
    void compra(int qtd){
        qtdEstoque = qtdEstoque + qtd;
    }
    
    void venda(int qtd){
        qtdEstoque = qtdEstoque - qtd;
    }

    double calculaPrecodeVenda (){
        return valorCompra + custoArmazenagemouBeneficiamento + margemLucro *(valorCompra + custoArmazenagemouBeneficiamento);
    }

    public Produto(int codigoProduto, String descricaoProduto, double valorCompra, double custoArmazenagemouBeneficiamento, double margemLucro) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.valorCompra = valorCompra;
        this.custoArmazenagemouBeneficiamento = custoArmazenagemouBeneficiamento;
        this.margemLucro = margemLucro;
    }

    public Produto(int codigoProduto, String descricaoProduto) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public Produto(int codigoProduto, String descricaoProduto, double valorCompra, double custoArmazenagemouBeneficiamento, double margemLucro, int qtdEstoque) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.valorCompra = valorCompra;
        this.custoArmazenagemouBeneficiamento = custoArmazenagemouBeneficiamento;
        this.margemLucro = margemLucro;
        this.qtdEstoque = qtdEstoque;
    }
    
    
    
    /**
     * @return the valorCompra
     */
    public double getValorCompra() {
        return valorCompra;
    }

    /**
     * @param valorCompra the valorCompra to set
     */
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    /**
     * @return the custoArmazenagemouBeneficiamento
     */
    public double getCustoArmazenagemouBeneficiamento() {
        return custoArmazenagemouBeneficiamento;
    }

    /**
     * @param custoArmazenagemouBeneficiamento the custoArmazenagemouBeneficiamento to set
     */
    public void setCustoArmazenagemouBeneficiamento(double custoArmazenagemouBeneficiamento) {
        this.custoArmazenagemouBeneficiamento = custoArmazenagemouBeneficiamento;
    }

    /**
     * @return the margemLucro
     */
    public double getMargemLucro() {
        return margemLucro;
    }

    /**
     * @param margemLucro the margemLucro to set
     */
    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }
    
}
