package org.example.Comandos;

import org.example.Command;
import org.example.TV;

public class DesligarTvFuncao implements Command {


    private TV tv;

    public DesligarTvFuncao(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        tv.ligarDesligar("Desligado");
    }
}
