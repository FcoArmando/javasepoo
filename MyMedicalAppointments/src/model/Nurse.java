package model;

public class Nurse extends Usuario{
    private String especialidad;

    public Nurse(String nombre, String email) {
        super(nombre, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Verde");
        System.out.println("Departamentos: Nutrición, Pediatría");
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
