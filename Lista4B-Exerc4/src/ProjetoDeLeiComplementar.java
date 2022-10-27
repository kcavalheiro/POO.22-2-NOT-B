

import java.time.LocalDate;


	public class ProjetoDeLeiComplementar extends ProjetoDeLei {
		private int artigoLO;
		private int qtdVotosFavoraveis;
		
		public ProjetoDeLeiComplementar(String titulo, LocalDate dataApresentacao, LocalDate dataAprovacao, int artigoLO, int qtdVotosFavoraveis) {
			super(titulo, dataApresentacao, dataAprovacao);
			setArtigoLO(artigoLO);
			setQtdVotosFavoraveis(qtdVotosFavoraveis);
		}
		
		public void setArtigoLO(int artigo) {
			if (artigo > 0) {
				this.artigoLO = artigo;
			} else {
				throw new IllegalArgumentException("O Artigo da Lei Orgânica precisa ser maior que 0.");
			}
		}
		
		public int getArtigoLO() {
			return artigoLO;
		}
		
		public void setQtdVotosFavoraveis(int qtdVotos) {
			if (qtdVotos >= 0) {
				this.qtdVotosFavoraveis = qtdVotos;
			} else {
				throw new IllegalArgumentException("A quantidade precisa ser maior que 0");
			}
		}
		
		public int getQtdVotosFavoraveis() {
			return qtdVotosFavoraveis;
		}
		
		public String mostrar() {
			return "Projeto de Lei Complementar:" + "\nTitulo: " + this.getTitulo() + "\nNumero do projeto: " + this.getNumeroProjeto() + "\nData de apresentação: " + 
					this.getDataApresentacao() + "\nData de aprovação: " + this.getDataAprovacao() + "\nArtigo da Lei Orgânica: " + this.artigoLO + 
					"\nQuantidade de votos favoráveis: " + this.qtdVotosFavoraveis; 
		}
		
	

}
