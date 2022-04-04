public class MercadoAgricolas {
    public static void main(String [] args ) {
        String nome[]=new String [8];
        nome[0]= "Soja";
        nome[1]= "Trigo";
        nome[2]= "Milho";
        nome[3]= "Café";
        nome[4]= "Laranja";
        nome[5]= "Açúcar";
        nome[6]= "Algodão";
        nome[7]= "Carne";

        double preco[]=new double[8];
        preco[0]= 191.00;
        preco[1]= 94.00;
        preco[2]= 110.00;
        preco[3]= 1236.00;
        preco[4]= 55.50;
        preco[5]= 143.65;
        preco[6]= 1825.00;
        preco[7]= 2200.00;

        for(int i = 0; i < preco.length; i++) {
            System.out.println("Preco " + preco[i]+" da commidities "+nome[i]);

        }

    }
}
