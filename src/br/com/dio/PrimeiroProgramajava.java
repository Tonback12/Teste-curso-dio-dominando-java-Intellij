package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramajava {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("A Cabana ", 300);
        System.out.println(livro1);

      /*  int a = 5;
        int b = 3;
        System.out.println("Hello Worl !!" + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer ndp;{

    }

    public Livro(String nome, Integer ndp) {
        this.nome = nome;
        this.ndp = ndp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNdp() {
        return ndp;
    }

    public void setNdp(Integer ndp) {
        this.ndp = ndp;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", ndp=" + ndp +
                '}';
    }
}