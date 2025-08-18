package br.edu.unifei.ecot12.prova;

public class Avaliacao {
    public static final float NOTA_MINIMA=6.0f;
    private long matricula;
    private float nota1;
    private float nota2;
    private float frequencia;
    private float substitutiva;
    public float media(){
        float nota=(nota1+nota2)/2;
        if(nota<NOTA_MINIMA){
            if(nota1<nota2){
                nota=(substitutiva+nota2)/2;
            }else{
                nota=(substitutiva+nota1)/2;
            }
        }
        return nota;
    }

    public boolean aprovacao(){
        return frequencia>=0.75 && media()>=NOTA_MINIMA;
    }

    public long getMatricula() {
        return matricula;
    }
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    public float getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }
    public float getSubstitutiva() {
        return substitutiva;
    }
    public void setSubstitutiva(float substitutiva) {
        this.substitutiva = substitutiva;
    }
}
