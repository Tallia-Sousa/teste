package Salao.Beleza;


import java.time.LocalDate;

import static Salao.Beleza.APP.servicos;

public class Servico {

    private static int contador = 1;
    private String nome;
    private String descricao;
    private double valor;
    private int codigo;
    private LocalDate servico;
    private Funcionario funcionario;
    Servico(String nome, String descricao, double valor, Funcionario funcionario) {
     this.descricao = descricao;
     this.nome = nome;
     this.valor = valor;
     this.funcionario =funcionario;
     this.codigo = contador;
     contador +=1;
 }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void remover(Servico servico, int codigo ) {
     if(servico.getNome().equalsIgnoreCase(nome)) {
         servicos.remove(servico);
         System.out.println(" servico removido com sucesso");
     }
     else{
         System.out.println(" nao foi possivel remover serviço");
     }
 }
 public void alterar(Servico servico,int codigo, String nome, double valor, String descricao, String nomefuncionario){
      if(servico.getCodigo() == codigo) {
         servico.setValor(valor);
         servico.setDescricao(descricao);
         servico.setNome(nome);
         servico.funcionario.setNome(nomefuncionario);

         System.out.println(" Serviço alterado com sucesso");
 }
      else{
          System.out.println("Nao foi possivel fazer a alterção");
      }
    }
         public String getDescricao() {

             return descricao;
         }

         public double getValor () {
             return valor;
         }

    public String getNome() {
        return nome;
    }

    public String toString () {
             return "Codigo: " + getCodigo() + "\n" +
                     "Nome: " + getNome() + "\n" +
                     "valor: " + getValor() + "\n" +
                     "descriçao: " + getDescricao();
         }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionarioNome(String nome) {
        this.funcionario.setNome(nome);
    }
}
