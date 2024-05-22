package trabajoPractico4;

public class CuentaCorriente extends Cuenta {

    private float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
	super(saldo, tasaAnual);

    }

    public float getSobregiro() {
	return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
	this.sobregiro = sobregiro;
    }

    @Override
    public String toString() {
	return "CuentaCorriente [sobregiro=" + sobregiro + "]";
    }

    // no puedo lograr que me descuente el sobregiro
    @Override
    public void consignar(int cantidad) {
	super.consignar(cantidad);
	if (sobregiro < 0) {
	    setSaldo((float) cantidad - sobregiro);

	}

    }

    @Override
    public void retirar(float cantidad) {

	if (getSaldo() < cantidad) {
	    setSaldo((float) getSaldo() - cantidad);
	    sobregiro = cantidad;
	} else {
	    System.out.println("cuenta inactiva");
	}
	super.retirar(cantidad);
    }

    // extracto mensual no lo pude hacer no se que poner en el return aca

    public String imprimir() {
	return "Su saldo es: " + getSaldo() + "\n" + "la Cantidad de depositos es: " + getNumeroConsignaciones() + "\n"
		+ "la cantidad de extracciones es " + getNumeroRetiros() + "\n" + "la tasa Anual es: " + getTasaAnual()
		+ "\n" + "la comision Mensual es: " + getComisionMensual() + "";
    }

}
