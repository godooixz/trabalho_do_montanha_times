fn main() {
    let mut times: Vec<String> = vec![
        String::from("Atlético-MG"),
        String::from("Cruzeiro"),
        String::from("América-MG"),
        String::from("Villa Nova"),
    ];

    println!("=== 4 TIMES ===");
    gerar_tabelas(&times);

    times.push(String::from("Tombense"));

    println!("\n=== 5 TIMES ===");
    gerar_tabelas(&times);
}

fn gerar_tabelas(times: &Vec<String>) {
    println!("\nTimes:");
    for (i, time) in times.iter().enumerate() {
        println!("[{}] {}", i, time);
    }

    println!("\nIda e Volta:");
    let mut total_ida_volta = 0;
    for i in 0..times.len() {
        for j in 0..times.len() {
            if i != j {
                total_ida_volta += 1;
                println!("Jogo {}: {} x {}", total_ida_volta, times[i], times[j]);
            }
        }
    }
    println!("Total (Ida e Volta): {}", total_ida_volta);

    println!("\nTurno Único:");
    let mut total_turno_unico = 0;
    for i in 0..times.len() {
        for j in (i + 1)..times.len() {
            total_turno_unico += 1;
            println!("Jogo {}: {} x {}", total_turno_unico, times[i], times[j]);
        }
    }
    println!("Total (Turno Único): {}", total_turno_unico);
}
