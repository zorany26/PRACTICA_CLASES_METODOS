package org.example.MODELOS;
//poner 7 atributos
public class Apartamentos {
    private Long id;
    private Integer numeroapartamento;
    private Integer numeroHbitaciones;
    private Integer numeroBaños;
    private Double superficiemetros;
    private Double precioAlquiles;
    private  Boolean tieneBalcon;
    private Boolean disponibilidad;

    public Apartamentos() {
    }

    public Apartamentos(Integer numeroapartamento, Integer numeroHbitaciones, Integer numeroBaños, Double superficiemetros, Double precioAlquiles, Boolean tieneBalcon, Boolean disponibilidad) {
        this.numeroapartamento = numeroapartamento;
        this.numeroHbitaciones = numeroHbitaciones;
        this.numeroBaños = numeroBaños;
        this.superficiemetros = superficiemetros;
        this.precioAlquiles = precioAlquiles;
        this.tieneBalcon = tieneBalcon;
        this.disponibilidad = disponibilidad;
    }

    public Integer getNumeroapartamento() {
        return numeroapartamento;
    }

    public void setNumeroapartamento(Integer numeroapartamento) {
        this.numeroapartamento = numeroapartamento;
    }

    public Integer getNumeroHbitaciones() {
        return numeroHbitaciones;
    }

    public void setNumeroHbitaciones(Integer numeroHbitaciones) {
        this.numeroHbitaciones = numeroHbitaciones;
    }

    public Integer getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(Integer numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

    public Double getSuperficiemetros() {
        return superficiemetros;
    }

    public void setSuperficiemetros(Double superficiemetros) {
        this.superficiemetros = superficiemetros;
    }

    public Double getPrecioAlquiles() {
        return precioAlquiles;
    }

    public void setPrecioAlquiles(Double precioAlquiles) {
        this.precioAlquiles = precioAlquiles;
    }

    public Boolean getTieneBalcon() {
        return tieneBalcon;
    }

    public void setTieneBalcon(Boolean tieneBalcon) {
        this.tieneBalcon = tieneBalcon;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Apartamentos{" +
                "numeroapartamento=" + numeroapartamento +
                ", numeroHbitaciones=" + numeroHbitaciones +
                ", numeroBaños=" + numeroBaños +
                ", superficiemetros=" + superficiemetros +
                ", precioAlquiles=" + precioAlquiles +
                ", tieneBalcon=" + tieneBalcon +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
