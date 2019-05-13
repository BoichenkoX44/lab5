public class part1 {
    public static float areaParallelogram (float a, float h)
    {
        return a  * h ;
    }


    public static float perimeterParallelogram (float a, float b)
    {
        return (a + b ) * 2;
    }



    // Driver function
    public static void main(String args[])
    {


        float a = 15;
        float b = 5;
        float c = 15;
        float d = 5;
        float h = 4;

        // Printing value of  area.
        System.out.print("Area Of Parallelogram : ");
        System.out.println(areaParallelogram (a, h));

        // Printing value of  Perimeter.
        System.out.print("Perimeter Of Parallelogram: ");
        System.out.println(perimeterParallelogram (a, b));
    }



}
