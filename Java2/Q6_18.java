class Q6_18 {
    static boolean isNumber(String str) {
        int check=0;
        // System.out.println("str길이" + str.length());
        for(int i=0 ; i<str.length() ; i++ ) {
            // System.out.println(str.charAt(i));
            if(str.charAt(i) == '0' || str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4' || str.charAt(i) == '5' || str.charAt(i) == '6' || str.charAt(i) == '7' || str.charAt(i) == '8' || str.charAt(i) == '9'){
                check++;
                // System.out.println(check);
            }
        }
        if(check == str.length()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "3212";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}