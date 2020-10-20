package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.ContratoHora;
import entidades.Departamento;
import entidades.Trabalhador;
import entidades.enums.NivelTrabalhador;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("entre com o nome do departamento: ");
        String depNome = sc.nextLine();

        System.out.println("entre com os dados do trabalhador");
        System.out.print("nome: ");
        String nomeTrabalhador = sc.nextLine();
        
        System.out.print("Nível: ");
		String nivelTrabalhador = sc.nextLine();
		
        System.out.print("Base salarial: ");
        double baseSalario = sc.nextDouble();
        
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), baseSalario,
        											new Departamento(depNome));
        
        System.out.print("quantos contratos esse trabalahdor vai ter: ");
        int numCont = sc.nextInt();
        
        for (int i = 0; i < numCont; i++) {
			System.out.println("Entre com os dados do contrato #"+(i+1));
			System.out.print("Data (DD/MM/AAAA): ");
			Date contDate = sdf.parse(sc.next());
			
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			
			System.out.print("Duração do contrato: ");
			int horas = sc.nextInt();
			
			//instanciando um contrato
			ContratoHora contrato = new ContratoHora(contDate, valorHora, horas);
			
			//add um contra ao trabalhador
			trabalhador.addContrato(contrato);
		}
        System.out.println();
        System.out.println("Entre com o ano a ser calculado income( MM/YYYY): ");
        String mesEano = sc.next();
        int mes = Integer.parseInt(mesEano.substring(0, 2));
        int ano = Integer.parseInt(mesEano.substring(3));
        
        System.out.println("Nome: "+trabalhador.getNome());
        System.out.println("Departamento: "+trabalhador.getDepartamento().getNome());
        System.out.println("icome nesse mes e ano: "+mesEano+": "+String.format("%.2f", trabalhador.income(ano, mes)));
	}

}
