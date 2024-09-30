using System;

namespace CircleDemo
{
    class Program
    {
        public void Circle(double radius)
        {
            double area, circumference;
            area = 3.14 * radius * radius;
            circumference = 2 * 3.14 * radius;
            Console.WriteLine("Area of Circle: " + area);
            Console.WriteLine("Circumference of Circle: " + circumference);
        }
        public void fahren(double c)
        {
            double fah = ((9 * c) / 5) + 32;
            Console.WriteLine("Fahrenhit Value is "+fah);
        }

        static void Main(string[] args)
        {
            double radius;
            Console.WriteLine("Enter Radius: ");
            radius = Convert.ToDouble(Console.ReadLine());
            Program p = new Program();
            p.Circle(radius);

            Console.WriteLine("--------------------");

            Console.WriteLine("Enter Fahrenhit value : ");
            double c;
            c = Convert.ToDouble(Console.ReadLine());
            Program f = new Program();
            f.fahren(c);

        }
    }
}
