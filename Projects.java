public class Projects {
	int id;
	String title;
	String proprietario;
	int calculo;
	String pronto;

	void  informProjects() {
		System.out.println("identificador---" + this.id);
		System.out.println("Título---" + this.title);
		System.out.println("Autor Projeto---" + this.proprietario);
		System.out.println("A Soma é =  " + this.calculo);
		System.out.println("O Projeto foi Concluido Com Sucesso" + this.pronto);
		System.out.println("");
		System.out.println("---------------------------");
		System.out.println("");
		
	}
}
