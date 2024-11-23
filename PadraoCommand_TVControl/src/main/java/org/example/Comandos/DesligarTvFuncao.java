package org.example.Comandos;

import org.example.FuncoesCommand;
import org.example.TV;

public class DesligarTvFuncao implements FuncoesCommand {


    private TV tv;

    public DesligarTvFuncao(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        tv.ligarDesligar("Desligado");
    }
}
