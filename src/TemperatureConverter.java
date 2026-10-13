public class TemperatureConverter {
    int Fahrenheit;
    int Celsius = 33;

    static void getFahrenheit()
    {
        TemperatureConverter tempCon = new TemperatureConverter();
        System.out.println("Fahrenheit =" +((tempCon.Celsius * 9/5)+32));
    }
}
