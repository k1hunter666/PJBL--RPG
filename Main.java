import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

// CLASSE ABSTRATA

abstract class Entidade {
    protected int x, y, largura = 40, altura = 40;

    public Entidade(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void desenhar(Graphics g);

    public int getX() { return x; }
    public int getY() { return y; }
    public Rectangle getBounds() {
        return new Rectangle(x, y, largura, altura);
    }
}

// CLASSES COM HERANÇA

class Personagem extends Entidade {
    private int moedas = 0;

    public Personagem(int x, int y) {
        super(x, y);
    }

    public void mover(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void coletar() { moedas++; }
    public int getMoedas() { return moedas; }
    public void resetarMoedas() { moedas = 0; }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, largura, altura);
    }
}

class Moeda extends Entidade {
    public Moeda(int x, int y) {
        super(x, y);
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(x + 10, y + 10, 20, 20);
    }
}

class Arvore extends Entidade {
    public Arvore(int x, int y) {
        super(x, y);
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(new Color(34, 139, 34));
        g.fillRect(x, y, largura, altura);
    }
}

// Criado as classes Arvore, Moeda, Personagem, Entidade junto com Main.class