package org.serratec.trabalho.trabalhoIndividual.domain;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public class Endereco {

	@NotBlank(message = "Rua é obrigatoria!")
	@Column
	private String rua;
	
	@NotBlank(message = "Cidade é obrigatoria!")
	@Column
	private String cidade;
	
	@NotBlank(message = "Estado é obrigatorio!")
	@Column
	private String estado;
	
	@NotBlank(message = "Cep é obrigatorio!")
	@Column
	private String cep;
	
	public Endereco() {
	}
	
	public Endereco(String rua, String cidade, String estado, String cep) {
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cep, cidade, estado, rua);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(cep, other.cep) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(estado, other.estado) && Objects.equals(rua, other.rua);
	}
		
}
