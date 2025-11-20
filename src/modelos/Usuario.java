package modelos;

public abstract class Usuario 
{
	private int id;
	private String nombre;
	private String apellido;
    private String telefono;
    private String rol;
    
    public Usuario(int id, String nombre, String apellido, String telefono, String rol)
    {
    	this.id = id;
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.telefono = telefono;
    	this.rol = rol;
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
    
    

}
