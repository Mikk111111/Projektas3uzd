import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EX18();
    }
    //==============================================================
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static int EX1(int a, int b)
    {
        return a+b;
    }

    public static double EX2()
    {
        return 9.8596;
    }

    public static int EX3(int a,int b)
    {
        return a*b;
    }

    public static void EX4(int arr[])
    {
        for(int i = 0; i < arr.length ; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    public static int[] EX5()
    {
        int arr[] = new int[5];
        for(int i = 0; i < arr.length ; i++)
        {
            arr[i] = (int) Math.round(Math.random()*5);
        }
        return arr;
    }

    public static int EX6(int arr[])
    {
        int sum = 0;
        for(int i = 0; i < arr.length ; i++)
        {
            sum+=arr[i];
        }
        return sum;
    }

    public static double EX7(int arr[])
    {
        int sum = 0;
        for(int i = 0; i < arr.length ; i++)
        {
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    public static void EX8(int a,int b)
    {
        for(int i = 0; i < a ; i++ ){
            for(int j = 0; j < b ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public  static void EX9(String sentence)
    {
        String sentNew = sentence.replace(" ","");
        String[] arrS = sentNew.split("");
        System.out.println("Letters: "+sentNew.length()+", Spaces: "+(sentence.length()-sentNew.length()));
    }

    public  static void EX10(String sentence)
    {
        String[] arrS = sentence.split("");
        System.out.println("ilgia: "+arrS.length);
        for(int i = arrS.length-1; i >= 0 ; i--)
        {
            System.out.print(arrS[i]);
        }
    }

    public  static void EX11(String sentence)
    {
        System.out.println("---"+sentence+"---");
    }

    public  static void EX12(int amount)
    {
        String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String[] arrAlp = alphabet.split("");
        String[] arrMain = new String[amount];
        boolean isInBracket = false;
        for(int i=0;i<amount;i++) {
            arrMain[i] = arrAlp[(int) Math.floor(Math.random() * alphabet.length())];
        }
        for(int i=0;i<amount;i++)
        {
            if (isNumeric(arrMain[i]))
            {
                if(isInBracket)
                {
                    if (i+1 != amount && isNumeric(arrMain[i + 1]))
                    {
                        System.out.print(arrMain[i]);
                    }
                    else
                    {
                        System.out.print( arrMain[i] +"]_");
                        isInBracket=false;
                    }
                }
                else
                {
                    System.out.print("["+arrMain[i]);
                    if (i+1 != amount && isNumeric(arrMain[i + 1]))
                    {
                        System.out.print(arrMain[i]);
                        isInBracket=true;
                    }
                    else
                    {
                        System.out.print( "]_");
                        isInBracket=false;
                    }
                }
            }
            else System.out.print(arrMain[i] + "_");
        }
    }

    public static int EX13(int x)
    {
        int amount = 0;
        for(int i = 2 ;i<x;i++)
        {
            if(x%i==0)
            {
                amount++;
            }
        }
        return amount;
    }

    /**
     *
     * @param size
     * @return Array sorted by EX13
     */
    public static int[] EX14(int size)
    {
        int[] arr = new int[size];
        for(int i = 0 ;i<arr.length;i++)
        {
            arr[i] = (int) Math.round(Math.random()*44+33);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (EX13(arr[j]) < EX13(arr[i])) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0 ;i<arr.length;i++)
        {
            System.out.println("Number: "+arr[i]+":"+EX13(arr[i]));
        }
        return arr;
    }
    public static int EX15(int size) {
        int[] arr = new int[size];
        int amount = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 444 + 333);
        }
        for(int i = 0 ;i<arr.length;i++)
        {
            if(EX13(arr[i])==0)
            {
                amount++;
            }

        }
        for(int i = 0 ;i<arr.length;i++)
        {
            System.out.println("Number: "+arr[i]+":"+EX13(arr[i]));
        }
        System.out.println("Prime found: "+amount);
        return amount;
    }

    public static  ArrayList<Integer> EX18()
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add( (int) Math.ceil(Math.random()*33) );
        arr.add( (int) Math.ceil(Math.random()*33) );
        arr.add( (int) Math.ceil(Math.random()*33) );
        boolean isPrimeLast = true;
        while(isPrimeLast)
        {

        }
        return arr;
    }

}