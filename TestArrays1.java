package Arrays;

public class TestArrays1 {

	public static void main(String[] args) {
       int [] numbers;
       numbers = new int[6];
       
       numbers[0] = 10;
       numbers[1] = 20;
       numbers[2] = 30;
       numbers[3] = 40;
       numbers[4] = 50;
       numbers[5] = 60;
       numbers[6] = 70;
       numbers[7] = 80;
       numbers[8] = 90;
       numbers[9] = 100;
       numbers[9] = 110;
       numbers[9] = 120;
       numbers[9] = 130;
       numbers[9] = 140;
       numbers[9] = 150;
       

//       System.out.println(numbers[0]);
//       System.out.println(numbers[1]);
//       System.out.println(numbers[2]);
//       System.out.println(numbers[3]);
//       System.out.println(numbers[4]);
//       System.out.println(numbers[5]);
       for (int i = 0; i<numbers.length; i++) {
    	   System.out.print(numbers[i] + " ");
       }
	}

}
