#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.greeter;

public class DefaultGreeter implements Greeter {

    @Override
    public String greet(final String name) {
        return "Hello " + name;
    }
}
