package academy.devdojo.maratonajava.javacore.K_enum.domain;

public class Cliente {


    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTipo Cliente: " + tipoCliente.NOME_RELATORIO + "\nTipo Cliente Int: " + tipoCliente.VALOR + "\nTipo Pagamento: " + tipoPagamento;
    }
}
