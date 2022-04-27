package com.bootcamp.solid;
 public class Calculator {
 /*
    public void calculate(Object operation) throws Exception {
        if (operation == null) {
            throw new Exception("Can not perform operation");
        }

        if(operation instanceof  Addition){
             Addition ad = (Addition) operation;
             ad.result = ad.a + ad.b;
        } else if (operation instanceof Substraction){
            Substraction sb = (Substraction) operation;
            sb.result = sb.a - sb.b;
        } else if (operation instanceof Multiplication){
            Multiplication ml = (Multiplication) operation;
            ml.result = ml.a * ml.b;
        } else if (operation instanceof Dividir){
            Dividir dv = (Dividir) operation;
            dv.result = dv.a / dv.b;
        }
    }

    public static void main(String[] args) throws Exception {

        Calculator  obj = new Calculator();

        Addition add = new Addition(10,5);
        obj.calculate(add);

        System.out.println("Resultado calculator: " +  add.result);

        Substraction sb = new Substraction(10,5);
        obj.calculate(sb);

        System.out.println("Resultado susbration " +  sb.result);

        Multiplication ml = new Multiplication(10,5);
        obj.calculate(ml);

        System.out.println("Resultado multiplication " +  ml.result);

        Dividir dv = new Dividir(10,5);
        obj.calculate(dv);

        System.out.println("Resultado division " +  dv.result);
    }
   */	
	 
	 public void calculadora (Calcular calcular) {
		 calcular.calculator();
	 }
	 
	 public static void main(String[] args) throws Exception {
		 
		 double a = 25;
		 double b = 5;
		 
		 //DIVISION
		 Dividir division = new Dividir (a , b);
		 division.calculator();
		 System.out.println("La division es " + a + " / " + b + " = " + division.result);
		 
		 //MULTIPLICACION
		 Multiplication multiplicacion = new Multiplication (a , b);
		 multiplicacion.calculator();
		 System.out.println("La multiplicacion es " + a + " x " + b + " = " + multiplicacion.result);
		 
		 //SUMA
		 Addition suma = new Addition (a , b);
		 suma.calculator();
		 System.out.println("La suma es " + a + " + " + b + " = " + suma.result);
		 
		 //resta
		 Substraction resta = new Substraction (a , b);
		 resta.calculator();
		 System.out.println("La resta es " + a + " - " + b + " = " + resta.result);
		 
		 
		 
		 
	 }

}