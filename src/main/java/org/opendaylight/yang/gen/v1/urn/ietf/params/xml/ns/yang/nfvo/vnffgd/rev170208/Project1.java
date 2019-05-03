package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.rw.project.rev150910.Project;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

public interface Project1
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog</code> <code>vnffgdCatalog</code>, or <code>null</code> if not present
     */
    @Nullable
    VnffgdCatalog getVnffgdCatalog();

}

