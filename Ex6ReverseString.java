public class Ex6ReverseString {
    public static void main(String[] args) {
        String str = "string this of word the reverse";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }

}
