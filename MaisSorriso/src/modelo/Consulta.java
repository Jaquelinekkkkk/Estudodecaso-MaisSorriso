package modelo;

import java.time.LocalDateTime;


public class Consulta{
	
	private String dentista;
	private String cliente;
	private double precoConsulta;
	private String tipoConsulta;
	private String dataHora;
	private int codigo;
	
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void setPrecoConsulta(float precoConsulta) {
		this.precoConsulta = precoConsulta;
	}
	public String getDentista() {
		return dentista;
	}
	public void setDentista(String dentitsa) {
		this.dentista = dentitsa;
	}
	public double getPrecoConsulta() {
		return precoConsulta;
	}
	public void setPrecoConsulta(double precoConsulta) {
		this.precoConsulta = precoConsulta;
	}
	public String getTipoConsulta() {
		return tipoConsulta;
	}
	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	


}
