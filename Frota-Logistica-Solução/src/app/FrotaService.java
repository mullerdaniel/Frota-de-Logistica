package app;

import domain.entidade.Telemetria;
import domain.estrategia.EstrategiaIngestaoDados;

public class FrotaService {

    private EstrategiaIngestaoDados estrategia;

    public FrotaService(EstrategiaIngestaoDados estrategia) {
        this.estrategia = estrategia;
    }

    public void receber(Telemetria t) {
        estrategia.processar(t);
    }
}