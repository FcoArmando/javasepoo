package model;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

public abstract class Usuario {
    private int id;
    private String name;
    private String email;
    private String direccion;
    private String phoneNumber;

    public Usuario(String nombre, String email) {
        this.name = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String numeroTelefono) {

        if(phoneNumber.length() != 8){
            System.out.println("Asigna un número telefónico de 8 digitos");
        }else if(phoneNumber.length()==8){
            this.phoneNumber = phoneNumber;
        }
        this.phoneNumber = numeroTelefono;
    }
    public String toString(){
        return "User: " + name + ", Email: " + email + "\nAddress: " + direccion + ". Phone: " + phoneNumber;
    }

    public abstract void showDataUser();
}
