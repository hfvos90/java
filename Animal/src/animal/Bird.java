/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author hansvos
 */
public class Bird extends Animal1 {
    
    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }
    public void fly(){
        System.out.println("Flying...");
    }
}
