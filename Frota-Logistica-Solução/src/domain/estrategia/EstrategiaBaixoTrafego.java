package domain.estrategia;

import domain.entidade.Telemetria;
import domain.repositorio.TelemetriaRepositorio;

public class EstrategiaBaixoTrafego implements EstrategiaIngestaoDados {

    private TelemetriaRepositorio repositorio;

    public EstrategiaBaixoTrafego(TelemetriaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void processar(Telemetria t) {
        System.out.println("Baixo trafego - salvando direto");
        repositorio.salvar(t);
    }
}