import java.util.Scanner;

public class Midia {
    private int cod;
    private double prec;
    private String nome;

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setPrec(double prec) {
        this.prec = prec;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public double getPrec() {
        return prec;
    }

    public String getNome() {
        return nome;
    }

    public Midia() {
        this(0, 0.0, "Nenhum");
    }

    public Midia(int cod, double prec, String nome) {
        setCod(cod);
        setPrec(prec);
        setNome(nome);
    }

    public String getTipo() {
        return "Midia: ";
    }

    public String getDetalhes() {
        return "Codigo: " + getCod() + "\n" + "Preco: " + getPrec() + "\n" + "Nome: " + getNome() + "\n";
    }

    public void printDados() {
        String s = getTipo() + "\n" + getDetalhes() + "\n";
        System.out.println(s);
    }

    public void inserirDados() {
        Scanner in = new Scanner(System.in);

        System.out.printf("\n Entre com o codigo: ");
        int c = in.nextInt();
        System.out.printf("\n Entre com o preco: ");
        double p = in.nextDouble();
        in.nextLine();

        setCod(c);
        setPrec(p);
        setNome(n);
    }
}

public class CD extends Midia {
    private int nM;

    public CD() {
        this(0, 0.0, "Nenhum", 0);
    }

    public CD(int cod, double prec, String nome, int nM) {
        super(cod, prec, nome);
        setMus(nM);
    }

    public String getTipo() {
        return "CD: ";
    }

    public String getDetalhes() {
        return super.getDetalhes() + "\n" + "Numero de musicas: " + nM + "\n";
    }

    public void setMus(int nM) {
        this.nM = (nM > 0) ? nM : 0;
    }

    public void inserirDados() {
        super.inserirDados();
        Scanner in = new Scanner(System.in);

        System.out.printf("\n Entre com o numero de musicas: ");
        int nM = in.nextInt();

        setMus(nM);
    }
}

public class DVD extends Midia {
    private int nF;

    public DVD() {
        this(0, 0.0, "Nenhum", 0);
    }

    public DVD(int cod, double prec, String nome, int nF) {
        super(cod, prec, nome);
        setFai(nF);
    }

    public String getTipo() {
        return "DVD: ";
    }

    public String getDetalhes() {
        return super.getDetalhes() + "\n" + "Numero de faixas: " + nF + "\n";
    }

    public void setFai(int nF) {
        this.nF = (nF > 0) ? nF : 0;
    }

    public void inserirDados() {
        super.inserirDados();
        Scanner in = new Scanner(System.in);

        System.out.printf("\n Entre com o numero de faixas: ");
        int nF = in.nextInt();

        setFai(nF);
    }
}

public class TestaMidia {
    public static void main(String args[]) {
        Midia[] lista = new Midia[10];
        int op;

        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite 1 para CD e 2 para DVD");
            Scanner in = new Scanner(System.in);
            op = in.nextInt();

            if (1 == op)
                lista[i] = new CD();
            else
                lista[i] = new DVD();

            lista[i].inserirDados();
        }

        for (int i = 0; i < 2; i++)
            lista[i].printDados();
    }
}
