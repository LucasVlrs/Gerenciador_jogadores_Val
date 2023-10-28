package br.edu.ifba.lucasV.avaliacao2_caso1.edge.match;

import br.edu.ifba.lucasV.avaliacao2_caso1.model.Player;

public interface Match {

    public int getId();

    public Statistics generateStatistics(Player player);

    public void addStatistics(Statistics statistics);

    public void printStatistics();

    public void whoPlayed();

}
