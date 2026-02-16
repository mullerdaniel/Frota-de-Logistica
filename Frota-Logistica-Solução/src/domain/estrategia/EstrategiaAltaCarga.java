package domain.estrategia;

import domain.entidade.Telemetria;
import infra.mensagem.FilaMensagens;

public class EstrategiaAltaCarga implements EstrategiaIngestaoDados {

    private FilaMensagens fila;

    public EstrategiaAltaCarga(FilaMensagens fila) {
        this.fila = fila;
    }

    public void processar(Telemetria t) {
        System.out.println("Alta carga - enviando para fila");
        fila.enviar(t);
    }
}