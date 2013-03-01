#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@Path("/echo")
public class Echo {

    @GET
    @Path("/{message}")
    @Produces(TEXT_PLAIN)
    public String echo(@PathParam("message") String message) {
        return message;
    }
}
