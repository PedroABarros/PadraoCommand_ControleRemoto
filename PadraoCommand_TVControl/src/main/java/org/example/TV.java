package org.example;

import java.util.ArrayList;
import java.util.List;
public class TV{
        private List<FuncoesCommand> funcoes = new ArrayList<FuncoesCommand>();

        public void executarFuncao(TV funcoes) {
            this.funcoes.add(funcoes);
            funcoes.executar();
        }
}
