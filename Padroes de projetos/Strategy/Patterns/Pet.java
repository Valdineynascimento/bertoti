package strategypattern;

public class Pet{
    private Brincadeira brincadeira;

    public void setBrincadeira( Brincadeira brincadeira){
        this.brincadeira =brincadeira;

    }

    public void brincarBrincadeira() {
        this.brincadeira.brincar();
    }
}