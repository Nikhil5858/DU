using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ifelseloop
{
    class Program
    {
        public void checkpositive(int num)
        {
            if (num >= 0)
            {
                Console.WriteLine(num + " Number is Positive");
            }
            else
            {
                Console.WriteLine(num + " Number is Negative!");
            }
        }
        public void checkoddeven(int num)
        {
            if (num % 2 == 0)
            {
                Console.WriteLine(num + " Number is Even");
            }
            else
            {
                Console.WriteLine(num + " Number is Odd!");
            }
        }
        public void whileloop(int num)
        {
            int i = 0;
            while (i<=num)
            {
                i = i +1;
                Console.WriteLine(i);
            }
        }
        public void forloop(int num)
        {
            for (int i = 0; i < num; i++)
            {
                Console.WriteLine(num);
            }
        }

        static void Main(string[] args)
        {
            int num;
            //Console.WriteLine("Enter number : ");
            //num = Convert.ToInt32(Console.ReadLine());
            Program c = new Program();
            //c.checkpositive(num);
            //c.checkoddeven(num);

            //Console.WriteLine("Enter while loop Value : ");
            //num = Convert.ToInt32(Console.ReadLine());
            //c.whileloop(num);

            Console.WriteLine("Enter Foor loop Value : ");
            num = Convert.ToInt32(Console.ReadLine());
            c.forloop(num);

        }
    }
}
