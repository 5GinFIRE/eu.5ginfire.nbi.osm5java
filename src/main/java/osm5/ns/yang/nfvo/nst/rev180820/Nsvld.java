package osm5.ns.yang.nfvo.nst.rev180820;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.nsd.base.rev170228.VldCommon;
import osm5.ns.yang.nfvo.nst.rev180820.nsvld.NssConnectionPointRef;

/**
 * List of NetSlice Subnet Virtual Link Descriptors.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping nsvld {
 *   uses nsd-base:vld-common;
 *   list nss-connection-point-ref {
 *     key "nss-ref nsd-connection-point-ref";
 *     leaf nss-ref {
 *       type leafref {
 *         path /nst:nst/nst:netslice-subnet/nst:id;
 *       }
 *     }
 *     leaf nsd-connection-point-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *       }
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/nsvld</i>
 *
 */
public interface Nsvld
    extends
    DataObject,
    VldCommon
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsvld");

    /**
     * A list of references to connection points.
     *
     *
     *
     * @return <code>java.util.List</code> <code>nssConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NssConnectionPointRef> getNssConnectionPointRef();

}

