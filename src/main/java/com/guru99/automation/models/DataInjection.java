package com.guru99.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("es-ES"));

    private String nombre, fechaNacimiento, direccion, ciudad, departamento, codigoPostal, numeroTelefonico, correo, clave;

    public DataInjection(){
        this.nombre = "Cristian Tautiva";
        this.correo = faker.internet().emailAddress();
        //this.birthday = faker.date().birthday().toString();
        this.fechaNacimiento = "13/09/1996";
        this.departamento = "Norte de Santander";
        this.ciudad = "Los Patios";
        this.numeroTelefonico = Integer.toString(faker.number().numberBetween(1000000000,1999999999));
        this.codigoPostal = "541010";
        this.direccion = "Calle 30 AV 1 ";
        this.clave = faker.internet().password();

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
