package model;

/**
 *
 * @author Davi, Maria Rita.
 * @since 20/03
 * @version 1.0
 */
public class Produto {
    private String nomeProduto;
    private String tipoProduto;
    private double valorProduto;
    private int qtdProduto;
    
    public Produto() { }
    
    public Produto(String nomeProduto, String tipoProduto, double valorProduto, int qtdProduto) {
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.valorProduto = valorProduto;
        this.qtdProduto = qtdProduto;
    }
    
    //getters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
    
    //setters
    
    public double valorTotal(){
        return this.valorProduto * this.qtdProduto;
    }
    
    public String verificarProduto(){
        if(this.tipoProduto.equals("Alimento")){
            return "Comestivel";
        }else if(this.tipoProduto.equals("Limpeza")){
            return "Nao comestivel";
        }else if(this.tipoProduto.equals("Vestimenta")){
            return "Roupa";
        }
        return "Sem categoria";
    }
    
    @Override
    public String toString() {
        return "Nome do produto: " + this.nomeProduto +
               "\n Valor do produto: R$" + this.valorProduto +
               "\n Valor total: R$" + valorTotal() +
               "\n Quantidade de produtos: " + this.qtdProduto +
               "\n Tipo do produto: " + this.tipoProduto +
               "\n Verificar Produto: "+ verificarProduto();
    }
    
    
}
