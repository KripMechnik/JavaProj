package Pr7;

public class MathFunc implements MathCalculable{
    @Override
    public double degree(double number, int degree) {
        double res = 1;
        if (degree == 0){
            return res;
        } else if(degree < 0){
            res = 1/number;

            for(int i = 0; i < Math.abs(degree)-1; i++){
                res /= number;
            }
            return res;
        } else {
            res = number;
            for (int i = 0; i < degree - 1; i ++){
                res *= number;
            }
            return res;
        }
    }

    @Override
    public double module(double number) {
        return Math.abs(number);
    }

    @Override
    public double circleLength(double radius){
        return 2*Pi*radius;
    }
}
