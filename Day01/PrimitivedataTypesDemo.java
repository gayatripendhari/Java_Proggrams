public class PrimitivedataTypesDemo{
    public static void main(String[] args) {
        //byte takes 1 byte
        byte byteMax = 127;
        byte byteMin = -127;
        System.out.println("Min in range of byte is "+byteMin+" Max range of byte is "+byteMax);

        //short - 2 bytes
        short shortMax = 32767 ;
        short shortMin = -32767 ;
        System.out.println("Minshort range of short is "+ shortMin + " Maxshort range of short is "+shortMax);

        //int - 4 bytes
        int maxInt = 2147483547;
        int minInt = -2147483648;
        System.out.println("Minint range of byte is "+ minInt + " Maxint range of byte is "+maxInt);

        //long -8bytes
        long maxLong = 92233720368555807L;
        long minLong = -92233720368555807L;
        System.out.println("MinLong  range of byte is"+minLong+" MaxLong rangeof byte is "+maxLong);

        float f = 3234.141243278345f;
        double d = 3456.14124512345678902345678914f;
        System.out.println("float value is "+f+" double is"+d);

        //boolean
        boolean flag = false;
        System.out.println("boolean value is "+flag);
    }
}