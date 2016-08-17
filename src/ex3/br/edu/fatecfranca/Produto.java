package ex3.br.edu.fatecfranca;


public class Produto {
    public int id;
    public String descricao;
    public int qtde;
    public float preco;
    
        public Produto(){
            this.id = 0;
            this.descricao = "";
            this.qtde = 0;
            this.preco = 0;
        }
        public Produto(int id, String descricao, int qtde, float preco){
            this.id = id;
            this.descricao = descricao;
            this.qtde = qtde;
            this.preco = preco;
        }
        public void comprar(int qtde){
            this.qtde += qtde;
        }
        public boolean vender(int qtde){
            if(this.qtde > qtde){
              this.qtde -= qtde;
              return true;
            }
            return false;
        }
        
        public void subir(float preco){
            this.preco += preco;
        }
        public boolean descer(float preco){
            if(this.preco >= preco){
                this.preco -= preco;
                return true;
            }
            return false;
        }
        
        public String mostra(){
            return "Id: "+this.id+"\n"+
                    "Nome: "+this.descricao +"\n"+
                    "Quantidade:"+this.qtde+"\n"+
                    "Preço:"+this.preco;
        }
}

 
