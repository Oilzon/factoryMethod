package br.ufpb.dcx.factory;

public class ServicosFactory {
	
	public Servicos gerarServico(String servico) {
		if (servico == "" || servico == null) {
			return null;
		}
		
		if(servico.toUpperCase().equals("RENOVACAO")) {
			return new Renovacao();
		}else if(servico.toUpperCase().equals("VISTORIA")) {
			return new Vistoria();
		}else if(servico.toUpperCase().equals("LICENCIAMENTO")) {
			return new Licenciamento();
		}
		
		return null;
		
	}

}
