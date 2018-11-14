package ratpack.example.api;

import com.google.inject.AbstractModule;
import ratpack.example.api.dummy.DummyHandler;

public class ApiModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ApiHandlers.class);

        // Handlers
        bind(DummyHandler.class);
    }
}
