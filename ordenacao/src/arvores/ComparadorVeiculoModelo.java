package arvores;

import java.util.Comparator;

public class ComparadorVeiculoModelo implements Comparator<Veiculo>{

	@Override
	public int compare(Veiculo o1, Veiculo o2) {
		return o1.getModelo().compareTo(o2.getModelo());
	}

}