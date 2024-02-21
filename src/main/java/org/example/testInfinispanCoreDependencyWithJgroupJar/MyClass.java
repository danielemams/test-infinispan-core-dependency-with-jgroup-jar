package org.example.testInfinispanCoreDependencyWithJgroupJar;

import java.net.URL;
import java.nio.ByteBuffer;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.Optional;

public class MyClass  {

    public static Optional<String> extractVersion(final Class<?> referenceClass) {
        return Optional.ofNullable(referenceClass)
                .map(Class::getProtectionDomain)
                .map(ProtectionDomain::getCodeSource)
                .map(CodeSource::getLocation)
                .map(URL::getPath);
    }

    public static void execute() {
        ByteBuffer buffer = ByteBuffer.allocate(1);
        ByteBuffer clear = buffer.clear();
    }
}
