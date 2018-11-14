package ratpack.example.core;

import ratpack.handling.Context;
import ratpack.handling.Handler;
import ratpack.http.HttpMethod;

public class RoutingUtil {
    private static final String HTTP_METHOD_OVERRIDE_HEADER = "X-HTTP-METHOD-OVERRIDE";

    /**
     * Adds a route for supporting the X-HTTP-METHOD-OVERRIDE header.
     *
     * @param ctx ratpack context
     * @param methodToOverride http method that is being overriden
     * @param handler handler to route requests
     */
    public static void methodOverride(Context ctx, HttpMethod methodToOverride, Handler handler) {
        if (ctx.getRequest().getMethod() == methodToOverride) {
            // No override needed
            ctx.insert(handler);
        } else if (ctx.getRequest().getHeaders().contains(HTTP_METHOD_OVERRIDE_HEADER)) {
            // Only allow overrides on post requests
            if (ctx.getRequest().getMethod() == HttpMethod.POST) {
                if (HttpMethod.of(ctx.getRequest().getHeaders().get(HTTP_METHOD_OVERRIDE_HEADER)) == methodToOverride) {
                    ctx.insert(handler);
                } else {
                    ctx.next();
                }
            } else {
                ctx.next();
            }
        } else {
            ctx.next();
        }
    }
}
