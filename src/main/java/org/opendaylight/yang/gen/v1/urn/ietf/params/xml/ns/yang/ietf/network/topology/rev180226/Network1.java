package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev180226;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev180226.networks.Network;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev180226.networks.network.Link;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

public interface Network1
    extends
    DataObject,
    Augmentation<Network>
{




    /**
     * A network link connects a local (source) node anda remote (destination) node via
     * a set of the respectivenode's termination points. It is possible to have 
     * severallinks between the same source and destination nodes.Likewise, a link 
     * could potentially be re-homed betweentermination points. Therefore, in order to 
     * ensure that wewould always know to distinguish between links, every linkis 
     * identified by a dedicated link identifier. Note that alink models a 
     * point-to-point link, not a multipoint link.
     *
     *
     *
     * @return <code>java.util.List</code> <code>link</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Link> getLink();

}

