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
 * list nsr-ref-list {
 *   config false;
 *   key nsr-ref;
 *   leaf nsr-ref {
 *     config false;
 *     type leafref {
 *       path /rw-project:project/nsr:ns-instance-opdata/nsr:nsr/nsr:ns-instance-config-ref;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsi/nsi/nsr-ref-list</i>
 * 
 * <p>To create instances of this class use {@link NsrRefListBuilder}.
 * @see NsrRefListBuilder
 * @see NsrRefListKey
 *
 */
public interface NsrRefList
    extends
    ChildOf<Nsi$G>,
    Augmentable<NsrRefList>,
    Identifiable<NsrRefListKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsr-ref-list");

    /**
     * Reference to instantiated NSR
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>nsrRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getNsrRef();
    
    @Override
    NsrRefListKey key();

}

