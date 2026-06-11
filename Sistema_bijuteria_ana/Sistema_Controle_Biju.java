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


    //----classe dos clientes(pertence as pessoas)----
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


    //----classe dos funcionario(pertence as pessoas)----
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


}
