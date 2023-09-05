//single inheritance
import java.util.*;
public class inheritance
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter x:");
        float x= obj.nextFloat();
        System.out.println("Enter y:");
        float y= obj.nextFloat();
        System.out.println("Enter z:");
        float z= obj.nextFloat();
        point2D CLS = new point2D();
        point3D cls= new point3D();
        CLS.setx(x);
        CLS.sety(y);
        CLS.setXY(CLS.getx(),CLS.gety());
        System.out.println("XY: " + CLS);
        cls.setz(z);
        cls.setXYZ(CLS.getx(),CLS.gety(),cls.getz());
        System.out.println("XYZ:" + cls);
    }
}
class point2D
{
    private float x,y;
    float[] XY = new float[2];
    point2D()
    {
        x=1.0f;
        y=2.0f;
    }
    point2D(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    void setx(float a)
    {
        x=a;
    }
    public float getx()
    {
        return x;
    }
    void sety(float b)
    {
        y=b;
    }
    public float gety()
    {
        return y;
    }
    void setXY(float a, float b)
    {
        XY[0]=a;
        XY[1]=b;
    }
    float[] getXY()
    {
        return XY;
    }
    public String toString()
    {
        return Arrays.toString(getXY());
    }           
}
class point3D extends point2D
{
    private float z;
    float[] XYZ = new float[3]; 
    point3D()
    {}
    point3D(float a, float b, float c)
    {
       point2D obj1 = new point2D();
       obj1.setx(a);
       obj1.sety(b);
       z=c;
    }     
    void setXYZ(float a, float b, float c)
    {
        XYZ[0]=a;
        XYZ[1]=b;
        XYZ[2]=c;
    }
    void setz(float c)
    {
        z=c;
    }
    public float getz()
    {
        return z;
    }
    public float[] getXYZ()
    {
        return XYZ;
    }
    public String toString()
    {
        return Arrays.toString(getXYZ());
    }
} 
