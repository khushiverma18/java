class string_q{
    public static void main(String[] args){
        String s1="hy buddy";
        String s2="hello buddy";
        System.out.println(s1.toUpperCase());
         System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.endsWith(s2));
        System.out.println(s2.length());
        System.out.println(s2.replace('o','y'));
        System.out.println(s1.trim());
        System.out.println(s2.compareToIgnoreCase(s1));
        if(s1==s2){
            System.out.println("equal");
        }
            else{
                System.out.println("not equal");
            }

        }
    }
