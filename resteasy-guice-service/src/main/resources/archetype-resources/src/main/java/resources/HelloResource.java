#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.resources;

import com.google.inject.Inject;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import ${package}.greeter.Greeter;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@Path("/hello")
public class HelloResource {

    private final Greeter greeter;

    @Inject
    public HelloResource(final Greeter greeter) {
        this.greeter = greeter;
    }

    @GET
    @Path("/{name}")
    @Produces(TEXT_PLAIN)
    public String hello(@PathParam("name") final String name) {
        return greeter.greet(name);
    }
}
