package br.sceweb.data_builder;

import br.sceweb.servico.ConfiguraDB;

public class ObtemConfiguraDB {
      public static ConfiguraDB configuracaoFIP(){
    	
    	String url = "jdbc:mysql://localhost/sceweb";
  		String driver = "com.mysql.jdbc.Driver";
  		String usuario = "root";
  		String senha = "";
  		return new ConfiguraDB(url, driver,usuario,senha);
      }
      public static ConfiguraDB configuracaoFZL(){
      	
      	String url = "jdbc:mysql://localhost/sceweb";
    		String driver = "com.mysql.jdbc.Driver";
    		String usuario = "root";
    		String senha = "alunoFatec";
    		return new ConfiguraDB(url, driver,usuario,senha);
        }
}
