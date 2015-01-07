Kernel-listener
===============

KernelListener is a kernel extension allowing plugins to listen kernel events.

## Integration

With Maven, add the following dependency to your pom.xml:

```xml
<dependency>
    <groupId>io.nuun</groupId>
    <artifactId>kernel-listener</artifactId>
    <version>???</version>
</dependency>
```

Where `???` is the current version of the extension.

## Usage

To make your plugin aware of the kernel life cycle, do it implement the `KernelListener` interface.

```java
public class MyExtendedPlugin extends AbstractPlugin implements KernelListener {

    @Override
    public String name() {
        return "my-extended-plugin";
    }

    @Override
    public void initializing() {
        ...
    }

    @Override
    public void initialized() {
        ...
    }

    @Override
    public void starting() {
        ...
    }

    @Override
    public void started() {
        ...
    }

    @Override
    public void stopping() {
        ...
    }

    @Override
    public void stopped() {
        ...
    }
}
```
