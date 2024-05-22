package trabajoPractico4;

public class Cuenta {

    // atributos
    protected float saldo;
    private int numeroConsignaciones;
    private int numeroRetiros;
    private float tasaAnual;
    private float comisionMensual;

    // constructor
    public Cuenta(float saldo, float tasaAnual) {
	this.saldo = saldo;
	this.tasaAnual = tasaAnual;
    }

    // get y set

    public double getSaldo() {
	return saldo;
    }

    public int getNumeroConsignaciones() {
	return numeroConsignaciones;
    }

    public int getNumeroRetiros() {
	return numeroRetiros;
    }

    public double getTasaAnual() {
	return tasaAnual;
    }

    public double getComisionMensual() {
	return comisionMensual;
    }

    public void setSaldo(float saldo) {
	this.saldo = saldo;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
	this.numeroConsignaciones = numeroConsignaciones;
    }

    public void setNumeroRetiros(int numeroRetiros) {
	this.numeroRetiros = numeroRetiros;

    }

    public void setTasaAnual(float tasaAnual) {
	this.tasaAnual = tasaAnual;
    }

    public void setComisionMensual(float comisionMensual) {
	this.comisionMensual = comisionMensual;
    }

    @Override
    public String toString() {
	return "Cuenta [saldo=" + saldo + ", numeroConsignaciones=" + numeroConsignaciones + ", numeroRetiros="
		+ numeroRetiros + ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + "]";
    }

    public void consignar(int cantidad) {
	saldo = saldo + cantidad;

    }

    public void retirar(float cantidad) {
	if (cantidad > saldo) {
	    System.out.println("saldo insuficiente, su saldo es: " + saldo);
	} else {

	    float saldoFinal = saldo - cantidad;

	    System.out.println("Su saldo es: " + saldo + " retira: " + cantidad + "\n" + "saldo final: " + saldoFinal);

	    saldo = saldoFinal;

	    int retirosActuales = getNumeroRetiros();
	    int nuevaCantidadDeRetiros = retirosActuales++;

	    setNumeroRetiros(nuevaCantidadDeRetiros);

	    // Opcion 2
	    // setNumeroRetiros(getNumeroRetiros() + 1);
	}

    }

    public float interesMensual(float tasaAnual) {
	double interesMensual = tasaAnual / 12;
	interesMensual = saldo * interesMensual / 100;
	return saldo += interesMensual;
    }

    public float extractoMensual(float comisionMensual) {
	return saldo = interesMensual(tasaAnual) - comisionMensual;
    }

    public String imprimir() {
	return "Su saldo es: " + saldo + "\n" + "la Cantidad de extracciones es: " + numeroConsignaciones + "\n"
		+ "la cantidad de retiros es " + numeroRetiros + "\n" + "la tasa Anual es: " + tasaAnual + "\n"
		+ "la comision Mensual es: " + comisionMensual + "";
    }

}
