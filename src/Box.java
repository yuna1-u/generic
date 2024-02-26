public class Box<T> {
    private int num;

    public static <T> Box<T> method(int num) {
        return new Box<>(num);

    }

    public Box(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Box{" +
                "num=" + num +
                '}';
    }
}
