package aseguradora;

public class Poliza {
	
	private String nombre;
	private String anioVigencia;
	private String CodigoPoliza;
	private int valor;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAnioVigencia() {
		return anioVigencia;
	}
	public void setAnioVigencia(String anioVigencia) {
		this.anioVigencia = anioVigencia;
	}
	public String getCodigoPoliza() {
		return CodigoPoliza;
	}
	public void setCodigoPoliza(String codigoPoliza) {
		CodigoPoliza = codigoPoliza;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Poliza [nombre=" + nombre + ", anioVigencia=" + anioVigencia + ", CodigoPoliza=" + CodigoPoliza
				+ ", valor=" + valor + "]";
	}
	
	
	
}
