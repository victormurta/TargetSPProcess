import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BigDecimal soma = BigDecimal.ZERO;

        List<Distribuidoras> distribuidoras = new ArrayList<>();

        distribuidoras.add(new Distribuidoras("SP", BigDecimal.valueOf(67836.43)));
        distribuidoras.add(new Distribuidoras("RJ", BigDecimal.valueOf(36678.66)));
        distribuidoras.add(new Distribuidoras("MG", BigDecimal.valueOf(29229.88)));
        distribuidoras.add(new Distribuidoras("ES", BigDecimal.valueOf(27165.48)));
        distribuidoras.add(new Distribuidoras("Outros", BigDecimal.valueOf(19849.53)));

        for (Distribuidoras valor:distribuidoras){
            soma = soma.add(valor.getFaturamento());
        }

        for (Distribuidoras valor:distribuidoras){
            System.out.println("SP: " + valor.getFaturamento().divide(soma, 2, BigDecimal.ROUND_DOWN).multiply(BigDecimal.valueOf(100))+"%");
        }

    }
}