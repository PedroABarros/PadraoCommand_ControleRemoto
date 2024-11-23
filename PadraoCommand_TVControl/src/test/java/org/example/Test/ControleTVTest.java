package org.example.Test;

import org.example.Comandos.*;
import org.example.ControleTV;
import org.example.FuncoesCommand;
import org.example.TV;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControleTVTest {

    ControleTV controle;
    TV tv;


    @Test
    public void deveDiminuirVolume(){
        tv = new TV (50, 10);
        controle = new ControleTV();
        FuncoesCommand dimuirVolume = new AbaixarVolumeFuncao(tv);
        controle.executarTarefa(dimuirVolume);

        assertEquals("{\"volume\": 49, \"canal\": 10, \"status\": Desligado}", tv.getSituacao());
    }

    @Test
    public void deveAumentarVolume(){
        tv = new TV (50, 10);
        controle = new ControleTV();
        FuncoesCommand aumentarVolume = new AumentarVolumeFuncao(tv);
        controle.executarTarefa(aumentarVolume);

        assertEquals("{\"volume\": 51, \"canal\": 10, \"status\": Desligado}", tv.getSituacao());
    }

    @Test
    public void deveLigarTV(){
        tv = new TV (50, 10);
        controle = new ControleTV();
        FuncoesCommand ligarTV = new LigarTVFuncao(tv);
        controle.executarTarefa(ligarTV);

        assertEquals("{\"volume\": 50, \"canal\": 10, \"status\": Ligado}", tv.getSituacao());
    }

    @Test
    public void deveDesligarTV(){
        tv = new TV (50, 10);
        controle = new ControleTV();
        tv.setStatus("Ligado");
        FuncoesCommand ligarTV = new DesligarTvFuncao(tv);
        controle.executarTarefa(ligarTV);

        assertEquals("{\"volume\": 50, \"canal\": 10, \"status\": Desligado}", tv.getSituacao());
    }
}