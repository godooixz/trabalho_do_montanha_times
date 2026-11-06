using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        List<string> times = new List<string> { "Atlético-MG", "Cruzeiro", "América-MG", "Villa Nova" };

        Console.WriteLine("=== 4 TIMES ===");
        GerarTabelas(times);

        times.Add("Tombense");

        Console.WriteLine("\n=== 5 TIMES ===");
        GerarTabelas(times);
    }

    static void GerarTabelas(List<string> times)
    {
        Console.WriteLine("\nTimes:");
        for (int i = 0; i < times.Count; i++)
        {
            Console.WriteLine($"[{i}] {times[i]}");
        }

        Console.WriteLine("\nIda e Volta:");
        int totalIdaEVolta = 0;
        for (int i = 0; i < times.Count; i++)
        {
            for (int j = 0; j < times.Count; j++)
            {
                if (i != j)
                {
                    totalIdaEVolta++;
                    Console.WriteLine($"Jogo {totalIdaEVolta}: {times[i]} x {times[j]}");
                }
            }
        }
        Console.WriteLine($"Total (Ida e Volta): {totalIdaEVolta}");

        Console.WriteLine("\nTurno Único:");
        int totalTurnoUnico = 0;
        for (int i = 0; i < times.Count; i++)
        {
            for (int j = i + 1; j < times.Count; j++)
            {
                totalTurnoUnico++;
                Console.WriteLine($"Jogo {totalTurnoUnico}: {times[i]} x {times[j]}");
            }
        }
        Console.WriteLine($"Total (Turno Único): {totalTurnoUnico}");
    }
}