package br.com.testemaven;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {
	
	Result result;
	
	public IndexController(Result result) {
		this.result = result;
	}
	
	@Path("/")
	public void index() {
		result.include("teste", "parametro");
	}

}
