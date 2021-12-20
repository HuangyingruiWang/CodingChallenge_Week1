package com.revature;

public class CodingChallenge_Week1 {
    /*
    A pronic number (or otherwise called as heteromecic) is a
    number which is a product of two consecutive integers, that is,
     a number of the form n(n + 1). Create a function that determines
      whether a number is pronic or not.
     */
    public static boolean isHeteromecic(int num){
        int base = 0;
        int product = 0;
        while(product <= num){
            product = base * (base + 1);
            if(product == num){
                return true;
            }else {
                base++;
            }
        }
        return false;
    }

    /*
    Given any number, we can create a new number by adding
     the sums of squares of digits of that number.
     For example, given 203, our new number is 4 + 0 + 9 = 13.
     */

    public static void isHappy(int num){
        int tmp = num;
        int sum = 0;
        while(tmp > 0){
            sum += Math.pow(tmp % 10, 2);
            tmp /= 10;
        }
        if (sum == 1){
            System.out.println(true);
        }else if (sum == 4){
            System.out.println(false);
        }else{
            isHappy(sum);
        }
    }

    public static void main(String[] args) {
        System.out.println(isHeteromecic(0));
        System.out.println(isHeteromecic(2));
        System.out.println(isHeteromecic(7));
        System.out.println(isHeteromecic(110));
        System.out.println(isHeteromecic(136));
        System.out.println(isHeteromecic(156));
        System.out.println("------------------------");
        isHappy(203);
        isHappy(11);
        isHappy(107);

    }
}
