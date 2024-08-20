public class String9 {
    public static void main(String[] args) {
        String sentence = "capiTalIze tHe titLee";
        int lastIndex = sentence.lastIndexOf(' ');
        int length = sentence.length() - (lastIndex + 1);
        System.out.println(length);
    }

}
