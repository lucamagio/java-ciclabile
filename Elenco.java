public class Elenco{
    private Integer[] elenco;
    private int contatore;
    private int elemento;
    private int dimensione;

    public Elenco(Integer[] elenco){
        this.elenco = elenco;
        this.elemento = 0;
    }

    public Elenco(){
        this.elenco = new Integer[3];
        this.dimensione = 0;
        this.elemento = 0;
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

    public int getDimensione() {
        return dimensione;
    }
    

    public int getElementoSuccessivo(){

        elemento = elenco[contatore];
        contatore++;
        return elemento;
    }

    public boolean hasAncoraElementi(){
        return (contatore >= elenco.length ? false : true);
    }

    public void addElement(int nuovoElemento){
        if(dimensione == elenco.length){
            Integer[] nuovoElenco = new Integer[elenco.length * 2];
            System.arraycopy(elenco, 0, nuovoElenco, 0, elenco.length);
            elenco = nuovoElenco;
        }

        elenco[dimensione++] = nuovoElemento;
    }

    public void stampa(){
        for(int i = 0; i < elenco.length; i++){
            System.out.println(elenco[i]);
        }
    }

    
}