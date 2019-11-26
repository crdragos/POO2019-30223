import java.awt.*;

public class Masina implements Cloneable {
    private String marca;
    private Color culoare;

    public Masina(String marca, Color color) {
        this.marca = marca;
        this.culoare = color;
    }

    public String getMarca() {
        return this.marca;
    }

    public Color getCuloare() {
        return this.culoare;
    }

    public void repaint(Color newColor) {
        this.culoare = newColor;
    }

    @Override
    public String toString() {
        return "masina marca " + this.getMarca() + " de coloare " + this.getCuloare();
    }

    @Override
    public Masina clone() throws CloneNotSupportedException {
        return (Masina) super.clone();
    }
}
