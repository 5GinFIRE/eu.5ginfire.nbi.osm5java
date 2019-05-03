package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.rw.project.rev150910.Project;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.KeyPair;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

public interface Project1
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * Used to configure the list of public keys to be injected as partof ns 
     * instantiation
     *
     *
     *
     * @return <code>java.util.List</code> <code>keyPair</code>, or <code>null</code> if not present
     */
    @Nullable
    List<KeyPair> getKeyPair();

}

