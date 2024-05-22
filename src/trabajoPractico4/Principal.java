package trabajoPractico4;

public class Principal {

    public static void main(String[] args) {

	CuentaDeAhorro ca1 = new CuentaDeAhorro(11000, 83, true);

	System.out.println(ca1.getSaldo());
	ca1.consignar(300);
	System.out.println(ca1.getSaldo());
	ca1.retirar(300);
	ca1.retirar(500);
	ca1.retirar(1000);
	ca1.consignar(100000);
	System.out.println(ca1.getSaldo());
	ca1.retirar(1000);
	ca1.retirar(1000);
	System.out.println(ca1.extractoMensual(1000));
	ca1.retirar(10000);
	ca1.retirar(10000);
	System.out.println(ca1.toString());

	CuentaCorriente cc1 = new CuentaCorriente(11000, 85);
	System.out.println(cc1);
	cc1.retirar(15000);
	cc1.consignar(5000);

    }

}
