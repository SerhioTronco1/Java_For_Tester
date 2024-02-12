import java.io.File;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world");

        var configfile = new File("sandbox/build.gradle");
        System.out.println(configfile.getAbsolutePath());
        System.out.println(configfile.exists());




    }
}
