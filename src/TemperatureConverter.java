public class TemperatureConverter {
    double Fahrenheit = 23.5;
     double Celsius = 33.3;

    static void getFahrenheit()
    {
        TemperatureConverter tempCon = new TemperatureConverter();

        tempCon.Celsius = (tempCon.Fahrenheit - 32) * 5/9;
        tempCon.Fahrenheit = ((tempCon.Celsius * 9/5)+32);
        System.out.println("Fahrenheit: "+ tempCon.Fahrenheit );
        System.out.println("Celcuis: " + tempCon.Celsius);
        System.out.println();
    }
}
