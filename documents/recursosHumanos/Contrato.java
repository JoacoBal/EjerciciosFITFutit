package FutitEjTecnicos.documents.recursosHumanos;

public class Contrato implements Documento{ //Definimos los atributos de contrato
    
    private int dniEmpleado;
    private String cargoEmpleado;
    private float sueldoEmpleado;
    private String nombreEmpresa; 

    //Definimos el constructor
    public Contrato(int dniEmpleado, String cargoEmpleado, float sueldoEmpleado, String nombreEmpresa){
        this.dniEmpleado = dniEmpleado;
        this.cargoEmpleado = cargoEmpleado;
        this.sueldoEmpleado = sueldoEmpleado;
        this.nombreEmpresa = nombreEmpresa;
    }

    //Definimos los getters

    public int getDniEmpleado(){
        return dniEmpleado;
    }

    public String getCargoEmpleado(){
        return cargoEmpleado;
    }

    public float getSueldoEmpleado(){
        return sueldoEmpleado;
    }

    public String getNombreEmpresa(){
        return nombreEmpresa;
    }

    @Override //Sobreescribimos el metodo toString para mostrar el contrato
    public String toString(){
        return("La persona con DNI "+this.dniEmpleado+ " con cargo "+this.cargoEmpleado+" posee un sueldo de $"+this.sueldoEmpleado+" en la empresa "+this.nombreEmpresa);
    }

    @Override //Sobreescribimos el metodo mostrarDocumento para que muestre lo que corresponde
    public void mostrarDocumento(){
        System.out.println("Mostrar Contrato: "+"\nDNI Empleado: "+getDniEmpleado()+"\nCargo: "+getCargoEmpleado()+
        "\nSueldo: $"+getSueldoEmpleado()+"\nEmpresa: "+getNombreEmpresa());
    }

}
