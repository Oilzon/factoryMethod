package br.ufpb.dcx.factory;

public class MainTeste {

	public static void main(String[] args) {
		
		ServicosFactory tipoServ = new ServicosFactory();
		
		Servicos serv = tipoServ.gerarServico("renovacao");
		serv.criarServico();
		System.out.println();
		
		serv = tipoServ.gerarServico("vistoria");
		serv.criarServico();
		System.out.println();
		
		serv = tipoServ.gerarServico("licenciamento");
		serv.criarServico();
		System.out.println();

	}

}
