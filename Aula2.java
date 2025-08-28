package br.edu.unifei.ecot12.industria;

public class Componente {
    private String nome;
    private String fornecedor;
    private String serial;
    private Projeto projeto;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public Projeto getProjeto() {
        return projeto;
    }
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}



===



package br.edu.unifei.ecot12.industria;

public class Dedicacao {
    private int horas;
    private Funcionario funcionario;
    private Projeto projeto;

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Projeto getProjeto() {
        return projeto;
    }
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}



===



package br.edu.unifei.ecot12.industria;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private int numero;
    private float orcamento;
    private Funcionario gerente;
    private Departamento departamento;
    private List<Componente> componentes = new ArrayList<>();

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public float getOrcamento() {
        return orcamento;
    }
    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }
    public Funcionario getGerente() {
        return gerente;
    }
    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public List<Componente> getComponentes() {
        return componentes;
    }
    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }
}




===



package br.edu.unifei.ecot12.industria;

import java.util.Date;

public class Funcionario {
    private int matricula;
    private String nome;
    private Date admissao;
    private float salario;
    private Departamento departamento;

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getAdmissao() {
        return admissao;
    }
    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}




===



package br.edu.unifei.ecot12.industria;

public class Departamento {
    private String nome;
    private float orcamento;
    private String sigla;
    private String localizacao;
    private Funcionario gerente;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getOrcamento() {
        return orcamento;
    }
    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public Funcionario getGerente() {
        return gerente;
    }
    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
}




===



package br.edu.unifei.ecot12.industria;

public class Main {
    public static void main(String[] args) {
        Departamento d = new Departamento();
        d.setNome("IESTI");

        Funcionario f = new Funcionario();
        f.setNome("EU");
        f.setDepartamento(d);

        Projeto p = new Projeto();
        p.setNumero(666);
        p.setDepartamento(d);
        p.setGerente(f);

        Componente c = new Componente();
        c.setNome("computador");
        c.setProjeto(p);
        p.getComponentes().add(c); // Corrigido aqui

        System.out.println(p.getGerente().getNome());
    }
}

}
