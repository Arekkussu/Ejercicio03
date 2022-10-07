package com.ufv.ejemplo03;

public class Persona {
    private String nombre;
    private String apellidos;
    private int dni;
    private int edad;

    //SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //GET
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }
}
