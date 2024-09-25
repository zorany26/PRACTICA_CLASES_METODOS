package org.example.MODELOS;
//poner 7 atributos
public class Propietario {
    private Long id;
    private String nombreCompleto;
    private String documento;
    private String telefono;
    private String correo;
    private String direccion;
    private String CuentaBancaria;
    private Integer numerApartamento;

    public Propietario() {
    }

    public Propietario(Long id, String nombreCompleto, String documento, String telefono, String correo, String direccion, String cuentaBancaria, Integer numerApartamento) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.CuentaBancaria = cuentaBancaria;
        this.numerApartamento = numerApartamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        CuentaBancaria = cuentaBancaria;
    }

    public Integer getNumerApartamento() {
        return numerApartamento;
    }

    public void setNumerApartamento(Integer numerApartamento) {
        this.numerApartamento = numerApartamento;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "id=" + id +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", documento='" + documento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", CuentaBancaria='" + CuentaBancaria + '\'' +
                ", numerApartamento=" + numerApartamento +
                '}';
    }
}
