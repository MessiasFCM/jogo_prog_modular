package sondas;

import ambiente.Terreno;
import robos.Robo;
import robos.RoboFTT;

public class SondaAltaCapacidade extends Sonda {
    private static int contadorExecucoes = 0;
    public SondaAltaCapacidade(Robo robo) {
        super("Alta Capacidade");

        if (contadorExecucoes < 2 && robo instanceof RoboFTT) {
            RoboFTT roboFTT = (RoboFTT) robo;

            // Carga ilimitada!
            double novaCapacidade = roboFTT.getPorcentagemCarga() * 10;
            roboFTT.setPorcentagemCarga(novaCapacidade);

            contadorExecucoes++;
        }
    }
}