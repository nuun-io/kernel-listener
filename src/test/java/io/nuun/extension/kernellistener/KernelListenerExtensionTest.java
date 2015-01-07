package io.nuun.extension.kernellistener;

import io.nuun.kernel.api.Kernel;
import io.nuun.kernel.tests.it.NuunITRunner;
import io.nuun.kernel.tests.it.annotations.WithParams;
import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Pierre Thirouin <pierre.thirouin@ext.mpsa.com>
 *         06/01/2015
 */
@WithParams({Kernel.NUUN_ROOT_PACKAGE, "io.nuun"})
@RunWith(NuunITRunner.class)
public class KernelListenerExtensionTest {

    @Test
    public void steps_until_started_should_have_been_handled() {
        Assertions.assertThat(MyExtendedPlugin.count).isEqualTo(1111);
    }
}
