public class clockdegree {
    public static void main(String[] args) {
        int h = 10;
        int m = 48;

        int ha = (h % 12) * 30 + (m * 30) / 60;
        int ma = m * 6;

        int angel = Math.abs(ha - ma);
        angel = Math.min(angel, 360 - angel);
        System.out.println("Angel is : "+angel);
    }
}