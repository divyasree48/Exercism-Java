class CalculatorConundrum 
{
    public String calculate(int operand1, int operand2, String operation) 
    {
       if(operation == "+")
           return Integer.toString(operand1) + " + " + Integer.toString(operand2) + " = " + Integer.toString(operand1 + operand2);

        if(operation == "*")
           return Integer.toString(operand1) + " * " + Integer.toString(operand2) + " = " + Integer.toString(operand1 * operand2);

        if(operation == "/")
        {
            if(operand2 == 0) throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
           return Integer.toString(operand1) + " / " + Integer.toString(operand2) + " = " + Integer.toString(operand1 / operand2);
        }

        if(operation == null)
            throw new IllegalArgumentException("Operation cannot be null");
        if(operation == "")
            throw new IllegalArgumentException("Operation cannot be empty");
        if(operation != "+" && operation != "*" && operation != "/")
            throw new IllegalOperationException("Operation '"+ operation+"' does not exist");
        return "Unknown Operator";
    }
}

