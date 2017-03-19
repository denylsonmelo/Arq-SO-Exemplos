package br.edu.ifpi.capar.arq_so_exemplos.thread.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotao implements ActionListener {

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
        Runnable tarefaMultiplicacao = new TarefaMultiplicacao(primeiro, segundo, resultado);
        Thread thread = new Thread(tarefaMultiplicacao);
        thread.start();
        */
        long valor1 = Long.parseLong(primeiro.getText());
        long valor2 = Long.parseLong(segundo.getText());

        resultado.setText(String.valueOf(valor1 * valor2));
    }

}
