class string_q2{
    public static void main(String[] arg){
        String s="123456.5445";
        boolean numeric =true;
        try{
            double num=Double.parseDouble(S);
        }
        catch(NumberFormatException e){
            numeric =false;
        }
        if(numeric)
        System.out.println(s+"is number");
        else
        System.out.println(s+"is not");
    }
}
