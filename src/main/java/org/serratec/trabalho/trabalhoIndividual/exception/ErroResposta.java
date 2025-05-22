package org.serratec.trabalho.trabalhoIndividual.exception;


import java.time.LocalDateTime;
import java.util.Objects;

public class ErroResposta {
	
	private LocalDateTime timestamp;
	private int status;
	private String erro;
	private String caminho;
	
	public ErroResposta(LocalDateTime timestamp, int status, String erro, String caminho) {
        this.timestamp = timestamp;
        this.status = status;
        this.erro = erro;
        this.caminho = caminho;
    }

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	@Override
	public int hashCode() {
		return Objects.hash(caminho, erro, status, timestamp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErroResposta other = (ErroResposta) obj;
		return Objects.equals(caminho, other.caminho) && Objects.equals(erro, other.erro) && status == other.status
				&& Objects.equals(timestamp, other.timestamp);
	}
	
	
	
}
