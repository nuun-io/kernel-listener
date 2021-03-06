Kernel-listener [![Build status](https://travis-ci.org/nuun-io/kernel-listener.svg?branch=master)](https://travis-ci.org/nuun-io/kernel-listener)
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
    public void kernelInitializing() {
        ...
    }

    @Override
    public void kernelInitialized() {
        ...
    }

    @Override
    public void kernelStarting() {
        ...
    }

    @Override
    public void kernelStarted() {
        ...
    }

    @Override
    public void kernelStopping() {
        ...
    }

    @Override
    public void kernelStopped() {
        ...
    }
}
```
