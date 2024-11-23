package org.example.Comandos;

import org.example.FuncoesCommand;
import org.example.TV;

public class LigarTVFuncao implements FuncoesCommand {
    private TV tv;

    public LigarTVFuncao(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        tv.ligarDesligar("Ligado");
    }


}
