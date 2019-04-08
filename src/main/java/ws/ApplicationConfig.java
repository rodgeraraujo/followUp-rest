package ws;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * Created by Rodger on Apr 8, 2019 11:28:46 AM
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(service.AlunoResource.class);
        resources.add(service.ProfessorResource.class);
    }
    
}