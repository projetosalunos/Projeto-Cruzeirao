package cruzeirao.models;

import java.util.ArrayList;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import cruzeirao.data.enums.TipoDocumento;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="PREPARADOR_FISICO")
@PrimaryKeyJoinColumn(name="ID", referencedColumnName="ID")
public class PreparadorFisico extends Usuario {
	
	private ArrayList<Inscrito> inscricaoEmCampeonatos;

	public PreparadorFisico() {
		this.setTipoDocumento(TipoDocumento.CREF);
	}

	// GETS AND SETS
	/*
	 * Objetivo: n�o permitir que o usu�rio possa alterar o tipo de documento quando ele for preparador f�sico
	 * A prefer�ncia � que para esse usu�rio o tipo de documento seja uma caixa de sele��o inativa (sem intera��o)
	 * Qualquer solu��o melhor falar com @RafaelSantana
	 */
	@Override
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		
	}
	
	@OneToMany(mappedBy="inscrito")
	public ArrayList<Inscrito> getInscricaoEmCampeonatos() {
		return inscricaoEmCampeonatos;
	}
	public void setInscricaoEmCampeonatos(ArrayList<Inscrito> inscricoes) {
		this.inscricaoEmCampeonatos = inscricoes;
	}
}