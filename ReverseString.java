public class ReverseString {

    public static void main(String[] args) {
        String input = "Speechify" ;
        String Reversed = new StringBuilder (input).reverse().toString();
        System.out.println("Original " + input);
        System.out.println("Reversed " + Reversed);
    }
}