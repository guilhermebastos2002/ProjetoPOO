package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Tutorial de java");
        v[1] = new Video("Tutorial de PHP");
        v[2] = new Video("Tutorial de C#");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Guilherme", 22, "M", "Gui");
        g[1] = new Gafanhoto("Jorge", 20, "M", "Jor");

        Visualizacao vis = new Visualizacao(g[0], v[2]);
        Visualizacao vis1 = new Visualizacao(g[1], v[2]);
        System.out.println("Video: " + v[2].getTitulo());
        System.out.println("Views: " + v[2].getViews());
        System.out.println("Gafanhoto: " + g[0].getNome());
        System.out.println("Total de videos assistidos: " + g[0].getTotAssistido());
        v[2].like();
        System.out.println("Curtidas do video: " + v[2].getCurtidas());
        vis1.avaliar();
        vis.avaliar(10);
        System.out.println("Média de avaliações: " + v[2].getAvaliacao());

    }
}