package taller3.televisores;

public class TV {
	private static int numTV=0;
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
        this.canal = 1;
        this.precio = 500;
        this.estado = estado;
        this.volumen = 1;
        this.control = null;
        numTV++;
	}
	public String getMarca() {
		return this.marca.nombre;
	}
	public void setMarca(String marca) {
		this.marca.nombre=marca;
	}
	public int getCanal() {
		return this.canal;
	}
	public void setCanal(int numero) {
		if (numero>=1 && numero<=120 && this.estado) {
			this.canal=numero;
		}
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getVolumen() {
		return this.volumen;
	}
	public void setVolumen(int volumen) {
		if (volumen>=1 && volumen<=120 && this.estado) {
			this.volumen=volumen;
		}
	}
	public Control getControl() {
		return this.control;
	}
	public void setControl(Control control) {
		this.control=control;
	}
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int numero) {
		numTV=numero;
	}
	public void turnOn() {
		this.estado=true;
	}
	public void turnOff() {
		this.estado=false;
	}
	public boolean getEstado() {
		return this.estado;
	}
	public void canalUp() {
		if (this.canal<120 && this.estado) {
			this.canal++;
		}
	}
	public void canalDown() {
		if (this.canal>1 && this.estado){
			this.canal--;
		}
	}
	public void volumenUp() {
		if (this.volumen<7 && this.estado) {
			this.volumen++;
		}
	}
	public void volumenDown() {
		if (this.volumen>0 && this.estado){
			this.volumen--;
		}
	}
}
