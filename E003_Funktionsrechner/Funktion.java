package E003_Funktionsrechner;

public abstract class Funktion {
    
    protected double a;
    protected double b;
    protected double c;
    protected double xMin;
    protected double xMax;

    public abstract double berechneFunktionswert();
    
    public double berechneFlache(int n){
        return -1;
    }

    public void setzeParameter (double pa, double pb, double pc){
        a=pa;
        b=pb;
        c=pc;
    }

    public void setzeGrenzen (double min, double max){
        xMin = min;
        xMax = max;
    }
}
