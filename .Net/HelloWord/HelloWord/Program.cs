using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloWord
{
    class Calc
    {
        public void add(int a, int b)
        {
            Console.WriteLine($"Addition : {a + b}");
        }
        public void sub(int a, int b)
        {
            Console.WriteLine($"Substraction : {a - b}");
        }
        public void mul(int a, int b)
        {
            Console.WriteLine($"Multiplication : {a * b}");
        }
        public void div(int a, int b)
        {
            Console.WriteLine($"Divison : {a / b}");
        }

        public static void Main(string[] args)
        {
            int a, b;
            Console.WriteLine("Enter Two Number : ");
            a = Convert.ToInt32(Console.ReadLine());
            b = Convert.ToInt32(Console.ReadLine());

            Calc c = new Calc();
            c.add(a, b);
            c.sub(a, b);
            c.mul(a, b);
            c.div(a, b);
        }
    }
}
