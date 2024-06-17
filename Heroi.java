public class Heroi {
    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque;
        switch (tipo) {
            case "mago":
                ataque = "usou magia";
                break;
            case "guerreiro":
                ataque = "usou espada";
                break;
            case "monge":
                ataque = "usou artes marciais";
                break;
            case "ninja":
                ataque = "usou shuriken";
                break;
            default:
                ataque = "realizou um ataque";
        }
        System.out.println("O " + tipo + " atacou usando " + ataque);
    }

    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Arthur", 30, "guerreiro");
        Heroi heroi2 = new Heroi("Merlin", 150, "mago");
        Heroi heroi3 = new Heroi("Bruce", 25, "monge");
        Heroi heroi4 = new Heroi("Hanzo", 28, "ninja");

        heroi1.atacar();  // Output: O guerreiro atacou usando espada
        heroi2.atacar();  // Output: O mago atacou usando magia
        heroi3.atacar();  // Output: O monge atacou usando artes marciais
        heroi4.atacar();  // Output: O ninja atacou usando shuriken
    }
}
