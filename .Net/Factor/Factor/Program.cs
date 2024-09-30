using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factor
{
    class Program
    {
        public void fact(int num)
        {
            for (int i = 1; i < num; i++)
            {
                if (num%i == 0)
                {
                    Console.WriteLine("Factors is " + i);
                }
            }
        }
        static void Main(string[] args)
        {
            int num;
            Console.WriteLine("Enter Number to Find Factor : ");
            num = Convert.ToInt32(Console.ReadLine());
            Program program = new Program();
            program.fact(num);
        }
    }
}
