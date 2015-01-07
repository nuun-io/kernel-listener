package io.nuun.extension.kernellistener;

import io.nuun.kernel.core.AbstractPlugin;

/**
 * @author Pierre Thirouin <pierre.thirouin@ext.mpsa.com>
 *         06/01/2015
 */
public class MyExtendedPlugin extends AbstractPlugin implements KernelListener {

    static int count = 0;

    @Override
    public String name() {
        return "my-extended-plugin";
    }

    @Override
    public void initializing() {
        count += 1;
    }

    @Override
    public void initialized() {
        count += 10;
    }

    @Override
    public void starting() {
        count += 100;
    }

    @Override
    public void started() {
        count += 1000;
    }

    @Override
    public void stopping() {
        count += 10000;
    }

    @Override
    public void stopped() {
        count += 100000;
    }
}
