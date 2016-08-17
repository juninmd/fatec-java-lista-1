package ex4.br.edu.fatecfranca;

 
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    
    public Rio(){
        this.nome = "";
        this.nivel = 0;
        this.poluido = false;
    }
      
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public void chover(float nivel){
        this.nivel += nivel;
    }
    public boolean ensolarar(float nivel){
        if(this.nivel >= nivel){
            this.nivel -= nivel;
            return true;
        }
        this.nivel = 0;
        return false;
    }
    public void limpar(){
        this.poluido = false;
    }
    public void sujar(){
        this.poluido = true;
    }
    public String mostra(){
        return "Rio: "+this.nome+"\n"+
                "Nível: "+this.nivel+"\n"+
                "Poluído?: "+(this.poluido? "Sim" : "Não");
    }
}
