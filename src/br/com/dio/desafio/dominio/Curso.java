package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private Integer cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(Integer cargaHoraria, String titulo, String descricao) {
        this.setCargaHoraria(cargaHoraria);
        super.setDescricao(descricao);
        super.setTitulo(titulo);
    }

    public Curso() {
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}