package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivel;
	private Double baseSalario;
	
	private Departamento departamento;
	private List<ContratoHora> contratos = new ArrayList<>();
	
	public Trabalhador() {
		// TODO Auto-generated constructor stub
	}

	public Trabalhador(String nome, NivelTrabalhador nivel, Double baseSalario, Departamento departamento) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.baseSalario = baseSalario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}
	
	public void addContrato(ContratoHora contrato) {
		this.contratos.add(contrato);
	}
	
	public void removerContratos(ContratoHora contrato) {
		this.contratos.remove(contrato);
	}
	
	
	
	public double income(int ano, int mes) {
		double soma = this.getBaseSalario();
		
		Calendar cal = Calendar.getInstance();
		
		for (ContratoHora c : contratos) {
			cal.setTime(c.getDate());
			int cAno = cal.get(Calendar.YEAR);//pegando o ano e armazenando na variavel cAno, usando Calendar
			int cMes = 1 + cal.get(Calendar.MONTH);//pegando o mes e armazenando na variavel cmes
			//verificando ano e mes
			if (ano == cAno && mes == cMes) {
				soma += c.totalValor();
			}
		}
		return soma;
	}
	
	
}
