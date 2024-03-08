public class produto {
    private String codigo;
    private String nome;
    private double preco;
    private String lote;
    private int quantidadedeEstoque;

    public produto (String codigo,
                    String nome,
                    double preco,
                    String lote,
                    int quantidadedeEstoque){
                        this.codigo = codigo;
                        this.nome = nome;
                        this.preco = preco;
                        this.lote = lote;
                        this.quantidadedeEstoque = quantidadedeEstoque;
                    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setLote(String lote){
        this.lote = lote;
    }

    public void setquantidadedeEstoque(int quantidadedeEstoque){
        this.quantidadedeEstoque = quantidadedeEstoque;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getLote(){
        return this.lote;
    }

    public int getquantidadedeEstoque(){
        return this.quantidadedeEstoque;
    }

    public void exibirDados(){
        System.out.println(
            "Produto: " + this.nome +
            "\nCódigo: " + this.codigo +
            "\nPreço" + this.preco + "Quantidade: " + this.quantidadedeEstoque);
    }

}
