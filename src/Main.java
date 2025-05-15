import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese datos para participar:");
        System.out.print("Nombre: ");
        String nombre1 = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido1 = sc.nextLine();
        System.out.print("Edad: ");
        int edad1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Teléfono: ");
        String tel1 = sc.nextLine();
        System.out.print("Correo: ");
        String correo1 = sc.nextLine();
        System.out.print("Nacionalidad: ");
        String nac1 = sc.nextLine();
        System.out.print("¿Tiene certificado médico? (true/false): ");
        boolean cert1 = sc.nextBoolean();
        System.out.print("¿Aceptó los términos? (true/false): ");
        boolean term1 = sc.nextBoolean();
        sc.nextLine();

        Participante p1 = new Participante(nombre1, apellido1, edad1, tel1, correo1, nac1, cert1, term1);
        p1.mostrarDatos();

        Participante p2 = new Participante("Mario", "Gómez");
        p2.setEdad(16);
        p2.setTelefono("099111222");
        p2.setCorreo("mario@gmail.com");
        p2.setNacionalidad("ecuatoriano");
        p2.setCertificadoMedico(true);
        p2.setAceptoTerminos(true);
        p2.mostrarDatos();

        Participante p3 = new Participante("Pedro", 30, "0987654321");
        p3.setApellido("Mena");
        p3.setCorreo("pedro@gmail.com");
        p3.setNacionalidad("ecuatoriano");
        p3.setCertificadoMedico(true);
        p3.setAceptoTerminos(true);
        System.out.println("----- Participante Actualizado -----");
        p3.mostrarDatos();

        sc.close();
    }
}
