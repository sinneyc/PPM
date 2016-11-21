/**
 * Created by sing_ on 11/17/2016.
 */
public class Pixel {
    int red;
    int green;
    int blue;

    //Default
    public Pixel(){
        red = 0;
        blue = 0;
        green = 0;
    }
    //normal
    public Pixel(int r,int g,int b){
        red = r;
        blue = b;
        green = g;

    }

    //accessor- use it for later
    public int getRed(){
        return red;
    }

    public int getBlue(){
        return blue;
    }
    public int getGreen(){
        return green;
    }

    //mutator-change value
    public void setRed(int r){
        red = r;
    }
    public void setGreen(int g){
        green = g;
    }
    public void setBlue(int b){
        blue = b;
    }

    public void display(){

        System.out.println(red + blue + green);
    }


}
