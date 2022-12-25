import model.*;
import static ui.UIMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        showMenu();

        /*Doctor miDoctor = new Doctor("Francisco Armando", "fco@gmail.com");
        miDoctor.addAvailableAppointment(new Date(), "4pm");
        miDoctor.addAvailableAppointment(new Date(), "10am");
        miDoctor.addAvailableAppointment(new Date(),"1pm");

        Usuario user = new Doctor("Pedro","pedro@mail.com");
        user.showDataUser();

        Usuario userpa = new Patient("Francisco","armando@mail.com");
        userpa.showDataUser();

        Usuario user1 = new Usuario("Karla","karla@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Verde\n");
                System.out.println("Departamento: Geriatría");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        /*for (model.Doctor.AvailableAppointment availableAppointment: miDoctor.availableAppointments){
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }*/

       /* Patient paciente = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(paciente);
        System.out.println(miDoctor);*/

    }
}