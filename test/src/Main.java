//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        try{
            int a = 10;
            int b = 0;
            int c = a - b ;
            System.out.println("Результат " + c);


        }
        catch(ArithmeticException e){
//            throw new ArithmeticException("На 0 делить нельзя");
            System.out.println("Делить на 0 нельзя");

        }
        System.out.println("конец программы");





















        }
}