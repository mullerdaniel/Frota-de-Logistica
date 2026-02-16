package domain.estrategia;

import domain.entidade.Telemetria;

public interface EstrategiaIngestaoDados {

    void processar(Telemetria t);
}
