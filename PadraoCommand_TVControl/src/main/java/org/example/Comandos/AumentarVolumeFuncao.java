package org.example.Comandos;

import org.example.Command;
import org.example.TV;

public class AumentarVolumeFuncao implements Command {

    private TV tv;

    public AumentarVolumeFuncao(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        tv.trocarVolume(+1);
    }
}
