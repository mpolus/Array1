public class Main {

    private Main(){

    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6, 7, 8, 11, 14, 17, 22};

        int min = Integer.MAX_VALUE;

        for (int number : numbers){
            min = Math.min(min, number);
        }
        System.out.println("Minimum value: " + min);




        int max = Integer.MIN_VALUE;
        for (int number : numbers){
            max = Math.max(max, number);
        }
        System.out.println("Maximum value: " + max);




        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        System.out.println("Sum: " + sum);


        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);



        for (int number : numbers){
            if (number % 2 == 0){
                System.out.println("Even number:" + number);
            }
        }


    }
}
