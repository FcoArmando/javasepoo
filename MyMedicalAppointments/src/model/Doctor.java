package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Usuario {

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Atribbutos
    private String especialidad;

    public Doctor(String name, String email){
        super(name,email);
        //System.out.println("El nombre del doctor asignado es: " + name);
        //this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Especialidad: " + especialidad + "\nAvailable " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Oncología");
    }

    //comportamientos
    ArrayList <AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment (String date, String time){

        availableAppointments.add(new AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public void setId(int id) {
            this.id = id;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
        }

        public String getTime() {
            return time;
        }

        public AvailableAppointment(String date, String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;

        }

        @Override
        public String toString() {
            return "Available Apppointments \nDate: " + date + "\nTime: " + time;
        }
    }
}
