package osm5.ns.yang.nfvo.nsi.rev180928.nsi;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.yang.types.rev130715.Uuid;
import osm5.ns.yang.nfvo.nsi.rev180928.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsi.rev180928.Nsi$G;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsi</b>
 * <pre>
 * list vlr-list {
 *   config false;
 *   key id;
 *   leaf id {
 *     config false;
 *     type yang:uuid;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsi/nsi/vlr-list</i>
 * 
 * <p>To create instances of this class use {@link VlrListBuilder}.
 * @see VlrListBuilder
 * @see VlrListKey
 *
 */
public interface VlrList
    extends
    ChildOf<Nsi$G>,
    Augmentable<VlrList>,
    Identifiable<VlrListKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vlr-list");

    /**
     * ID of instantiated VLR
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getId();
    
    @Override
    VlrListKey key();

}

