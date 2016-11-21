/**
 * Created by sing_ on 11/10/2016.
 */
public abstract class Image {
    protected String magic;
    protected int width;
    protected int height;
    protected int depth;
    /*
        public Image(String m, int w, int h, int d){
            magic = m;
            width = w;
            height = h;
            depth = d;
        }
    */
    public Image(){

    }

    public Image(String m, int w, int h, int d){
        // super(m,w,h,d);
        magic = "";
        width = 0;
        height = 0;
        depth = 0;
    }
    public abstract String getMagic();
    public abstract int getWidth();
    public abstract int getHeight();
    public abstract int getDepth();

    public abstract void setMagic(String m);
    public abstract void setWidth(int w);
    public abstract void setHeight(int h);
    public abstract void setDepth(int d);

    /*
        public void display(){
            System.out.print("");
        }


    public abstract void flip_horizontally();
    public abstract void flip_vertically();
    public abstract void rotate_right_9();
*/
}
