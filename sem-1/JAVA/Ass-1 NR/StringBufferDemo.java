public class StringBufferDemo {
    public static void main(String[] args) {
    
        StringBuffer sb = new StringBuffer();
        sb.append("Nikhil ");
        sb.append("Rathod");
        sb.insert(13, " MCA");
        sb.replace(17, 21, " Sem - 1");
        sb.reverse();
        String result = sb.toString();
        System.out.println(result);
    }
}
