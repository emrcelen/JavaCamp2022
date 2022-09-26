public class FourTransactions {
    public int plus (int ...values){
        int returnValue = 0;
        for (int value:values)
            returnValue += value;
        return returnValue;
    }
    public int minus (int ...values){
        int returnValue = 0;
        for (int value:values)
            returnValue -= value;
        return returnValue;
    }
    public int multiply (int ...values){
        int returnValue = 1;
        for (int value:values)
            returnValue *= value;
        return returnValue;
    }
}
