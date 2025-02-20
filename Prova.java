public class Prova {
    public static void main(String[] args) {
        Integer[] lista = {1, 2, 3, 4, 5};
        Elenco elenco = new Elenco(lista);

        System.out.println(elenco.getElementoSuccessivo());
        System.out.println(elenco.getElementoSuccessivo());
        System.out.println(elenco.getElementoSuccessivo());
        System.out.println(elenco.getElementoSuccessivo());
        System.out.println(elenco.hasAncoraElementi());
        System.out.println(elenco.getElementoSuccessivo());
        System.out.println(elenco.hasAncoraElementi());

        Elenco elenco2 = new Elenco();

        elenco2.addElement(1);
        elenco2.addElement(2);
        elenco2.addElement(3);
        elenco2.addElement(4);
        elenco2.stampa();

    }
}