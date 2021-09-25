package aseguradora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int op;
		do {
		System.out.println("**********Aseguradora Del Sur**********");
		System.out.println("1.Ingresar Póliza");
		System.out.println("2.Actualizar Valor");
		System.out.println("3.Consultar Póliza");
		System.out.println("4.Imprimir Reporte");
		System.out.println("5.SALIR");
		System.out.println("Seleccione su opción: ");
		op = in.nextInt();
		
        List<Poliza> listBan = new ArrayList<Poliza>();
			
		
		switch (op) {
		case 1:
			System.out.println("a. Póliza general");
			System.out.println("b. PólizaVip");
			System.out.println("Seleccione una opcion: ");
			String opcion = in.next();
		switch (opcion) {
		case "a":
			for (int i = 0; i<3;i++) {
			System.out.println("Ingrese el nombre: ");
			String nombre = in.next();
			System.out.println("Ingrese la descripción: ");
			String descripcion = in.next();
			System.out.println("Año de vigencia: ");
			String anioVigencia = in.next();
			System.out.println("codigo de poliza: ");
			String codigoPoliza = in.next();
			System.out.println("valor de poliza: ");
			int valorPoliza = in.nextInt();
			System.out.println("Codigo de descuento: ");
			String codigoDescuento = in.next();
			System.out.println("Numero de seguro: ");
			String numeroSeguro = in.next();
			
				Poliza poliza = new Poliza();
				poliza.setNombre(nombre);
				poliza.setAnioVigencia(anioVigencia);
				poliza.setCodigoPoliza(codigoPoliza);
				poliza.setValor(valorPoliza);
				listBan.add(poliza);
			}
			break;
		case "b": 
			for (int i = 0; i<3;i++) {
			System.out.println("Ingrese el nombre: ");
			String nombre2 = in.next();
			System.out.println("Ingrese la descripción: ");
			String descripcion2 = in.next();
			System.out.println("Año de vigencia: ");
			String anioVigencia2 = in.next();
			System.out.println("codigo de poliza: ");
			String codigoPoliza2 = in.next();
			System.out.println("valor de poliza: ");
			int valorPoliza2 = in.nextInt();
			System.out.println("Beneficio: ");
			String beneficio = in.next();
			
			Poliza poliza = new Poliza();
			poliza.setNombre(nombre2);
			poliza.setAnioVigencia(anioVigencia2);
			poliza.setCodigoPoliza(codigoPoliza2);
			poliza.setValor(valorPoliza2);
			listBan.add(poliza);
		}
			break;
		}
		default:
		System.out.println("opcion no valida");
		break;
		case 2:
			System.out.println("Ingrese el codigo de la póliza: ");
			String codigoPoliza = in.next();
			
			
		break;
		case 3:
			System.out.println("Ingrese el codigo de la póliza: ");
			String codigoPoliza2 = in.next();
		
		break;
		case 4:
			Poliza poli = listBan.get(0);
			System.out.println(poli);
			
			
			for (int i=0; i<listBan.size();i++) {
				Poliza poli1 = listBan.get(i);
				System.out.println(poli1);
			}		
		break;
		case 5:
			System.out.println("Cerrando el sistema...");
		}
		
		}while (op!= 5);
		System.out.println("Gracia por prefrirnos");
		
	}

}
