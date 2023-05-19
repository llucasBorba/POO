class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }
}

class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto / 100);
    }
}

class Administrador extends Empregado {
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}

class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * comissao / 100);
    }
}

class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * comissao / 100);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("João");
        fornecedor.setEndereco("Rua A, 123");
        fornecedor.setTelefone("123456789");
        fornecedor.setValorCredito(5000);
        fornecedor.setValorDivida(2000);
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Saldo: " + fornecedor.obterSaldo());

        Administrador administrador = new Administrador();
        administrador.setNome("Maria");
        administrador.setEndereco("Rua B, 456");
        administrador.setTelefone("987654321");
        administrador.setSalarioBase(3000);
        administrador.setImposto(10);
        administrador.setAjudaDeCusto(500);
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Salário: " + administrador.calcularSalario());

        Operario operario = new Operario();
        operario.setNome("Pedro");
        operario.setEndereco("Rua C, 789");
        operario.setTelefone("567891234");
        operario.setSalarioBase(2000);
        operario.setImposto(5);
        operario.setValorProducao(10000);
        operario.setComissao(2.5);
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Salário: " + operario.calcularSalario());

        
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Ana");
        vendedor.setEndereco("Rua D, 987");
        vendedor.setTelefone("987123456");
        vendedor.setSalarioBase(2500);
        vendedor.setImposto(8);
        vendedor.setValorVendas(15000);
        vendedor.setComissao(3);
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Salário: " + vendedor.calcularSalario());
    }
}
