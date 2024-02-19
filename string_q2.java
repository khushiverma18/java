class string_q2{
    public static void main(String[] arg){
        //convert string to lowercase
        String sc="KHUSHI VERMA";
        System.out.println(sc.toLowerCase());

        //replace space with undererscore
        String sc1="mca 2sem";
        System.out.println(sc1.replace(" ","_"));

        //
        String sc2="khushi";
        System.out.println("my name is"+ sc2);

        //detect double or triple space
        String sc3="this string is  contains double   or     triple space";
        System.out.println(sc3.indexOf("  "));
        System.out.println(sc3.indexOf("   "));

        //format letter using escape sequence character
        String letter=" dear tommy,\n\t this java course is so nice.\n thanks!";
        System.out.println(letter);
    }
}