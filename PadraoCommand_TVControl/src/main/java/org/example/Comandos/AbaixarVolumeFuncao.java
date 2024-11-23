package org.example.Comandos;

import org.example.Command;
import org.example.TV;

public class AbaixarVolumeFuncao implements Command {
    private TV tv;

    public AbaixarVolumeFuncao(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executar() {
        tv.trocarVolume(-1);
    }
}
