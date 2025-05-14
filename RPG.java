public abstract class Entidade {
    protected int x, y; 
    protected int largura, altura;

    public Entidade(int x, int y, int largura, int altura) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }

    public abstract void atualizar(); 
}

public class Jogador extends Entidade {
    private int moedasColetadas;

    public Jogador(int x, int y) {
        super(x, y, 32, 32);
        this.moedasColetadas = 0;
    }

    public void mover(String direcao) {
    }

    public void coletarMoeda() {
        moedasColetadas++;
    }

    @Override
    public void atualizar() {
    }

    @Override
    public void desenhar(Graphics g) {
    }
}

public class Moeda extends Entidade {
    private boolean coletada;

    public Moeda(int x, int y) {
        super(x, y, 16, 16);
        this.coletada = false;
    }

    public boolean isColetada() {
        return coletada;
    }

    public void coletar() {
        coletada = true;
    }

    @Override
    public void atualizar() {
    }

    @Override
    public void desenhar(Graphics g) {
        if (!coletada) {

        }
    }
}

