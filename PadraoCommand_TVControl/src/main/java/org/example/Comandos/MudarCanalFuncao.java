package org.example.Comandos;

import org.example.FuncoesCommand;
import org.example.TV;

public class MudarCanalFuncao implements FuncoesCommand {

    private TV tv;

    public MudarCanalFuncao(TV tv) {
        this.tv = tv;
    }


    @Override
    public void executar() {

    }


}
