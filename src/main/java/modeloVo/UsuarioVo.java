package modeloVo;

public class UsuarioVo {
	private long cedula_usuario;
    private String email_usuario;
    private String nombre_usuario;
    private String  contrase�a;
    private String usuario;
    
    public UsuarioVo(){}
    public UsuarioVo(long cedula_usuario, String email_usuario, String nombre_usuario,String contrase�a,String usuario){
        this.cedula_usuario=cedula_usuario;
        this.email_usuario=email_usuario;
        this.nombre_usuario=nombre_usuario;
        this.contrase�a=contrase�a;
        this.usuario=usuario;
        
                
        }

    public long getCedula_usuario() {
        return cedula_usuario;
    }

    public String getContrase�a() {
        return contrase�a;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setCedula_usuario(long cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
