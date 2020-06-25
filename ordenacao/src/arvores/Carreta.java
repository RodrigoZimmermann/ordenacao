package arvores;

public class Carreta extends Veiculo {

    public Carreta(String placa, String modelo, int ano, String dono) {
        super(placa, modelo, ano, dono);
    }


    @Override
    public int compareTo(Veiculo outro) {
        return this.getModelo().compareTo(outro.getModelo());
    }


    @Override
    public boolean equals(Object outro) {
        if (this == outro)
            return true;
        if (outro == null)
            return false;
        if (getClass() != outro.getClass())
            return false;

        Carreta v = (Carreta) outro;
        return this.getModelo().equals(v.getModelo());
    }

}
