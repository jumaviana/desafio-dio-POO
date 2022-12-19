package br.com.desafio.dominio;


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class dev {

    private String nome;
    private Set<conteudo> LinkedHashSet;
    private Set<conteudo> conteudosinscritos  = new LinkedHashSet<>();
    private Set<conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreveBootcamp (bootcamp bootcamp) {

      this.conteudosinscritos.addAll(bootcamp.getConteudos());
      bootcamp.getDevsincrito().add(this);
  }


    public void progredir(){

        Optional<conteudo> conteudo = this.conteudosinscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosinscritos.remove(conteudo.get());
        } else {
            System.err.println(" você não esta incrito em nenhum conteudo");
        }
    }

    public double calcularXpTotal(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudo::calcularXP).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudosinscritos() {
        return conteudosinscritos;
    }

    public void setConteudosinscritos(Set<conteudo> conteudosinscritos) {
        this.conteudosinscritos = conteudosinscritos;
    }

    public Set<conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dev dev = (dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(LinkedHashSet, dev.LinkedHashSet) && Objects.equals(conteudosinscritos, dev.conteudosinscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, LinkedHashSet, conteudosinscritos, conteudosConcluidos);
    }
}
