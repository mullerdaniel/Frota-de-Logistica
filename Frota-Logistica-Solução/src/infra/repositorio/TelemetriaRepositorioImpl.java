package infra.repositorio;

import domain.entidade.Telemetria;
import domain.repositorio.TelemetriaRepositorio;

public class TelemetriaRepositorioImpl implements TelemetriaRepositorio {

    @Override
    public void salvar(Telemetria t) {

        System.out.println("Simulando salvamento da telemetria...");
        System.out.println("Velocidade: " + t.velocidade);

    }
}
