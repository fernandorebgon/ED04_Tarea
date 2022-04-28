package cuentas;

public class CCuenta {

    /**
     *
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *Constructor vacio
     */
    public CCuenta() {
    }

    /**
     *Constructor con todos los parametros
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     *
     * @return estado (double)
     */
    public double estado() {
        return saldo;
    }

    /**
     * funcion de ingresar una cantidad
     * @param cantidad (double)
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * funcion para retirar una cantidad
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * get nombre
     * @return nombre String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * set nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return cuenta (String)
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     *set cuenta
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * get saldo
     * @return saldo double
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * set saldo
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * get tipo de interes
     * @return tipo interes (double)
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *set tipo de interes
     * @param tipoInterés (double)
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

}
