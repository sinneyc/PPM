import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by sing_ on 11/10/2016.
 */
public class PPM extends Image {
    Pixel [] [] pixels;

    public PPM(){
        // super(m,w,h,d);
        magic = "";
        width = 0;
        height = 0;
        depth = 0;
    }

    @Override
    public String getMagic() {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getDepth() {
        return 0;
    }

    @Override
    public void setMagic(String m) {

    }

    @Override
    public void setWidth(int w) {

    }

    @Override
    public void setHeight(int h) {

    }

    @Override
    public void setDepth(int d) {

    }

    public PPM(String filename){
        //super(filename);
        //super(m,w,h,d);
        try{
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            magic = sc.nextLine();
            String line = sc.nextLine();

            String [] dimension = line.split(" ");

            width = Integer.parseInt(dimension[0]);
            height = Integer.parseInt(dimension[1]);
            depth = Integer.parseInt(sc.nextLine());
            pixels = new Pixel[height][width];

            for (int i = 0; i < height; i++){
                for (int j = 0; j < width; j++){
                  int r = sc.nextInt();
                  int g = sc.nextInt();
                  int b = sc.nextInt();
                  pixels[i][j] = new Pixel(r,g,b);
                  pixels[i][j].display();
                }
                System.out.println("");

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Could not find file: " + ex);
            //e.printStackTrace();
        }
    }

    public void print(String fn) throws Exception{
        File file = new File(fn);
        PrintWriter writer = new PrintWriter(fn);

        writer.println(magic);
        writer.println(width + " "+ height);
        writer.println(depth);

        for (int i =0;i<pixels.length;i++){
            for (int j = 0; j<pixels[i].length;j++){
                writer.print(pixels[i][j] + " ");
            }
            writer.println();
        }
        writer.close();
    }

    public void negate_red(){
        for (int i =0;i<pixels.length;i++){
            for(int j = 0; j<pixels[i].length;j++){
                int tempRed = pixels[i][j].getRed();
                pixels[i][j].setRed(depth-tempRed);
            }
        }

    }

    public void negate_green(){
        for (int i =0;i<pixels.length;i++){
            for(int j = 0; j<pixels[i].length;j++){
                int tempGrn = pixels[i][j].getGreen();
                pixels[i][j].setRed(depth-tempGrn);
            }
        }

    }

    public void negate_blue() {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                int tempBlue = pixels[i][j].getBlue();
                pixels[i][j].setRed(depth-tempBlue);
            }
        }
    }

    public void flip_horizontally(){
        Pixel horizontal [][] = new Pixel[pixels.length][pixels[0].length];

        for (int i = 0;i<height;i++){
            for(int j= width-1;j>0; j--){
                horizontal [i][width-1-j] = pixels [i][j];
            }
        }
        pixels = horizontal;
    }

    public Pixel [][] getPixels(){
        return this.pixels;
    }

    public void grey_scale(){
        for (int i =0;i<pixels.length;i++){
            for(int j = 0; j<pixels[i].length;j++){
                int gray = (pixels[i][j].getRed() + pixels[i][j].getBlue() + pixels[i][j].getGreen() / 3) * 255;
                pixels[i][j].setRed(gray);
                pixels[i][j].setBlue(gray);
                pixels[i][j].setGreen(gray);
            }
        }
    }

    public void flatten_red(){
        for (int i =0;i<pixels.length;i++){
            for(int j = 0; j<pixels[i].length;j++){
                pixels[i][j].setRed(0);
            }
        }
    }

    public void flatten_green(){
        for (int i =0;i<pixels.length;i++){
            for(int j = 0; j<pixels[i].length;j++){
                pixels[i][j].setGreen(0);
            }
        }
    }

    public void flatten_blue(){
        for (int i =0;i<pixels.length;i++){
            for(int j = 0; j<pixels[i].length;j++){
                pixels[i][j].setBlue(0);
            }
        }
    }


    /*protected String magic;
    protected int width;
    protected int height;
    protected int depth;

    public PGM(String m, int w, int h, int d){
        magic = m;
        width = w;
        height = h;
        depth = d;
    }

    public void display(){
        System.out.print("");
    }


    public abstract void flip_horizontally();
    public abstract void flip_vertically();
    public abstract void rotate_right_9();

*/

}
