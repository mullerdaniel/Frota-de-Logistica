package infra.mensagem;

import domain.entidade.Telemetria;

public class FilaMensagens {

    public void enviar(Telemetria t) {

        System.out.println("Enviando telemetria para fila...");
        System.out.println("Velocidade: " + t.velocidade);

    }
}