public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Bruno",30,'M');
        p[1] = new Pessoa("Allan",31,'M');

        l[0] = new Livro("Admirável mundo novo", "Aldous Huxley",309,p[0]);
        l[1] = new Livro("A Republica", "Sócrates",252,p[1]);
        l[2] = new Livro("Pessoa linda", "Idonea",399,p[0]);

        l[0].abrir();
        l[0].folhear(155);
        l[0].voltarPag();
        l[1].abrir();
        l[1].avancarPag();
        l[2].abrir();
        l[2].fechar();

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());

    }
}
