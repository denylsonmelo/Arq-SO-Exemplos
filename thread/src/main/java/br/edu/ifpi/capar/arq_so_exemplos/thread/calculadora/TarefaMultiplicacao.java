package br.edu.ifpi.capar.arq_so_exemplos.thread.calculadora;

import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Denylson Melo
 */
public class TarefaMultiplicacao implements Runnable {

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    public TarefaMultiplicacao(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    @Override
    public void run() {
        resultado.setText("Calculando");

        long valor1 = Long.parseLong(primeiro.getText());
        long valor2 = Long.parseLong(segundo.getText());
        BigDecimal calculo = new BigDecimal("0");

        for (int i = 0; i < valor1; i++) {
            for (int j = 0; j < valor2; j++) {
                calculo = calculo.add(new BigDecimal("1"));
            }
        }

        resultado.setText(calculo.toString());
    }
}
