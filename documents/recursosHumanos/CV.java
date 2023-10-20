package FutitEjTecnicos.documents.recursosHumanos;

public class CV implements Documento{ //Atributos de Curriculum Vitae
    
    private int dniPersonal;
    private String nombreCompleto;
    private int numTelefono;
    private String estudios;
    private String experienciaLaboral;

    //Definimos el constructor
    public CV(int dniPersonal, String nombreCompleto, int numTelefono, String estudios,String experienciaLaboral){
        this.dniPersonal = dniPersonal;
        this.nombreCompleto = nombreCompleto;
        this.numTelefono = numTelefono;
        this.estudios = estudios;
        this.experienciaLaboral = experienciaLaboral;
    }

    //Definimos los getters

    public int getDniPersonal(){
        return dniPersonal;
    }

    public String getNombreCompleto(){
        return nombreCompleto;
    }

    public int getNumTelefono(){
        return numTelefono;
    }

    public String getEstudios(){
        return estudios;
    }

    public String getExperienciaLaboral(){
        return experienciaLaboral;
    }

    @Override //Sobreescribimos el metodo toString para mostrar el CV
    public String toString(){
        return("\nDni: "+this.dniPersonal+"\nNombre completo: "+this.nombreCompleto+"\nNumero de telefono: "+this.numTelefono+
        "\nEstudios: "+this.estudios+"\nExperiencia laboral: "+this.experienciaLaboral);
    }

    @Override //Sobreescribimos el metodo mostrarDocumento para que muestre lo que corresponde
    public void mostrarDocumento(){
        System.out.println("Mostrar CV "+"\nDni: "+getDniPersonal()+"\nNombre completo: "+getNombreCompleto()+
        "\nNumero de telefono: "+getNumTelefono()+"\nEstudios: "+getEstudios()+"\nExperiencia laboral: "+getExperienciaLaboral());
    }

}
