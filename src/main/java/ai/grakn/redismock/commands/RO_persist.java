package ai.grakn.redismock.commands;

import ai.grakn.redismock.RedisBase;
import ai.grakn.redismock.Response;
import ai.grakn.redismock.Slice;

import java.util.List;

class RO_persist extends AbstractRedisOperation {
    RO_persist(RedisBase base, List<Slice> params) {
        super(base, params, 1, null, null);
    }

    public RO_persist(RedisBase base, List<Slice> params, Integer i) {
        super(base, params, i, null, null);
    }

    Slice response() {
        return Response.integer(base().setTTL(params().get(0), -1L));
    }
}
