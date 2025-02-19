public class Elenco{
    private Integer[] elenco;
    private int contatore;
    private int elemento;

    public Elenco(Integer[] elenco){
        this.elenco = elenco;
    }

    public Elenco(){
    }

    public Integer[] getElenco() {
        return elenco;
    }

    public void setElenco(Integer[] elenco) {
        this.elenco = elenco;
    }

    public int getContatore() {
        return contatore;
    }

    public int getElemento() {
        return elemento;
    }
    

    public int getElementoSuccessivo(){

        elemento = elenco[contatore];
        contatore++;
        return elemento;
    }

    public boolean hasAncoraElementi(){
        return (contatore >= elenco.length ? false : true);
    }
    
}