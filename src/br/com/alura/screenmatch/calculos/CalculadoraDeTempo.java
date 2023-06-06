package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public static class CalculadoraDeTempo1 {
        public void inclui(Filme meuFilme) {
        }

        public boolean getTempoTotal() {
            return false;
        }
    }
}

