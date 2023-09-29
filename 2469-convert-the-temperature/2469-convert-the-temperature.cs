public class Solution {
    public double[] ConvertTemperature(double celcius)
        {
            double[] answer = new double[2];
            double kelvin = celcius + 273.15;
            double fahrenheit = celcius * 1.80 + 32.00;
            answer[0] = kelvin;
            answer[1] = fahrenheit;

            return answer;
        }
}