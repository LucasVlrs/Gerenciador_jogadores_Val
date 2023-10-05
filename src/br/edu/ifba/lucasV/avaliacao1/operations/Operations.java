package br.edu.ifba.lucasV.avaliacao1.operations;

import java.util.List;
import br.edu.ifba.lucasV.avaliacao1.impl.Player;
import br.edu.ifba.lucasV.avaliacao1.match.Match;

public interface Operations {

    // d.1
    public void printPlayers(List<Player> players);

    // d.2
    public void printMatches(List<Match> matches);

    // d.3
    public List<Player> order(List<Player> players);
    public List<List<Player>> createCustomMatch(List<Player> players);
    public void printTeams(List<List<Player>> teams);
    
    // d.4
    public void playMatch(List<Player> players,List<Match> matches, int NO_OF_MATCHES_PLAYED_AT_ONCE, int matchId);
   
}
