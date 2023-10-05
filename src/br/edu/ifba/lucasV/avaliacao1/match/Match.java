package br.edu.ifba.lucasV.avaliacao1.match;

import br.edu.ifba.lucasV.avaliacao1.impl.Player;
import br.edu.ifba.lucasV.avaliacao1.impl.Statistics;

public interface Match {

    public int getId();

    public Statistics generateStatistics(Player player);

    public void addStatistics(Statistics statistics);

    public void printStatistics();

    public void whoPlayed();

}
