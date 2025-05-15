public class Participante {
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String correo;
    private String nacionalidad;
    private boolean certificadoMedico;
    private boolean aceptoTerminos;

    public Participante(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Participante(String nombre, int edad, String telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }
    public Participante(String nombre, String apellido, int edad, String telefono, String correo, String nacionalidad, boolean certificadoMedico, boolean aceptoTerminos){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.nacionalidad = nacionalidad;
        this.certificadoMedico = certificadoMedico;
        this.aceptoTerminos = aceptoTerminos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isCertificadoMedico() {
        return certificadoMedico;
    }

    public void setCertificadoMedico(boolean certificadoMedico) {
        this.certificadoMedico = certificadoMedico;
    }

    public boolean isAceptoTerminos() {
        return aceptoTerminos;
    }

    public void setAceptoTerminos(boolean aceptoTerminos) {
        this.aceptoTerminos = aceptoTerminos;
    }
    public boolean cumpleRequisitos(){
        return (edad >= 18 && edad <= 50) && certificadoMedico && aceptoTerminos;
    }
    public void mostrarDatos(){
        if(cumpleRequisitos()){
            System.out.println("----- Participante Aceptado -----");
            System.out.println("Nombre: "+nombre+" "+apellido);
            System.out.println("Edad: "+edad);
            System.out.println("Telefono: "+telefono);
            System.out.println("Nacionalidad: "+nacionalidad);
        } else {
            System.out.println("----- Participante No Aceptado -----");
            System.out.println("El participante no cumple con los requisitos para la carrera");
        }
        System.out.println();
    }
}
