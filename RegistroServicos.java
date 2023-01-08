package Classes.java;

import java.time.LocalDate;

public class RegistroServicos {
    private LocalDate data;
    private Servicos servicos;
    private Cliente cliente;
    private Funcionario funcionario;

    public RegistroServicos(Servicos servicos,  Funcionario funcionario, Cliente cliente ) {
        this.servicos = servicos;
        this.funcionario = funcionario;
        this.cliente = cliente;


   }
}
