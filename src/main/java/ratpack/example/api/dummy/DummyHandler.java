package ratpack.example.api.dummy;

import ratpack.handling.Context;
import ratpack.handling.Handler;

public class DummyHandler implements Handler {

    @Override
    public void handle(Context ctx) throws Exception {
        ctx.render("Dummy Endpoint!");
    }
}
