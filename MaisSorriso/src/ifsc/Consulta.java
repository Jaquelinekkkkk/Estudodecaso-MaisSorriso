package ifsc;

import java.time.LocalDateTime;

public class Consulta {
	
	private String dentitsa;
	private String auxiliar;
	private float precoConsulta;
	private String tipoConsulta;
	private LocalDateTime dataHora;
	
	public String getDentitsa() {
		return dentitsa;
	}
	public void setDentitsa(String dentitsa) {
		this.dentitsa = dentitsa;
	}
	public String getAuxiliar() {
		return auxiliar;
	}
	public void setAuxiliar(String auxiliar) {
		this.auxiliar = auxiliar;
	}
	public double getPrecoConsulta() {
		return precoConsulta;
	}
	public void setPrecoConsulta(int precoConsulta) {
		this.precoConsulta = precoConsulta;
	}
	public String getTipoConsulta() {
		return tipoConsulta;
	}
	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	


}
