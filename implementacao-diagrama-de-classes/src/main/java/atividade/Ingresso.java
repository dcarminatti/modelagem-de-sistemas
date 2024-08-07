package atividade;

public class Ingresso {
    private Integer numeroIngresso;
    private Integer assentoIngresso;
    private String tipoIngresso;
    private Float valorIngresso;
    private String dataCompra;

    public enum TipoIngresso {
        INTEIRA,
        MEIA
    }

    public Ingresso(Integer numeroIngresso, Integer assentoIngresso, TipoIngresso tipoIngresso, Float valorIngresso, String dataCompra) {
        this.numeroIngresso = numeroIngresso;
        this.assentoIngresso = assentoIngresso;
        this.valorIngresso = valorIngresso;
        this.dataCompra = dataCompra;

        this.setTipoIngresso(tipoIngresso);
    }



    public void imprimirIngresso() {
        System.out.println("\nIngresso:");
        System.out.println("Número do ingresso: " + this.numeroIngresso);
        System.out.println("Assento: " + this.assentoIngresso);
        System.out.println("Tipo: " + this.tipoIngresso);
        System.out.println("Valor: " + this.valorIngresso);
        System.out.println("Data da compra: " + this.dataCompra);
    }

    public Integer getNumeroIngresso() {
        return numeroIngresso;
    }

    public void setNumeroIngresso(Integer numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
    }

    public Integer getAssentoIngresso() {
        return assentoIngresso;
    }

    public void setAssentoIngresso(Integer assentoIngresso) {
        this.assentoIngresso = assentoIngresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(TipoIngresso tipoIngresso) {
        switch (tipoIngresso) {
            case INTEIRA:
                this.tipoIngresso = "Inteira";
                break;
            case MEIA:
                this.tipoIngresso = "Meia-entrada";
                break;
        }
    }

    public Float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(Float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
}
