package org.example.Comandos;

import org.example.Command;
import org.example.TV;

public class MudarCanalTVFuncao implements Command {
    private TV tv;

    private Integer canal;

    public MudarCanalTVFuncao(TV tv, int canalNovo) {
        this.tv = tv;
        this.canal = canalNovo;
    }

    @Override
    public void executar() {
        tv.mudarCanal(canal);
    }

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }
}
