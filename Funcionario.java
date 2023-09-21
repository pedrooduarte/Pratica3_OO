public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularProventos() {
        return salarioBase;
    }
}

class SalarioFixo extends Funcionario {
    public SalarioFixo(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
}

class Comissao extends Funcionario {
    private double valorVendas;

    public Comissao(String nome, double salarioBase, double valorVendas) {
        super(nome, salarioBase);
        this.valorVendas = valorVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    @Override
    public double calcularProventos() {
        return getSalarioBase() + (0.1 * valorVendas); // Exemplo de cálculo de comissão (10% das vendas)
    }
}

class Produtividade extends Funcionario {
    private int unidadesProduzidas;
    private double valorPorUnidade;

    public Produtividade(String nome, double salarioBase, int unidadesProduzidas, double valorPorUnidade) {
        super(nome, salarioBase);
        this.unidadesProduzidas = unidadesProduzidas;
        this.valorPorUnidade = valorPorUnidade;
    }

    public int getUnidadesProduzidas() {
        return unidadesProduzidas;
    }

    public void setUnidadesProduzidas(int unidadesProduzidas) {
        this.unidadesProduzidas = unidadesProduzidas;
    }

    public double getValorPorUnidade() {
        return valorPorUnidade;
    }

    public void setValorPorUnidade(double valorPorUnidade) {
        this.valorPorUnidade = valorPorUnidade;
    }

    @Override
    public double calcularProventos() {
        return getSalarioBase() + (unidadesProduzidas * valorPorUnidade); // Exemplo de cálculo de produtividade
    }
}

