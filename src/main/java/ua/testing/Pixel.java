package ua.testing;


public final class Pixel {
    private final double x;
    private final double y;
    private final Color color;

    public Pixel(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = Color.values()[color.ordinal()];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pixel pixel = (Pixel) o;
        return Double.compare(pixel.x, x) == 0 &&
                Double.compare(pixel.y, y) == 0 &&
                color == pixel.color;
    }

    @Override
    public int hashCode() {
        return (int) ((x * 31 + y) *31 + color.ordinal());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Color getColor() {
        return Color.values()[color.ordinal()];
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }
}