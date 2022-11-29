package ListaAur�lio_Exe01;

public class AlunoGraduacao extends Aluno {

	private int semestre;
	
	
	public AlunoGraduacao(String nome, String curso, int semestre) {
		super(nome, curso);
		this.setNome(nome);
		this.setCurso(curso);
		this.setSemestre(semestre);
		
	}
	
	public String exibirDados() {
		return "O(a) aluno(a) "+getNome()+ " cursa "+getCurso()+ " e est� no "+getSemestre()+ "� semestre.";	
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public int getSemestre() {
		return semestre;
	}

}
