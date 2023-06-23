import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Veiculo {
    protected String modelo;
    protected double preco;

    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void printDados();
}

class Moto extends Veiculo {
    private int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o modelo da moto: ");
        modelo = scanner.nextLine();
        System.out.print("Digite o preço da moto: ");
        preco = scanner.nextDouble();
        System.out.print("Digite o ano da moto: ");
        ano = scanner.nextInt();
    }

    public double getPreco() {
        if (ano >= 2008) {
            return preco * 1.1;
        } else {
            return preco;
        }
    }

    public void printDados() {
        System.out.println("Moto: " + modelo);
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Ano: " + ano);
    }
}

class Carro extends Veiculo {
    private double km;

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o modelo do carro: ");
        modelo = scanner.nextLine();
        System.out.print("Digite o preço do carro: ");
        preco = scanner.nextDouble();
        System.out.print("Digite a quilometragem do carro: ");
        km = scanner.nextDouble();
    }

    public double getPreco() {
        if (km > 100000) {
            return preco * 0.92;
        } else {
            return preco;
        }
    }

    public void printDados() {
        System.out.println("Carro: " + modelo);
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Quilometragem: " + km);
    }
}

public class Revenda {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Deseja inserir um carro (C) ou uma moto (M)? (Digite 'S' para sair): ");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("C")) {
                Carro carro = new Carro("", 0, 0);
                carro.insertData();
                veiculos.add(carro);
            } else if (opcao.equalsIgnoreCase("M")) {
                Moto moto = new Moto("", 0, 0);
                moto.insertData();
                veiculos.add(moto);
            } else if (opcao.equalsIgnoreCase("S")) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("\nRelatório de Veículos:");
        for (Veiculo veiculo : veiculos) {
            veiculo.printDados();
            System.out.println();
        }

        double totalPrecosAntes = 0;
        double totalPrecosDepois = 0;

        for (Veiculo veiculo : veiculos) {
            totalPrecosAntes += veiculo.getPreco();
            if (veiculo instanceof Moto) {
                if (((Moto) veiculo).getAno() >= 2008) {
                    ((Moto) veiculo).setPreco(((Moto) veiculo).getPreco() * 1.1);
                }
            } else if (veiculo instanceof Carro) {
                if (((Carro) veiculo).getKm() > 100000) {
                    ((Carro) veiculo).setPreco(((Carro) veiculo).getPreco() * 0.92);
                }
            }
            totalPrecosDepois += veiculo.getPreco();
        }

        System.out.println("\nTotal de preços antes dos ajustes: R$" + totalPrecosAntes);
        System.out.println("Total de preços depois dos ajustes: R$" + totalPrecosDepois);
    }
}