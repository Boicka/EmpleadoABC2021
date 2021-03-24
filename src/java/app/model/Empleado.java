package app.model;

public class Empleado {

    private int id;

    private String nombre;

    private String apellidos;

    private String puesto;

    private double sueldoBase;

    /**
     * Get the value of sueldoBase
     *
     * @return the value of sueldoBase
     */
    public double getSueldoBase() {
        return sueldoBase;
    }

    /**
     * Set the value of sueldoBase
     *
     * @param sueldoBase new value of sueldoBase
     */
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    /**
     * Get the value of puesto
     *
     * @return the value of puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Set the value of puesto
     *
     * @param puesto new value of puesto
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * Get the value of apellidos
     *
     * @return the value of apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Set the value of apellidos
     *
     * @param apellidos new value of apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

}
