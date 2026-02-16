package app;

import java.util.Scanner;

import domain.entidade.Telemetria;
import domain.estrategia.EstrategiaAltaCarga;
import domain.estrategia.EstrategiaBaixoTrafego;
import domain.estrategia.EstrategiaIngestaoDados;
import infra.mensagem.FilaMensagens;
import infra.repositorio.TelemetriaRepositorioImpl;
import service.FrotaService;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\nSISTEMA DE GESTÃO DE FROTA");
            System.out.println("1 - Modo Tráfego Leve");
            System.out.println("2 - Modo Alta Carga (Natal)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            EstrategiaIngestaoDados estrategia;

            if (opcao == 2) {
                estrategia = new EstrategiaAltaCarga(new FilaMensagens());
            } else {
                estrategia = new EstrategiaBaixoTrafego(new TelemetriaRepositorioImpl());
            }

            FrotaService service = new FrotaService(estrategia);

            System.out.print("Digite a velocidade: ");
            double velocidade = scanner.nextDouble();

            Telemetria telemetria = new Telemetria(velocidade);

            service.receber(telemetria);

        } while (opcao != 0);

        scanner.close();
    }
}
