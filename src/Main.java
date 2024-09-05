import model.IPhone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IPhone iphone15 = new IPhone();
        iphone15.play("Evidências");
        iphone15.pause("Evidências");

        iphone15.startCall("11 1234-5678");
        iphone15.blockCall("11 1234-5678");

        iphone15.navigate("Linkedin.com");
        iphone15.download("\'linkedin.com/portifolio\'","\'c:\\user\\temp\\\'");
    }
}