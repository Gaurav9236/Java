import java.util.Base64;
public class Encode {
    public static void main(String[] args) {
        String name = "Gaurav Yadav";
        String enstr = Base64.getEncoder().withoutPadding().encodeToString(name.getBytes());
        System.out.println(enstr);

    }

    
}
