#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.ws.rs.core.Application;
import java.util.LinkedHashSet;
import java.util.Set;
import ${package}.resources.Echo;

public class ResourceLoader extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return new LinkedHashSet<Class<?>>() {{
            add(Echo.class);
        }};
    }
}
