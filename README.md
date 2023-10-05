## Avaliação I

O programa vai consiste no monitoramento da performance de 10 jogadores diferentes retornando dados de partidas como seu K/D (Proporção de eliminações e abates), Operador, Mapa dentre outros. Além disso, organiza a classificação dos melhores jogadores por "Elos". E cria uma partida entre os jogadores monitorados.
- Para a execução do programa, basta rodar o aplicativo pela classe "App.java", e executar os comandos desejados através do menu: 

        "+-----------------------+"
        "|         MENU          |"
        "| 1- Play               |"
        "| 2- Players List       |"
        "| 3- Matches List       |"
        "| 4- Update Leaderboard |"
        "| 5- Custom Match       |"
        "| 6- Exit               |"
        "+-----------------------+"
    - 1 - Gera n partidas aleatórias para cada jogador criado
    - 2 - Retorna a lista dos jogadores criados
    - 3 - Retorna todas as partidas com suas estatísticas, indicando o jogador que a jogou
    - 4 - Atualiza a lista de jogadores de acordo com um Ranking, baseado nas pontuações dos mesmos
    - 5 - Cria uma partida 5 vs. 5 entre os jogadores da lista
        - A funcionalidade tem um sistema de balanceamento automático
    - 6 - Encerra a aplicação
    
## Requisitos
- Existem 10 jogadores;
- As partidas são geradas aleatóriamente e atribuídas a cada jogador;
- Há uma funcionalidade que mostra a lista dos 10 jogadores
- Há uma a funcionalidade que exibe cada estatística de partidas jogadas, e o jogador que a jogou
- Há uma funcionalidade que organiza a lista de jogadores de acordo com um Ranking utilizando "Elos"
- Há uma funcionalidade que monta uma partida customizada entre estes 10 jogadores
    - Esta partida é ser balanceada de acordo com os "Elos" dos jogadores
    - O nivelamento ocorre deixando a média de pontuação individual entre os times com a menor diferença possível