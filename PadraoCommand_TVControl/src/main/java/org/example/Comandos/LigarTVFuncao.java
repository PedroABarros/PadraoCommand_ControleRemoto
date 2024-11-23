package org.example.Comandos;

import org.example.Command;
import org.example.TV;

public class LigarTVFuncao implements Command {
    private TV tv;

    public LigarTVFuncao(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        tv.ligarDesligar("Ligado");
    }
}
