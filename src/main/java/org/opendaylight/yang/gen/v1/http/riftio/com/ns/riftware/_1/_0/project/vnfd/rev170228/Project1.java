package org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.vnfd.rev170228;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.vnfd.rev170228.project.VnfdCatalog;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.rw.project.rev150910.Project;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

public interface Project1
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * Virtual Network Function Descriptor (VNFD).
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.vnfd.rev170228.project.VnfdCatalog</code> <code>vnfdCatalog</code>, or <code>null</code> if not present
     */
    @Nullable
    VnfdCatalog getVnfdCatalog();

}

