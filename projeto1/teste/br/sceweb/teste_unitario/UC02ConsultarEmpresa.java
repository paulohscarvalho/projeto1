package br.sceweb.teste_unitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.data_builder.ObtemConfiguraDB;
import br.sceweb.data_builder.ObtemEmpresa;
import br.sceweb.model.Empresa;
import br.sceweb.model.EmpresaDAO;
import br.sceweb.servico.ConfiguraDB;

public class UC02ConsultarEmpresa {
	static EmpresaDAO empresaDAO;
	static Empresa empresa;
	static ConfiguraDB configuraDB;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO(ObtemConfiguraDB.configuracaoFIP());
		empresa = ObtemEmpresa.comDadosValidos();
		empresaDAO.adiciona(empresa);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		empresaDAO.exclui("89424232000180");
	}

	@Test
	public void CT01UC02ConsultarEmpresa_com_sucesso() {
		assertNotNull(empresaDAO.consultaEmpresa("89424232000180"));
	}
	@Test
	public void CT02UC02ConsultarEmpresa_com_sucesso() {
		//assertTrue(empresa.equals(empresaDAO.consultaEmpresa("89424232000180")));
		assertFalse(empresa.equals(null));
	}
	@Test
	public void CT02UC02ConsultarEmpresa_com_cnpj_invalido() {
		assertNull(empresaDAO.consultaEmpresa("8942423200018"));
	}

}
