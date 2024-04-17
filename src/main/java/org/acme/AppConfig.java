package org.acme;

import io.quarkus.runtime.annotations.StaticInitSafe;
import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "foo")
@StaticInitSafe
public interface AppConfig {

    String bar();

}
