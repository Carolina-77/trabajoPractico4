package trabajoPractico4;

public class CuentaDeAhorro extends Cuenta {

    private boolean cuentaActiva;

    // constructor
    public CuentaDeAhorro(float saldo, float tasaAnual, boolean cuentaActiva) {
	super(saldo, tasaAnual);
	this.cuentaActiva = cuentaActiva;
    }

    // get y set

    public boolean isCuentaActiva() {
	return cuentaActiva;
    }

    public void setCuentaActiva(boolean cuentaActiva) {
	this.cuentaActiva = cuentaActiva;
    }

    // Metodo toString

    @Override
    public String toString() {
	return "CuentaDeAhorro [cuentaActiva=" + cuentaActiva + "]";
    }

    @Override
    public void consignar(int cantidad) {
	super.consignar(cantidad);

	if (getSaldo() > 10000 && cuentaActiva) {
	    System.out.println("deposita: " + cantidad);
	    setSaldo((float) getSaldo());

	} else {
	    System.out.println(" cuenta Inactiva");
	}

    }

    @Override
    public void retirar(float cantidad) {
	super.retirar(cantidad);
	if (getSaldo() > 10000 && cuentaActiva) {
	    setSaldo((float) getSaldo());
	} else {
	    System.out.println("cuenta inactiva");
	}
    }

    public float extractoMensual(float comisionMensual) {
	super.extractoMensual(comisionMensual);
	if (getNumeroRetiros() > 4)
	    setSaldo((float) getSaldo() - 1000);
	{
	    return (float) getSaldo();
	}
    }

    @Override
    public String imprimir() {
	return "Su saldo es: " + getSaldo() + "\n" + "la Cantidad de depositos es: " + getNumeroConsignaciones() + "\n"
		+ "la cantidad de extracciones es " + getNumeroRetiros() + "\n" + "la tasa Anual es: " + getTasaAnual()
		+ "\n" + "la comision Mensual es: " + getComisionMensual() + "";
    }

}
