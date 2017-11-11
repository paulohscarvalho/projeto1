package br.sceweb.data_builder;

import br.sceweb.model.Empresa;

public class ObtemEmpresa {
	
	public static Empresa comDadosValidos(){
		Empresa empresa = new Empresa();
		empresa.setNomeDaEmpresa("Empresa JS");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("Open Informatica");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("2222");
		return empresa;
	}
	public static Empresa comCNPJ_invalido(){
		Empresa empresa = comDadosValidos();
		empresa.setCnpj("8942423200018");
		return empresa;
	}
}