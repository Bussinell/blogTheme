public class Cliente implements Comparable<Cliente>{
    String  nominativo;
    String servizio;
    int codice;
    public Cliente(){
        nominativo = "";
        servizio = "";
        codice = 0;
    }
    
    public Cliente(String nominativo, String servizio, int codice) {
        this.nominativo = nominativo;
        this.servizio = servizio;
        this.codice = codice;
    }

    public void setServizio(String servizio){
        this.servizio = servizio;
    }
    
    public String getServizio(){
        return servizio;
    }

    public String getNominativo() {
        return nominativo;
    }

    public int getCodice(){
        return codice;
    }
    
    public Cliente clone() throws CloneNotSupportedException{
        Cliente cliente = null;
        cliente = (Cliente)super.clone();
        return cliente;
    }
    
    public int compareTo(Cliente c){
        if (codice > c.getCodice()){
            return 1;
        }
        else if (codice < c.getCodice()){
            return -1;
        }else
            return 0;
    }
}
