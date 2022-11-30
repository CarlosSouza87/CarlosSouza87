package singleton;

public class Professor {
    private static String nome;
    private static String cpf;
    private static String grupo;
    private static String email;
    private static Professor uniqueInstance;


    private Professor(String nome, String cpf, String grupo, String email) {
        Professor.nome = nome;
        Professor.cpf = cpf;
        Professor.grupo = grupo;
        Professor.email = email;
    }

    public synchronized static Professor obterPersonagem() {
        if (uniqueInstance == null) {
            uniqueInstance = new Professor(nome, cpf, grupo, email);
        }
        return uniqueInstance;
    }

    void enviarEmail(final String email){
        System.out.println("Olá,eu sou o  "+nome+"! Este é um e-mail na qual entro em contato.");
    }

}

