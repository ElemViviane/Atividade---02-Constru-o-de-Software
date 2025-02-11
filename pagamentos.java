package br.com.pagamentos;

public abstract class Pagamento {

    public abstract double calculaValor();

    public void exibeDetalhes(){
        System.out.println("Pagamento realizado com sucesso!");
    }
}


package br.com.pagamentos;

public class PagamentoBoleto extends Pagamento{
    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public double calculaValor() {
        return valor;
    }
}


package br.com.pagamentos;

public class PagamentoCartao extends Pagamento {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public double calculaValor() {
        return 0.02 * valor + valor;
    }
}


package br.com.pagamentos;

public class TestePagamento {
    public static void main(String[] args) {
        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.setValor(600);
        pagamentoCartao.calculaValor();
        pagamentoCartao.exibeDetalhes();

        System.out.println("Valor do juro do cartão R$ " + pagamentoCartao.calculaValor());

        System.out.println();

        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
        pagamentoBoleto.setValor(350);
        pagamentoBoleto.calculaValor();
        pagamentoBoleto.exibeDetalhes();


    }
}
