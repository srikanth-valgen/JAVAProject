

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/{operation}/{a},{b}")
public class Restapi {
	@GET
	public String addsub(@PathParam("operation")String op,@PathParam("a") int a1,@PathParam("b") int b1) {
		int c;
		if(op=="add") {
			c=a1+b1;
		}
	else if(op=="sub") {
			
			c=a1-b1;
		}
		return("restult is" +c);
	}
}
