
public class ArmstrongNumbers {
	
	public static boolean isArmstrongNumber(int number) {
        int sum = 0;
        String num = number + "";
        int numlenth = num.length();
        int numcopy = number;

        if(numcopy>0) {
            while (numcopy !=0) {
                int temp = numcopy % 10;
                sum += (int) Math.pow(temp, numlenth);
                numcopy = numcopy / 10;
            }
        }else { return false;}
        return sum==number;
    }
}

