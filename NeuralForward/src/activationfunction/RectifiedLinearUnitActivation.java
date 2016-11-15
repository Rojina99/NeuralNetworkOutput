/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activationfunction;

/**
 *
 * @author User
 */
public class RectifiedLinearUnitActivation {

    private double input;
    private double a = 1;

    public double get_Relu_Value(double input) {
        this.input = input;
        double relu_activ;
        if(this.input<0)
        {
        relu_activ = this.a * (Math.expm1(this.input));
        }
        else
        {
          relu_activ = input;
        }
        return relu_activ;   

    }
    
    public double get_Relu_Deriv_Value(double input)
    {
        this.input = input;
        double relu_activ;
        double relu_activ_deriv;
        if(this.input<0)
        {
        relu_activ = this.a * (Math.expm1(this.input));
        relu_activ_deriv = relu_activ + a;
        }
        else
        {
          relu_activ_deriv = 1;
        }
        return relu_activ_deriv;
    }
}
