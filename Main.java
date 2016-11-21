import java.util.Scanner;
/**
 * Created by sing_ on 11/17/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of image file: ");
        String inputFile = sc.nextLine();
        System.out.print("Enter name of output file: ");
        String outputFile = sc.nextLine();

        PPM image = new PPM(inputFile);

        System.out.println("\nHere are your choices: ");
        System.out.println("\t[1]  convert to greyscale [2]  flip horizontally");
        System.out.println("\t[3]  negative of red [4]  negative of green [5]  negative of blue");
        System.out.println("\t[6]  just the reds   [7]  just the greens   [8]  just the blues");

        System.out.println("Do you want [1]? (y/n)\t");
        String input = sc.nextLine();
        if(input.equals("y")){
            image.grey_scale();
        }

        System.out.println("Do you want [2]? (y/n)\t");
        input = sc.nextLine();
        if(input.equals("y")){
            image.flip_horizontally();
        }

        System.out.println("Do you want [3]? (y/n)\t");
        input = sc.nextLine();
        if(input.equals("y")){
            image.negate_red();
        }

        System.out.println("Do you want [4]? (y/n)\t");
        input = sc.nextLine();
        if(input.equals("y")){
            image.negate_green();
        }

        System.out.println("Do you want [5]? (y/n)\t");
        input = sc.nextLine();
        if(input.equals("y")){
            image.negate_blue();
        }

        System.out.println("Do you want [6]? (y/n)\t");
        input = sc.nextLine();
        if(input.equals("y")){
            image.flatten_red();
        }

        System.out.println("Do you want [7]? (y/n)\t");
        input = sc.nextLine();
        if(input.equals("y")){
            image.flatten_green();
        }

        System.out.println("Do you want [8]? (y/n)\t");
        input = sc.nextLine();
        if(input.equals("y")){
            image.flatten_blue();
        }

        try {
            image.print(outputFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
