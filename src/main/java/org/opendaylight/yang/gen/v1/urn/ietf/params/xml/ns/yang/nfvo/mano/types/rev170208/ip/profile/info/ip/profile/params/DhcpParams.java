package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params;
import java.lang.Boolean;
import java.lang.Long;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.IpProfileParams;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container dhcp-params {
 *   leaf enabled {
 *     type boolean;
 *     default true;
 *   }
 *   leaf start-address {
 *     type inet:ip-address;
 *   }
 *   leaf count {
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ip-profile-info/ip-profile-params/dhcp-params</i>
 * 
 * <p>To create instances of this class use {@link DhcpParamsBuilder}.
 * @see DhcpParamsBuilder
 *
 */
public interface DhcpParams
    extends
    ChildOf<IpProfileParams>,
    Augmentable<DhcpParams>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("dhcp-params");

    /**
     * This flag indicates if DHCP is enabled or not
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enabled</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isEnabled();
    
    /**
     * Start IP address of the IP-Address range associated with DHCP domain
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>startAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getStartAddress();
    
    /**
     * Size of the DHCP pool associated with DHCP domain
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>count</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getCount();

}
