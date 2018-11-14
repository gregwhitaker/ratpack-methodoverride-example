package ratpack.example.api;

import ratpack.example.api.dummy.DummyHandler;
import ratpack.example.core.RoutingUtil;
import ratpack.func.Action;
import ratpack.handling.Chain;
import ratpack.http.HttpMethod;

public class ApiHandlers implements Action<Chain> {

    @Override
    public void execute(Chain chain) throws Exception {
        chain.path("api/v1/dummy", ctx -> {
            RoutingUtil.methodOverride(ctx, HttpMethod.PATCH, new DummyHandler());
        });
    }
}
