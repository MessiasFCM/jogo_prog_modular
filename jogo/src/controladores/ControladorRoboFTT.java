package controladores;

import ambiente.Terreno;
import robos.Robo;

public class ControladorRoboFTT extends Controlador {
    @Override
    public String nomeControlador() {
        return "Controlador FTT";
    }

    @Override
    public void iniciarProspeccao(Robo robo, Terreno terreno) {

    }

    @Override
    public void andar(Robo robo, Terreno terreno) {

    }

    @Override
    public double sensorHelioDisponivel(Robo robo, Terreno terreno) {
        return 0;
    }
}