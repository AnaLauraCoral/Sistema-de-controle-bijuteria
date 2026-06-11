

    //----classe das pessoas(super)----
class Pessoa {
    protected int codigo;
    protected String nome;
    
    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
    }
}


    //----classe dos clientes(pertence a pessoas)----
class Cliente extends Pessoa {
    private String telefone;

    public Cliente(int codigo, String nome, String telefone) {
        super(codigo, nome);
        this.telefone = telefone;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Telefone: " + telefone);
    }
}


    //----classe dos funcionario(pertence a pessoas)----
class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(int codigo, String nome, String cargo) {
        super(codigo, nome);
        this.cargo = cargo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: " + cargo);
    }
}



    //----classe das peças(super)----
class Peca {
    protected int codigo;
    protected String nome;
    protected double preco;

    public Peca(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}

    //----classe dos colares(pertence a peças)----
class Colar extends Peca {
    private String material;

    public Colar(int codigo, String nome, double preco, String material) {
        super(codigo, nome, preco);
        this.material = material;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Material: " + material);
    }
}

    //----classe dos brincos(pertence a peças)----
class Brinco extends Peca {
    private String tamanho;

    public Brinco(int codigo, String nome, double preco, String tamanho) {
        super(codigo, nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tamanho: " + tamanho);
    }
}

//array


public class Sistema_Controle_Biju {

    static Cliente[] clientes = new Cliente[10];
    static Funcionario[] funcionarios = new Funcionario[10];
    static Peca[] pecas = new Peca[10];

    static int qtdClientes = 0;
    static int qtdFuncionarios = 0;
    static int qtdPecas = 0;

    public static void main(String[] args) {

        // Clientes
        clientes[qtdClientes++] =
                new Cliente(1, "Ana", "99999-9999");

        clientes[qtdClientes++] =
                new Cliente(2, "Carlos", "98888-8888");

        // Funcionários
        funcionarios[qtdFuncionarios++] =
                new Funcionario(1, "Maria", "Vendedora");

        funcionarios[qtdFuncionarios++] =
                new Funcionario(2, "Pedro", "Gerente");

        // Peças
        pecas[qtdPecas++] =
                new Colar(1, "Colar de Pérolas", 49.90, "Pérola");

        pecas[qtdPecas++] =
                new Brinco(2, "Brinco Argola", 29.90, "Médio");

        System.out.println("=== CLIENTES ===");
        for (int i = 0; i < qtdClientes; i++) {
            clientes[i].exibirDados();
            System.out.println("----------------");
        }

        System.out.println("\n=== FUNCIONÁRIOS ===");
        for (int i = 0; i < qtdFuncionarios; i++) {
            funcionarios[i].exibirDados();
            System.out.println("----------------");
        }

        System.out.println("\n=== PEÇAS ===");
        for (int i = 0; i < qtdPecas; i++) {
            pecas[i].exibirDados();
            System.out.println("----------------");
        }
    }
}
