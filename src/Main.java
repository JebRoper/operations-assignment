public class Main {

    public static void main(String[] args) {
        System.out.println("begin");

        System.out.println("something else");


        for (int i = 0; i < args.length; ++i) {
            System.out.println("aarg " + args[i]);
        }

        int num = Integer.parseInt(args[0]);

        if (num > 60) {
            System.out.println("If the number is greater than 60");
        } else {
            System.out.println("If it is not greater than 60");
        }


        int num2 = Integer.parseInt(args[1]);

        switch (num2) {
            case 2300:
                System.out.println("The amount is 2300");
                break;
            case 2230:
                System.out.println("The amount is 2230");
                break;
            default:
                System.out.println("The amount is neither 2300 or 2230");
        }

        int num3 = Integer.parseInt(args[2]);

        int repeat = 0;
        do {
            System.out.print(".");
            ++repeat;
        } while (repeat <= num3);

        int math = num + num2 - num3;
        System.out.println(math);

        int remainder = num2 % num3;
        System.out.println(remainder);


        if (num2 > num3) {
            System.out.println("num2 is greater than num3 ");
        } else {
            System.out.println("num2 "+num2 +" is less than num3 " +num3 );
        }

    }



}



