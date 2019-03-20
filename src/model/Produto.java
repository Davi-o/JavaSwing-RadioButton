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

    public Produto() { }
    
    public Produto(String nomeProduto, String tipoProduto) {
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
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
    //setters

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
        return "Nome do produto: " + nomeProduto + "\n Valor do produto: " + valorProduto + "\n Tipo do produto: " + tipoProduto + "\n Verificar Produto: "+ verificarProduto();
    }
    
    
}
