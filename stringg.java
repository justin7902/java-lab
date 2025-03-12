class stringg{
    public static void main(String[] args) {
        String str="Java Programming";
        System.out.println("The String is " +str);
        System.out.println("Length of the String is " +str.length());
        System.err.println("Character at Second and Fourth Position is " +str.charAt(1)+str.charAt(5));
        System.out.println("The substring using start index only is " +str.substring(5));
        System.out.println("The substring using start index only is " +str.substring(0,4));
    }
}