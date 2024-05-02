import java.util.ArrayList;

public class Cartao {
    private double limiteCartao;
    public double saldo;
    private ArrayList<Mercado> lista = new ArrayList<>();

    public double getSaldo() {
        return saldo;
    }

    public boolean aprovarCompra(Mercado compra){
        if(compra.getPreco() < saldo){
            saldo -= compra.getPreco();
            this.lista.add(compra);
            return true;
        }
        return false;
    }

    public Cartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.saldo = limiteCartao;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public ArrayList<Mercado> getLista() {
        return lista;
    }
}
