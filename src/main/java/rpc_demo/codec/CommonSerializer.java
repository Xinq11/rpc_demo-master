package rpc_demo.codec;

import rpc_demo.codec.serializer.JsonSerializer;
import rpc_demo.codec.serializer.KryoSerializer;

public interface CommonSerializer {

    byte[] serialize(Object obj);
    Object deserialize(byte[] bytes, Class<?> clazz);
    int getCode();

    static CommonSerializer getByCode(int code) {
        switch (code) {
            case 0:
                return new KryoSerializer();
            case 1:
                return new JsonSerializer();
            default:
                return null;
        }
    }
}
