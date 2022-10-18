/**
 * 
 */
package es.sacyl.java817.ejemplos.comparators;

/**
 * @author andres
 *
 */
public class PacienteBean {

	private int id;
	private int nhc;
	private String CIPA;
	private String nombre;
	private String apellidos;
	/**
	 * 
	 */
	public PacienteBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	public PacienteBean(int id, int nhc, String cIPA, String nombre, String apellidos) {
		super();
		this.id = id;
		this.nhc = nhc;
		CIPA = cIPA;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nhc
	 */
	public int getNhc() {
		return nhc;
	}
	/**
	 * @param nhc the nhc to set
	 */
	public void setNhc(int nhc) {
		this.nhc = nhc;
	}
	/**
	 * @return the cIPA
	 */
	public String getCIPA() {
		return CIPA;
	}
	/**
	 * @param cIPA the cIPA to set
	 */
	public void setCIPA(String cIPA) {
		CIPA = cIPA;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * Devuelve String con todos los datos
	 */
	public String toString() {
		return String.join(", ", ""+this.id, ""+this.nhc, this.CIPA, this.nombre, this.apellidos);
	}
}
