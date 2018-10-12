public class Sqrt {

    double arg;
    double delta=0.00000001;

    Sqrt(double arg) {
        this.arg=arg;
    }
    double average(double x,double y) {
        return (x+y)/2.0;
    }
    boolean good(double guess,double x) {
        return Math.abs(guess*guess-x)<delta;
    }
    double improve(double guess,double x) {
        return average(guess,x/guess);
    }
    double iter(double guess, double x) {
        if(good(guess,x))
            return guess;
        else
            return iter(improve(guess,x),x);
    }
    public double calc(int acc) {
        delta = Math.pow(10, -acc);
        return iter(1.0,arg);
    }
}