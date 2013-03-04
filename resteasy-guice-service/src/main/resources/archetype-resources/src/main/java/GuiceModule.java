#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.google.inject.AbstractModule;
import ${package}.greeter.DefaultGreeter;
import ${package}.greeter.Greeter;
import ${package}.resources.EchoResource;
import ${package}.resources.HelloResource;

public class GuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(EchoResource.class);
        bind(HelloResource.class);
        bind(Greeter.class).to(DefaultGreeter.class);
    }
}
