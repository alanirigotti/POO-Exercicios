package ListaAurélio_Exe01;

public class AlunoPosGraduacao extends Aluno {
	
	private int pontosPoscomp;
	
	public AlunoPosGraduacao(String nome, String curso, int pontosPoscomp) {
		super(nome, curso);
		this.setPontosPoscomp(pontosPoscomp);
	}
	
	public String exibirDados() {
		return "O(a) aluno(a) "+getNome()+" está fazendo a graduação "+getCurso()+ " e tem "+getPontosPoscomp()+
				" pontos na prova POSCOMP";
	}

	public int getPontosPoscomp() {
		return pontosPoscomp;
	}

	public void setPontosPoscomp(int pontosPoscomp) {
		this.pontosPoscomp = pontosPoscomp;
	}
	
	

}
