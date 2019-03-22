package workshop.tests.exercises;

import service.MathService;

public class MathApp {

    private MathService mathService = new MathService();

    public void setMathService(MathService mathService) {
        this.mathService = mathService;
    }

    public double multiply (double a, double b){
        return mathService.multiply(a,b);
    }
}
