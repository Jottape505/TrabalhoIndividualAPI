package org.serratec.trabalho.trabalhoIndividual.domain;



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

	
		
}
