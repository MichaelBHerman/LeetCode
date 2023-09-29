public class Solution {
    public double[] ConvertTemperature(double celcius)
        {
            double kelvin = celcius + 273.15;
            double fahrenheit = celcius * 1.80 + 32.00;
            return new double[] {kelvin, fahrenheit};
        }
}