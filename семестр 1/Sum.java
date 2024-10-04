public class SumFloatPunct {
    public static void main(String[] args) {
        StringBuilder arr_str = new StringBuilder();
        for (String arg : args) {
            arr_str.append(arg);
            arr_str.append(" ");
        }
        StringBuilder num = new StringBuilder();
        float float_sum = 0;
        int int_sum = 0;
        for (int i = 0; i < arr_str.length(); i++) {
            if (((Character.isWhitespace(arr_str.charAt(i)) == true)
                    || (Character.getType(arr_str.charAt(i)) == 21 || Character.getType(arr_str.charAt(i)) == 22))
                    && num.length() != 0) {
                if (num.toString().contains(".") || num.toString().contains("e")) {
                    float_sum += Float.parseFloat(num.toString());
                } else {
                    int_sum += Integer.parseInt(num.toString());
                }
                num.setLength(0);
            } else if (Character.isWhitespace(arr_str.charAt(i)) == false && (Character.getType(arr_str.charAt(i)) == 21
                    || Character.getType(arr_str.charAt(i)) == 22) == false) {
                num.append(arr_str.charAt(i));
            } else {
                continue;
            }
        }
        if (int_sum != 0) {
            System.out.println(int_sum);
        } else if (float_sum != 0) {
            System.out.println(float_sum);
        } else {
            System.out.println(0);
        }
    }
}
