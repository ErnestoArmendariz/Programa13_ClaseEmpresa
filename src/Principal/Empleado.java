package Principal;

public class Empleado {

    private String nombre;
    private String materno;
    private double smensual;
    private String mdatos;
    private String nuevosdatos;

    public Empleado() {
    }

    public Empleado(String nombre, String materno, double smensual) {
        this.nombre = nombre;
        this.materno = materno;
        this.smensual = smensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public double getSmensual() {
        return smensual;
    }

    public void setSmensual(double smensual) {
        this.smensual = smensual;
    }

    public String getMdatos() {
        String mnombre = nombre;
        String mmaterno = materno;
        double msmensual = smensual;
        String mostrarsmensual = String.valueOf(smensual);
        mdatos = nombre + "\n" + materno + "\n" + smensual;

        return mdatos;
    }

    public void setMdatos(String mdatos) {
        this.mdatos = mdatos;
    }

    public String getNuevosdatos() {
        String mnombre = nombre;
        String mmaterno = materno;
        double msmensual = smensual;
        double unosmensual = msmensual*0.10;
        double dossmensual = smensual + unosmensual;
        String mostrarsmensual = String.valueOf(dossmensual);
        nuevosdatos = nombre + "\n" + materno + "\n" + dossmensual;
        return nuevosdatos;
    }

    public void setNuevosdatos(String nuevosdatos) {
        this.nuevosdatos = nuevosdatos;
    }

    
    
}
