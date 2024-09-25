package org.example.MODELOS;
//poner 7 atributos
public class Arrendatario {
    private Long id;
    private String nombreCompleto;
    private String documento;
    private String telefono;
    private String correo;
    private String direccion;
    private Integer numeroPersonas;
    private Double ingresosMensuales;

    public Arrendatario() {
    }

    public Arrendatario(String nombreCompleto, String documento, String telefono, String correo, String direccion, Integer numeroPersonas, Double ingresosMensuales) {
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.numeroPersonas = numeroPersonas;
        this.ingresosMensuales = ingresosMensuales;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(Integer numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public Double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(Double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    @Override
    public String toString() {
        return "Arrendatario{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", documento='" + documento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroPersonas=" + numeroPersonas +
                ", ingresosMensuales=" + ingresosMensuales +
                '}';
    }
}
