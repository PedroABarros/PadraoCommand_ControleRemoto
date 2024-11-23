package org.example.Comandos;

import org.example.FuncoesCommand;
import org.example.TV;

public class AumentarVolumeFuncao implements FuncoesCommand {

    private TV tv;

    public AumentarVolumeFuncao(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        tv.trocarVolume(+1);
    }


}
