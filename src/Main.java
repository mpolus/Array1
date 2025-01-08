public class Main {

    private Main(){

    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6, 7, 8, 11, 14, 17, 22};

        int min = Integer.MAX_VALUE;

        for (int number : numbers){
            min = Math.min(min, number);
        }


        int max = Integer.MIN_VALUE;
        for (int number : numbers){
            max = Math.max(max, number);
        }

        int sum = 0;
        for (int number : numbers){
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println(average);


    }
}
