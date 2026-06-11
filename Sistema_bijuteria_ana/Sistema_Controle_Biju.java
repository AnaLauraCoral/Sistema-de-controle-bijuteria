public class Sistema_Controle_Biju {

    //----classe das pessoas(super)----
public class Pessoa {
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
public class Cliente extends Pessoa {
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
public class Funcionario extends Pessoa {
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
public class Peca {
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
public class Colar extends Peca {
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
public class Brinco extends Peca {
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
}
