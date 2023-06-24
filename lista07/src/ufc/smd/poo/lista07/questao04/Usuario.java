package ufc.smd.poo.lista07.questao04;

public class Usuario {
    private static int proximoId = 1;
    private final int identificador;

    public Usuario() {
        this.identificador = proximoId;
        proximoId++;
    }

    public int getIdentificador() {
        return identificador;
    }
    
    public static void main(String[] args) {
    	Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();
        Usuario usuario3 = new Usuario();

        System.out.println("Identificador do usuário 1: " + usuario1.getIdentificador());
        System.out.println("Identificador do usuário 2: " + usuario2.getIdentificador());
        System.out.println("Identificador do usuário 3: " + usuario3.getIdentificador());
    
	}
}

