package org.example.Comandos;

import org.example.FuncoesCommand;
import org.example.TV;

public class AbaixarVolumeFuncao implements FuncoesCommand {
    private TV tv;

    public AbaixarVolumeFuncao(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        tv.trocarVolume(-1);
    }
}
