import java.util.Scanner;

public class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    public void imprimir() {
        System.out.println("Ingresso Normal - Valor: R$" + getValor());
    }
}

class VIP extends Ingresso {
    private double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public void imprimir() {
        double valorTotal = getValor() + adicional;
        System.out.println("Ingresso VIP - Valor: R$" + valorTotal);
    }
}

class Camarote extends Ingresso {
    private double adicional;
    private String localizacao;

    public Camarote(double valor, double adicional, String localizacao) {
        super(valor);
        this.adicional = adicional;
        this.localizacao = localizacao;
    }

    public void imprimir() {
        double valorTotal = getValor() + adicional;
        System.out.println("Ingresso Camarote - Valor: R$" + valorTotal + " - Localização: " + localizacao);
    }
}