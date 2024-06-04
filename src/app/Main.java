package app;

public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();

        String namesOutput;
        String salesOutput;

        namesOutput = dataHandler.handleData(provider.getProductNames());
        getOutput("Products name: " + namesOutput);


        salesOutput = dataHandler.handleData(provider.getSalesAmounts());
        getOutput("Sales, USD: " + salesOutput);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}

