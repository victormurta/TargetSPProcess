import java.math.BigDecimal;

public class Distribuidoras {
    private String estado;
    private BigDecimal faturamento;


    Distribuidoras(String estado, BigDecimal faturamento){
        this.estado = estado;
        this.faturamento = faturamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(BigDecimal faturamento) {
        this.faturamento = faturamento;
    }
}
